package com.lzy.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class SpringUtil {
    private static ClassPathXmlApplicationContext applicationContext;
    static {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    public static ClassPathXmlApplicationContext getInstance(){
        return applicationContext;
    }

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
