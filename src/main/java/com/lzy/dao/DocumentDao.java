package com.lzy.dao;

import com.lzy.domain.Document;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DocumentDao {

    @Insert("insert into document(name,kindId,uploaduser,uploadtime,keyword,url,summary) values(#{name},#{kindId},#{uploaduser},#{uploaddate},#{keyword},#{url},#{summary})")
    public  int insertDocument(Document document);

    public  List<Document> selectAllDocuments();

    @Delete("delete from document where id = #{id}")
    public  int deleteDocument(Integer id);

    public  List<Document> selectDocumentsByName(String key);

    public int deleteDocumentBatch(Integer[] ids);
}
