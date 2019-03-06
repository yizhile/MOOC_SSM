package com.lzy.service;

import com.lzy.domain.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocumentService {
    public abstract List<Document> getAllDocuments();
    public abstract int removeDocumentById(Integer id);
    public abstract int removeDocumentBatch(Integer[] ids);
    public abstract List<Document> getAllDocumentByKey(String key);
    public abstract int addDocument(Document document);
}
