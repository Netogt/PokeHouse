package com.sdev.pokehome.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sdev.pokehome.utilities.JsonConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Table(name = "pokemons")
@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "p_id")
    private Integer pID;
    @Column(name = "is_shiny")
    private Integer isShiny;
    private Integer gender;
    private String species;
    private String nickname;
    @Column(name = "exp")
    private Integer eXP;
    private String nature;
    @Column(name = "held_item")
    private Integer heldItem;
    private String ability;
    @Column(name = "current_friendship")
    private Integer currentFriendship;
    @Column(name = "poke_language")
    private String language;
    @Column(name = "game_version")
    private String gameVersion;
    private Integer generation;
    @Column(name = "met_location")
    private String metLocation;
    private Integer ball;
    @Column(name = "met_level")
    private Integer metLevel;

    @Lob
    @Convert(converter = JsonConverter.class)
    private Map<String, Integer> stats;
    @Lob
    @Convert(converter = JsonConverter.class)
    private Map<String, Integer> ivs;
    @Lob
    @Convert(converter = JsonConverter.class)
    private Map<String, Integer> evs;
    @Lob
    @Convert(converter = JsonConverter.class)
    private Map<String, Integer> moves;

    @Column(name = "marking_circle")
    private Boolean markingCircle;
    @Column(name = "marking_triangle")
    private Boolean markingTriangle;
    @Column(name = "marking_square")
    private Boolean markingSquare;
    @Column(name = "marking_heart")
    private Boolean markingHeart;
    @Column(name = "marking_cross")
    private Boolean markingCross;
    @Column(name = "marking_star")
    private Boolean markingStar;
    @Column(name = "marking_diamond")
    private Boolean markingDiamond;
    @Column(name = "t_id_16")
    private Integer tID16;
    @Column(name = "original_trainer_name")
    private String originalTrainerName;
    @Column(name = "original_trainer_gender")
    private Integer originalTrainerGender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "save_id", nullable = false)
    @JsonIgnore
    private Save save;
    @OneToOne(mappedBy = "pokemon")
    private Box box;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
