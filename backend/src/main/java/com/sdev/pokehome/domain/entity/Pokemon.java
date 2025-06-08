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

    public Pokemon() {
    }

    public Pokemon(UUID id, Integer pID, Integer isShiny, Integer gender, String species, String nickname, Integer eXP, String nature, Integer heldItem, String ability, Integer currentFriendship, String language, String gameVersion, Integer generation, String metLocation, Integer ball, Integer metLevel, Map<String, Integer> stats, Map<String, Integer> ivs, Map<String, Integer> evs, Map<String, Integer> moves, Boolean markingCircle, Boolean markingTriangle, Boolean markingSquare, Boolean markingHeart, Boolean markingCross, Boolean markingStar, Boolean markingDiamond, Integer tID16, String originalTrainerName, Integer originalTrainerGender, User user, Save save, Box box, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
        this.markingCross = markingCross;
        this.markingStar = markingStar;
        this.markingDiamond = markingDiamond;
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

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
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

    public Boolean getMarkingCross() {
        return markingCross;
    }

    public void setMarkingCross(Boolean markingCross) {
        this.markingCross = markingCross;
    }

    public Boolean getMarkingStar() {
        return markingStar;
    }

    public void setMarkingStar(Boolean markingStar) {
        this.markingStar = markingStar;
    }

    public Boolean getMarkingDiamond() {
        return markingDiamond;
    }

    public void setMarkingDiamond(Boolean markingDiamond) {
        this.markingDiamond = markingDiamond;
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
