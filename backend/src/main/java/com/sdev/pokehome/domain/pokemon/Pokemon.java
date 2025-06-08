package com.sdev.pokehome.domain.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sdev.pokehome.domain.box.Box;
import com.sdev.pokehome.domain.save.Save;
import com.sdev.pokehome.domain.user.User;
import com.sdev.pokehome.utilities.JsonConverter;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer pID; // id pokemon
    private Integer isShiny; // se é shiny
    private Integer gender; // genero
    private String species; // especie
    private String nickname; // apelido
    private Integer eXP; // xp atual
    private String nature; // natureza
    private Integer heldItem; // item que carraga
    private String ability; // habilidade
    private Integer currentFriendship; // amizade atula
    private String language; // indioma
    private String gameVersion; // versão do jogo que foi capturado
    private String generation;
    private String metLocation; // local encontrado
    private Integer ball; // em que pokebola esta
    private Integer metLevel; // nivel que foi encontrado

    @Lob
    @Convert(converter = JsonConverter.class)
    private Map<String, Integer> stats; // status
    @Lob
    @Convert(converter = JsonConverter.class)
    private Map<String, Integer> ivs; // ivs
    @Lob
    @Convert(converter = JsonConverter.class)
    private Map<String, Integer> evs; // evs
    @Lob
    @Convert(converter = JsonConverter.class)
    private Map<String, Integer> moves;
    
    private Boolean markingCircle;
    private Boolean markingTriangle;
    private Boolean markingSquare;
    private Boolean markingHeart;
    private Integer tID16;
    private String originalTrainerName;
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
