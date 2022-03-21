package com.example.backend.model;

import lombok.*;

import javax.persistence.*;
@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Setter
@Getter
@Table(name = "freelancer")
public class Freelancer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "nameFreelancer", nullable = false)
    private String nameFreelancer;

    @Column(name = "title", nullable = false)
    private String title;
}
