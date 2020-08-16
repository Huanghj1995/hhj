package com.nine.service.impl;

import com.nine.mapper.UserMapper;
import com.nine.pojo.User;
import com.nine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }
    
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
    
    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }
    
}
