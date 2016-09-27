package com.weghst.sbvwe.resource;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@RequestMapping("/servers")
@RestController
public class ServerResource {

    @Value("${spring.application.name}")
    private String serverName;

    @RequestMapping("/info")
    public Object getInfo() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", serverName);
        return result;
    }

}
