package com.sdev.pokehome.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@EntityListeners(AuditingEntityListener.class)
@Table(name = "boxes")
@Entity
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "box_number")
    private Integer boxNumber;
    @Column(name = "box_column")
    private Integer boxColumn;
    @Column(name = "box_row")
    private Integer boxRow;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    @OneToOne
    @JoinColumn(name = "pokemon_id")
    private Pokemon pokemon;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Box() {
    }

    public Box(UUID id, Integer boxNumber, Integer boxColumn, Integer boxRow, User user, Pokemon pokemon, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.boxNumber = boxNumber;
        this.boxColumn = boxColumn;
        this.boxRow = boxRow;
        this.user = user;
        this.pokemon = pokemon;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(Integer boxNumber) {
        this.boxNumber = boxNumber;
    }

    public Integer getBoxColumn() {
        return boxColumn;
    }

    public void setBoxColumn(Integer boxColumn) {
        this.boxColumn = boxColumn;
    }

    public Integer getBoxRow() {
        return boxRow;
    }

    public void setBoxRow(Integer boxRow) {
        this.boxRow = boxRow;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
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
