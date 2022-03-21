package com.example.backend.model;

import lombok.*;
import javax.persistence.*;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Setter
@Getter
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "nameSkill", nullable = false)
    private String nameSkill;

}
