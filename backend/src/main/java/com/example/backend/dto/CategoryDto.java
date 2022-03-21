package com.example.backend.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Setter
@Getter
@Component

public class CategoryDto {
    private String nameCategory;
    private String image;
}
