package com.sdev.pokehome.domain.box;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sdev.pokehome.domain.pokemon.Pokemon;
import com.sdev.pokehome.domain.user.User;
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
    private Integer box;
    private Integer column;
    private Integer row;

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

}
