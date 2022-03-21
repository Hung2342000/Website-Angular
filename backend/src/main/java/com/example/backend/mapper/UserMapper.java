package com.example.backend.mapper;

import com.example.backend.dto.UserDto;
import com.example.backend.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user){
        UserDto userdto = new UserDto();
        userdto.setNameUser(user.getNameUser());
        userdto.setEmail(user.getEmail());
        userdto.setPassword(user.getPassword());
        return userdto;
    }
    public User toUser(UserDto userdto){
        User user = new User();
        user.setNameUser(userdto.getNameUser());
        user.setEmail(userdto.getEmail());
        user.setPassword(userdto.getPassword());
        return user;
    }

}
