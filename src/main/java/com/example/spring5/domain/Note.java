package com.example.spring5.domain;

import lombok.*;

import javax.persistence.*;
@Data
@EqualsAndHashCode(exclude={"recipe"})
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
