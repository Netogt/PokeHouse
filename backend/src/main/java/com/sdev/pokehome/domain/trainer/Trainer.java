package com.sdev.pokehome.domain.trainer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "trainers")
@Entity
public class Trainer {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private Integer gender;
    private Integer generation;
    private Integer trainerID;
    private Integer secretID;
    private Integer badges;
}
