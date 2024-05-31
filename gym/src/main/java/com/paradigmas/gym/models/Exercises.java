package com.paradigmas.gym.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exercices")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercises {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String muscles;

    @OneToOne(mappedBy = "exercices")
    private Training training;


}
