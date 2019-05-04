package com.helloworld.dao.impl;

import com.helloworld.dao.HelloworldDao;
import org.springframework.stereotype.Repository;

/**
 * Created by 11023 on 2018/3/4.
 */
@Repository("helloworldDao")
public class HelloworldDaoImpl implements HelloworldDao {

    @Override
    public String getHelloworld() {
        return "hello world";
    }
}
