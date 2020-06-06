package com.wxt.reversi;

import com.wxt.reversi.controller.UserController;
import com.wxt.reversi.entity.queryEntity.UpdateUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ReversiApplicationTests {

    @Resource
    UserController userController;

    @Test
    void databaseCheck() {
        System.out.println(userController.changeUser("wxt"));
        UpdateUser updateUser = new UpdateUser();
        updateUser.name = "wxt";
        updateUser.ifWin = 0;
        updateUser.score = 33;
        System.out.println(userController.updateUser(updateUser));;

    }

}
