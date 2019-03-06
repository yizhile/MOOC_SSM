package com.lzy.serviceImpl;

import com.lzy.dao.UserLoginDao;
import com.lzy.domain.UserLogin;
import com.lzy.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserLoginDao userLoginDao;
    @Override
    public UserLogin getUserLogin(UserLogin userLogin) {
        return userLoginDao.selectUserLogin(userLogin);
    }
}
