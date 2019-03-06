package com.lzy.action;


import com.lzy.domain.UserLogin;
import com.lzy.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller

public class UserLoginAction {

    @Autowired
    private UserLoginService userLoginService;


    @RequestMapping(value = "userLogin")
    public String getUserLogin(UserLogin userLogin){
        UserLogin user = userLoginService.getUserLogin(userLogin);

        //判断用户是否登录成功
        if(user!=null){
            //用户名信息添加到session域对象中，用于判断是否为登录状态
            //session.setAttribute("username",userResult.getUsername());

            return "true";
        }else {
             return "false";
        }
    }
}
