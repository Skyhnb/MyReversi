package com.wxt.reversi.service;

import com.wxt.reversi.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public void insertUser(String name){
        userMapper.insertUser(name);
    }

    public Map checkExist(String name){
        return userMapper.checkExist(name);
    }


    public void update(String name, int ifWin, int score){
        userMapper.updateUser(name, ifWin, score);
    }
}
