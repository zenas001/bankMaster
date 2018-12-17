package com.zenas.router;

import com.zenas.resource.User;
import com.zenas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/userServices")
    public User getUserInfo(){
        return service.getUser(1);
    }

}
