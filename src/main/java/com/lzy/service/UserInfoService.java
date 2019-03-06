package com.lzy.service;

import com.lzy.domain.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserInfoService {
    public abstract UserInfo getUserInfoByUsername(String username);
}
