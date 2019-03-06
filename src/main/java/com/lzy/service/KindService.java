package com.lzy.service;

import com.lzy.domain.Kind;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KindService {
    public abstract List<Kind> getAllKinds();
}
