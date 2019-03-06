package com.lzy.action;

import com.lzy.dao.KindDao;
import com.lzy.domain.Document;
import com.lzy.domain.Kind;
import com.lzy.service.DocumentService;
import com.lzy.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.sql.Date;
import java.util.List;

@Controller
public class DocumentAction{

    @Autowired
    private DocumentService documentService;

    @Autowired
    private KindDao kindDao;

    @RequestMapping("allDocuments")
    @ResponseBody
    public List<Document> getAllDocuments(){
        List<Document> documents = documentService.getAllDocuments();
        return documents;
    }

    @RequestMapping("removeDocument")
    @ResponseBody
    public int removeDocument(Integer id){
        return documentService.removeDocumentById(id);
    }

    @RequestMapping("removeDocumentBatch")
    public void removeDocumentBatch(@RequestParam("ids") Integer[] ids){
        System.out.println(Arrays.toString(ids));
        documentService.removeDocumentBatch(ids);
    }

    @RequestMapping("getDocumentsByName")
    @ResponseBody
    public List<Document> getDocumentsByName(String key){
        return documentService.getAllDocumentByKey(key);
    }

    @RequestMapping(value = "addDocument",method = RequestMethod.POST)
    public String addDocument(String bigTypeId, String smallTypeId, String videosName, String GoodsNormalPrice, String GoodsIntroduce, @RequestParam("file")MultipartFile file){

        System.out.println(videosName);
        System.out.println(file);
        String targetPath = "D:/file";

        String filename = file.getOriginalFilename();

        String uuid = SpringUtil.getUUID();
        int lastIndex  = filename.lastIndexOf(".");
        String extName = filename.substring(lastIndex);

        StringBuffer uuidName = new StringBuffer(filename);
        uuidName.replace(lastIndex,filename.length(),uuid+extName);

        try {
            file.transferTo(new File(targetPath,filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Document document = new Document();

        document.setUrl(targetPath+"/"+uuidName);

        //添加时间
        document.setUploaddate(new Date(new java.util.Date().getTime()));

        document.setName(videosName);
        document.setKeyword(GoodsNormalPrice);
        document.setSummary(GoodsIntroduce);

        //添加类别的id
        Kind kind = new Kind();
        kind.setBigname(bigTypeId);
        kind.setSmallname(smallTypeId);
        kind = kindDao.selectKindByBigAngSmall(kind);
        document.setKindId(kind.getId());

        documentService.addDocument(document);

        return "redirect:/documentAdd.html";

    }
}
