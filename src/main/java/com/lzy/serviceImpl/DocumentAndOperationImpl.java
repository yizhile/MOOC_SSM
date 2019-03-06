package com.lzy.serviceImpl;

import com.lzy.dao.DocumentDao;
import com.lzy.dao.OperationDao;
import com.lzy.domain.Document;
import com.lzy.domain.Operation;
import com.lzy.service.DocumentAndOperation;


public class DocumentAndOperationImpl implements DocumentAndOperation {
    private DocumentDao documentDao;
    private OperationDao operationDao;
    @Override
    public int addDocumentAndOperation(Document document, Operation operation) {
        documentDao.insertDocument(document);
        return operationDao.insertOperation(operation);
    }
}
