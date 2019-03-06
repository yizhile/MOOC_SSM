package com.lzy.service;

import com.lzy.domain.Document;
import com.lzy.domain.Operation;
import org.springframework.stereotype.Service;

@Service
public interface DocumentAndOperation {
    public abstract int addDocumentAndOperation(Document document, Operation operation);
}
