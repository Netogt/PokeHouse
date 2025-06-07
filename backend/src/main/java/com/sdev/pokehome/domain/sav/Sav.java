package com.sdev.pokehome.domain.sav;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Saves")
public class Sav {

    @Id
    @GeneratedValue
    private UUID id;
}
