package com.wxt.reversi.controller;

import com.wxt.reversi.entity.queryEntity.UpdateUser;
import com.wxt.reversi.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping("/changeUser")
    public Map changeUser(@RequestBody String str){
        System.out.println("in changeUser");
        String name = str.replace("\"","");

        System.out.println(name);
        Map result = userService.checkExist(name);
        System.out.println(result);
        if (result == null){
            userService.insertUser(name);
            return userService.checkExist(name);
        }
        else {
            return result;
        }
    }

    @PostMapping("/updateUser")
    public Map updateUser(@RequestBody UpdateUser updateUser){
        System.out.println("in updateUser");
        userService.update(updateUser.name, updateUser.ifWin, updateUser.score);
        return userService.checkExist(updateUser.name);
    }
}
