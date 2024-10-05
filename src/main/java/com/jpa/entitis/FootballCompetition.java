package com.jpa.entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FootballCompetition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "cuantity_price")
    private Integer cuantityPrice;
    @Column(name= "start_date", columnDefinition = "DATE")
    private LocalDate startDate;
    @Column(name = "end_date", columnDefinition = "DATE")
    private LocalDate endDate;

//    // Relacion de muchos a muchos
//    @ManyToMany(targetEntity = Club.class, fetch = FetchType.LAZY)
//    private List<Club> clubs;


}
