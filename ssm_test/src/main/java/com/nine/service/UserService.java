package com.nine.service;

import com.nine.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public List<User> selectUser();
    public int  addUser(User user);
    public int deleteUser(@Param("id") Integer id);
}
