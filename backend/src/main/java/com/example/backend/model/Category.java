package com.example.backend.model;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Setter
@Getter
@Table(name = "category")

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "nameCategory", nullable = false)
    private String nameCategory;

    @Column(name = "image", nullable = false)
    private String image;

}
