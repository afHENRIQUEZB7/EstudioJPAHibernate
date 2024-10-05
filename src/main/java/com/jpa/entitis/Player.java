package com.jpa.entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String nationality;
    private Integer age;
    private String position;

    // Relacion de uno a uno
    @ManyToOne(targetEntity = Club.class)
    @JoinColumn(name = "id_club")
    private Club club;
}
