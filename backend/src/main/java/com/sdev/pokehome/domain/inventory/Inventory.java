package com.sdev.pokehome.domain.inventory;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sdev.pokehome.domain.pokemon.Pokemon;
import com.sdev.pokehome.domain.trainer.Trainer;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer itemID;
    private String itemName;
    private Integer itemCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainer_id", nullable = false)
    @JsonIgnore
    private Trainer trainer;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createAt;
    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
