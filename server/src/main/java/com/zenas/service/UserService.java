package com.zenas.service;

import com.zenas.resource.User;

import java.util.Map;

public interface UserService {
    User getUser(long id);
    Map getUsers();
    int add();
    int edit();
    int del();
}
