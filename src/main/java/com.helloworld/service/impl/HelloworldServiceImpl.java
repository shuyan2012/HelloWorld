package com.helloworld.service.impl;

import com.helloworld.dao.HelloworldDao;
import com.helloworld.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 11023 on 2018/3/4.
 */
@Service("helloworldService")
public class HelloworldServiceImpl implements HelloworldService{

    @Autowired
    private HelloworldDao helloworldDao;

    @Override
    public String getHelloworld() {
        return helloworldDao.getHelloworld();
    }
}
