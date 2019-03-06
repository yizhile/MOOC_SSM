package com.lzy.serviceImpl;


import com.lzy.dao.KindDao;
import com.lzy.domain.Kind;
import com.lzy.service.KindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KindServiceImpl implements KindService {

    @Autowired
    private KindDao kindDao;
    @Override
    public List<Kind> getAllKinds() {
        return kindDao.selectAllKinds();
    }

}
