package com.wxt.reversi.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface UserMapper {

     Map checkExist(String name);

     void insertUser(String name);

     void updateUser(String name, int ifWin,  int score);



}
