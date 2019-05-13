package com.composite.dubbo.interfaces.service;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<Map<String, Object>> getUserList(String userId);
}
