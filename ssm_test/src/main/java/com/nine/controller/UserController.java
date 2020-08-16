package com.nine.controller;
import com.nine.pojo.User;
import com.nine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
  
  @Autowired
    UserService userService;
    
    @RequestMapping("select")
   public String selectUser(Model model){
        List<User> list=userService.selectUser();
        model.addAttribute("userList",list);
        return "/view/user";
   
        }
        
        @RequestMapping("add")
    public String addUser(User user){
        userService.addUser( user );
        return "redirect:select";
        
        }
        
        
        @RequestMapping("delete{id}")
        public String deleteUser(@PathVariable("id") Integer id){
            userService.deleteUser( id );
            return"redirect:select";
            }

}
    

    

