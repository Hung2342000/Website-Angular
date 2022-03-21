package com.example.backend.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Setter
@Getter
@Component
public class UserDto {
    private String nameUser;
    private String email;
    private String password;
}
