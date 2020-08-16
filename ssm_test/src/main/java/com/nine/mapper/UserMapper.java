package com.nine.mapper;

import com.nine.pojo.User;

import java.util.List;

/**
 * @author JunhongLi
 * @date 2020/6/27 16:15
 */

public interface UserMapper {
    public List<User> selectUser();
    public int addUser(User user);
  int deleteUser(Integer id);
}