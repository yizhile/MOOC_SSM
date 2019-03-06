package com.lzy.test;

import com.lzy.util.SpringUtil;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void fun01(){
        String filename = "春江.txt";

        String uuid = "dfajldtoijaldf";
        int lastIndex  = filename.lastIndexOf(".");
        String extName = filename.substring(lastIndex);

        StringBuffer stringBuffer = new StringBuffer(filename);

        stringBuffer.replace(lastIndex,filename.length(),uuid+extName);

        System.out.println(stringBuffer);
    }
}
