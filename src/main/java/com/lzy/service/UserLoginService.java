package com.lzy.service;

import com.lzy.domain.UserLogin;
import org.springframework.stereotype.Service;

@Service
public interface UserLoginService {
    public abstract UserLogin getUserLogin(UserLogin userLogin);
}
