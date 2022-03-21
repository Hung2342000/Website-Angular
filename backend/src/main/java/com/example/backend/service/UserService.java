package com.example.backend.service;

import com.example.backend.dto.CategoryDto;
import com.example.backend.dto.UserDto;
import com.example.backend.mapper.UserMapper;
import com.example.backend.model.Category;
import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
 @Component
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    public List<UserDto> getList(){
        List<UserDto> userDtoList = new ArrayList<>();
        List<User> list = userRepository.findAll();
        for ( User user : list){
            UserDto userDto = userMapper.toDto(user);
            userDtoList.add(userDto);
        }
        return userDtoList;
    }
     public String postUser(UserDto userDto){
         User user = userRepository.findByName(userDto.getEmail());
         String test;
         if(user != null){
             test = "Đã tồn tại bản ghi";
         }
         else {
             User post = userMapper.toUser(userDto);
             userRepository.save(post);
             test ="Thêm thành công";
         }
         return test;
     }
}
