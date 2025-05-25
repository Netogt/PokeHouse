package com.sdev.pokehome.domain.pokemon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue
    private UUID id;
    private Integer user_id;
    private Integer Sav_id;
    private Integer Box_id;
    private Integer PID; // id pokemon
    private Integer IsShiny; // se é shiny
    private Integer Gender; // genero
    private String Species; // especie
    private String Nickname; // apelido
    private Integer EXP; // xp atual
    private String Nature; // natureza
    private Integer HeldItem; // item que carraga
    private String Ability; // habilidade
    private Integer CurrentFriendship; // amizade atula
    private String Language; // indioma
    private String Version; // versão do jogo que foi capturado
    private String MetLocation; // local encontrado
    private Integer Ball; // em que pokebola esta
    private Integer MetLevel; // nivel que foi encontrado
    private String Stats; // status
    private String IVs; // ivs
    private String EVs; // evs
    private String Moves;
    private String Marking;
    private Integer TID16;
    private String OriginalTrainerName;
    private Integer OriginalTrainerGender;

    public Pokemon() {
    }

    public Pokemon(UUID id, Integer user_id, Integer sav_id, Integer box_id, Integer PID, Integer isShiny, Integer gender, String species, String nickname, Integer EXP, String nature, Integer heldItem, String ability, Integer currentFriendship, String language, String version, String metLocation, Integer ball, Integer metLevel, String stats, String IVs, String EVs, String moves, String marking, Integer TID16, String originalTrainerName, Integer originalTrainerGender) {
        this.id = id;
        this.user_id = user_id;
        Sav_id = sav_id;
        Box_id = box_id;
        this.PID = PID;
        IsShiny = isShiny;
        Gender = gender;
        Species = species;
        Nickname = nickname;
        this.EXP = EXP;
        Nature = nature;
        HeldItem = heldItem;
        Ability = ability;
        CurrentFriendship = currentFriendship;
        Language = language;
        Version = version;
        MetLocation = metLocation;
        Ball = ball;
        MetLevel = metLevel;
        Stats = stats;
        this.IVs = IVs;
        this.EVs = EVs;
        Moves = moves;
        Marking = marking;
        this.TID16 = TID16;
        OriginalTrainerName = originalTrainerName;
        OriginalTrainerGender = originalTrainerGender;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getSav_id() {
        return Sav_id;
    }

    public void setSav_id(Integer sav_id) {
        Sav_id = sav_id;
    }

    public Integer getBox_id() {
        return Box_id;
    }

    public void setBox_id(Integer box_id) {
        Box_id = box_id;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public Integer getIsShiny() {
        return IsShiny;
    }

    public void setIsShiny(Integer isShiny) {
        IsShiny = isShiny;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer gender) {
        Gender = gender;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public Integer getEXP() {
        return EXP;
    }

    public void setEXP(Integer EXP) {
        this.EXP = EXP;
    }

    public String getNature() {
        return Nature;
    }

    public void setNature(String nature) {
        Nature = nature;
    }

    public Integer getHeldItem() {
        return HeldItem;
    }

    public void setHeldItem(Integer heldItem) {
        HeldItem = heldItem;
    }

    public String getAbility() {
        return Ability;
    }

    public void setAbility(String ability) {
        Ability = ability;
    }

    public Integer getCurrentFriendship() {
        return CurrentFriendship;
    }

    public void setCurrentFriendship(Integer currentFriendship) {
        CurrentFriendship = currentFriendship;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getMetLocation() {
        return MetLocation;
    }

    public void setMetLocation(String metLocation) {
        MetLocation = metLocation;
    }

    public Integer getBall() {
        return Ball;
    }

    public void setBall(Integer ball) {
        Ball = ball;
    }

    public Integer getMetLevel() {
        return MetLevel;
    }

    public void setMetLevel(Integer metLevel) {
        MetLevel = metLevel;
    }

    public String getStats() {
        return Stats;
    }

    public void setStats(String stats) {
        Stats = stats;
    }

    public String getIVs() {
        return IVs;
    }

    public void setIVs(String IVs) {
        this.IVs = IVs;
    }

    public String getEVs() {
        return EVs;
    }

    public void setEVs(String EVs) {
        this.EVs = EVs;
    }

    public String getMoves() {
        return Moves;
    }

    public void setMoves(String moves) {
        Moves = moves;
    }

    public String getMarking() {
        return Marking;
    }

    public void setMarking(String marking) {
        Marking = marking;
    }

    public Integer getTID16() {
        return TID16;
    }

    public void setTID16(Integer TID16) {
        this.TID16 = TID16;
    }

    public String getOriginalTrainerName() {
        return OriginalTrainerName;
    }

    public void setOriginalTrainerName(String originalTrainerName) {
        OriginalTrainerName = originalTrainerName;
    }

    public Integer getOriginalTrainerGender() {
        return OriginalTrainerGender;
    }

    public void setOriginalTrainerGender(Integer originalTrainerGender) {
        OriginalTrainerGender = originalTrainerGender;
    }
}
