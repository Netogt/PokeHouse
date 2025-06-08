package com.sdev.pokehome.domain.save;
import com.sdev.pokehome.domain.pokemon.Pokemon;
import com.sdev.pokehome.domain.trainer.Trainer;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "saves")
public class Save {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String path_json;
    private String path_sav;

    @OneToMany(mappedBy = "save", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pokemon> pokemons = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainers;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Save() {
    }

    public Save(UUID id, String path_json, String path_sav, List<Pokemon> pokemons, Trainer trainers, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.path_json = path_json;
        this.path_sav = path_sav;
        this.pokemons = pokemons;
        this.trainers = trainers;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPath_json() {
        return path_json;
    }

    public void setPath_json(String path_json) {
        this.path_json = path_json;
    }

    public String getPath_sav() {
        return path_sav;
    }

    public void setPath_sav(String path_sav) {
        this.path_sav = path_sav;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Trainer getTrainers() {
        return trainers;
    }

    public void setTrainers(Trainer trainers) {
        this.trainers = trainers;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
