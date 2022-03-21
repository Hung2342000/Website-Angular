package com.example.backend.controller;

import com.example.backend.dto.UserDto;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserDto> toList(){
        return userService.getList();
    }
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public void post(@RequestBody UserDto userDto){
        userService.postUser(userDto);
    }

}
