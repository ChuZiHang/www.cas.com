package com.example.demo.manager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Q_先森 on 2017/12/7.
 */
public class UserManager {

    private static UserManager userManager = new UserManager();

    public static UserManager getIncetance() {
        return userManager;
    }

    private Map<String, String> users = new HashMap<>();

    private UserManager() {
        users.put("zhuhaihao", "123456");
        users.put("zhangjing", "654321");
        users.put("heige", "abc");
    }

    public String findUserByName(String name) {
        return users.get(name);
    }

    public void addUser(String username, String password) {
        users.put(username, password);
    }

}
