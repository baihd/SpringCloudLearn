package com.composite.dubbo.provider.service.impl;

import com.composite.dubbo.interfaces.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@com.alibaba.dubbo.config.annotation.Service
@Component
public class UserServiceImpl implements UserService {

    public List<Map<String, Object>> getUserList(String userId) {
        List<Map<String, Object>> mapList = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("name", userId);
        map.put("age", "15");
        mapList.add(map);
        return mapList;
    }
}
