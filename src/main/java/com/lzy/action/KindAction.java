package com.lzy.action;

import com.lzy.dao.KindDao;
import com.lzy.domain.Kind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class KindAction{
    @Autowired
    private KindDao kindDao;

    @RequestMapping("allKinds")
    @ResponseBody
    public List<Kind> getAllKinds(){
        return kindDao.selectAllKinds();
    }
}
