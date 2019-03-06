package com.lzy.serviceImpl;

import com.lzy.dao.DocumentDao;
import com.lzy.dao.UserInfoDao;
import com.lzy.domain.Document;
import com.lzy.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentDao documentDao;
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public List<Document> getAllDocuments() {
        return documentDao.selectAllDocuments();
    }

    @Override
    public int removeDocumentById(Integer id) {
        return documentDao.deleteDocument(id);
    }

    @Override
    public int removeDocumentBatch(Integer[] ids) {
        return documentDao.deleteDocumentBatch(ids);
    }

    @Override
    public List<Document> getAllDocumentByKey(String key) {
        return documentDao.selectDocumentsByName(key);
    }

}