package com.lzy.serviceImpl;


import com.lzy.dao.UserInfoDao;
import com.lzy.domain.UserInfo;
import com.lzy.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo getUserInfoByUsername(String username) {
        return userInfoDao.selectUserInfoByUsername(username);
    }


}
