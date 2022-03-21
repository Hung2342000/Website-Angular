package com.example.backend.model;

import lombok.*;
import javax.persistence.*;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Setter
@Getter
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "nameCountry", nullable = false)
    private String nameCountry;

    @Column(name = "language", nullable = false)
    private String language;
}
