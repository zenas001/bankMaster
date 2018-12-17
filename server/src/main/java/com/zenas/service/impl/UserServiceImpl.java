package com.zenas.service.impl;

import com.zenas.resource.User;
import com.zenas.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger_ = Logger.getLogger(UserServiceImpl.class);

    @Override
    public User getUser(long uid) {

        if (uid > 0) {
            System.out.print("2" + Thread.currentThread().getId() + Thread.currentThread().getName());
//            Iterator<Map.Entry<Long,Object>> iterator =users.entrySet().iterator();
//            while (iterator.hasNext()) {
//                Map.Entry<Long,Object> entry=iterator.next();
//                logger_.info(entry.getKey()+","+entry.getValue());
//            }
            //jdk8提供时间工具类

//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
//            String nowTime = LocalDateTime.now().format(formatter);
            User user=new User();
            user.setName("測試");
            user.setId(uid);
            return user;
        }
        return null;
    }

    @Override
    public Map getUsers() {
        Map users = new ConcurrentHashMap();
        for (int i = 0; i < 10000; i++) {
            User user = new User();
            user.setId(Long.valueOf(i));
            user.setName("man " + i);
            users.put(i, user);
        }
        logger_.info("current thread:" + Thread.currentThread().getId());
        return users;
    }

    @Override
    public int add() {
        return 0;
    }

    @Override
    public int edit() {
        return 0;
    }

    @Override
    public int del() {
        return 0;
    }
}
