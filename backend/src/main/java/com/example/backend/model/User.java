package com.example.backend.model;
import lombok.*;
import javax.persistence.*;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Setter
@Getter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "nameUser", nullable = false)
    private String nameUser;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
}
