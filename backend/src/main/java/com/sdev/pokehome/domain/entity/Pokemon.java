package com.sdev.pokehome.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    public Pokemon() {
    }

    public Pokemon(UUID id, Integer pID, Integer isShiny, Integer gender, String species, String nickname, Integer eXP, String nature, Integer heldItem, String ability, Integer currentFriendship, String language, String gameVersion, String generation, String metLocation, Integer ball, Integer metLevel, Map<String, Integer> stats, Map<String, Integer> ivs, Map<String, Integer> evs, Map<String, Integer> moves, Boolean markingCircle, Boolean markingTriangle, Boolean markingSquare, Boolean markingHeart, Integer tID16, String originalTrainerName, Integer originalTrainerGender, User user, Save save, Box box, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.pID = pID;
        this.isShiny = isShiny;
        this.gender = gender;
        this.species = species;
        this.nickname = nickname;
        this.eXP = eXP;
        this.nature = nature;
        this.heldItem = heldItem;
        this.ability = ability;
        this.currentFriendship = currentFriendship;
        this.language = language;
        this.gameVersion = gameVersion;
        this.generation = generation;
        this.metLocation = metLocation;
        this.ball = ball;
        this.metLevel = metLevel;
        this.stats = stats;
        this.ivs = ivs;
        this.evs = evs;
        this.moves = moves;
        this.markingCircle = markingCircle;
        this.markingTriangle = markingTriangle;
        this.markingSquare = markingSquare;
        this.markingHeart = markingHeart;
        this.tID16 = tID16;
        this.originalTrainerName = originalTrainerName;
        this.originalTrainerGender = originalTrainerGender;
        this.user = user;
        this.save = save;
        this.box = box;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getpID() {
        return pID;
    }

    public void setpID(Integer pID) {
        this.pID = pID;
    }

    public Integer getIsShiny() {
        return isShiny;
    }

    public void setIsShiny(Integer isShiny) {
        this.isShiny = isShiny;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer geteXP() {
        return eXP;
    }

    public void seteXP(Integer eXP) {
        this.eXP = eXP;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Integer getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(Integer heldItem) {
        this.heldItem = heldItem;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Integer getCurrentFriendship() {
        return currentFriendship;
    }

    public void setCurrentFriendship(Integer currentFriendship) {
        this.currentFriendship = currentFriendship;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getMetLocation() {
        return metLocation;
    }

    public void setMetLocation(String metLocation) {
        this.metLocation = metLocation;
    }

    public Integer getBall() {
        return ball;
    }

    public void setBall(Integer ball) {
        this.ball = ball;
    }

    public Integer getMetLevel() {
        return metLevel;
    }

    public void setMetLevel(Integer metLevel) {
        this.metLevel = metLevel;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setStats(Map<String, Integer> stats) {
        this.stats = stats;
    }

    public Map<String, Integer> getIvs() {
        return ivs;
    }

    public void setIvs(Map<String, Integer> ivs) {
        this.ivs = ivs;
    }

    public Map<String, Integer> getEvs() {
        return evs;
    }

    public void setEvs(Map<String, Integer> evs) {
        this.evs = evs;
    }

    public Map<String, Integer> getMoves() {
        return moves;
    }

    public void setMoves(Map<String, Integer> moves) {
        this.moves = moves;
    }

    public Boolean getMarkingCircle() {
        return markingCircle;
    }

    public void setMarkingCircle(Boolean markingCircle) {
        this.markingCircle = markingCircle;
    }

    public Boolean getMarkingTriangle() {
        return markingTriangle;
    }

    public void setMarkingTriangle(Boolean markingTriangle) {
        this.markingTriangle = markingTriangle;
    }

    public Boolean getMarkingSquare() {
        return markingSquare;
    }

    public void setMarkingSquare(Boolean markingSquare) {
        this.markingSquare = markingSquare;
    }

    public Boolean getMarkingHeart() {
        return markingHeart;
    }

    public void setMarkingHeart(Boolean markingHeart) {
        this.markingHeart = markingHeart;
    }

    public Integer gettID16() {
        return tID16;
    }

    public void settID16(Integer tID16) {
        this.tID16 = tID16;
    }

    public String getOriginalTrainerName() {
        return originalTrainerName;
    }

    public void setOriginalTrainerName(String originalTrainerName) {
        this.originalTrainerName = originalTrainerName;
    }

    public Integer getOriginalTrainerGender() {
        return originalTrainerGender;
    }

    public void setOriginalTrainerGender(Integer originalTrainerGender) {
        this.originalTrainerGender = originalTrainerGender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
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
