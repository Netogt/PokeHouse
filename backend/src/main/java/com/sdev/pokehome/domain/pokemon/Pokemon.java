package com.sdev.pokehome.domain.pokemon;

import java.util.List;
import java.util.Map;

public class Pokemon {
    private long PID;
    private boolean IsShiny;
    private int Gender;
    private int Species;
    private String Nickname;
    private int EXP;
    private int Stat_Level;
    private int Nature;
    private int HeldItem;
    private int Ability;
    private int CurrentFriendship;
    private int Language;
    private int Version;
    private int MetLocation;
    private int Ball;
    private int MetLevel;
    private Map<String, Integer> PersonalInfo; // Para HP, ATK, DEF, SPE, SPA, SPD
    private Map<String, Integer> Stats; // Para Stat_HPCurrent, Stat_HPMax, etc.
    private Map<String, Integer> IVs; // Para IV_HP, IV_ATK, etc.
    private Map<String, Integer> EVs; // Para EV_HP, EV_ATK, etc.
    private int HPType;
    private List<Integer> Moves;
    private Map<String, Integer> MovePPs; // Para Move1_PP, Move2_PP, etc.
    private boolean MarkingCircle;
    private boolean MarkingTriangle;
    private boolean MarkingSquare;
    private boolean MarkingHeart;
    private int ContestCool;
    private int ContestBeauty;
    private int ContestCute;
    private int ContestSmart;
    private int ContestTough;
    private int ContestSheen;
    private int TID16;
    private int SID16;
    private String OriginalTrainerName;

    public long getPID() {
        return PID;
    }

    public boolean isShiny() {
        return IsShiny;
    }

    public int getGender() {
        return Gender;
    }

    public int getSpecies() {
        return Species;
    }

    public String getNickname() {
        return Nickname;
    }

    public int getEXP() {
        return EXP;
    }

    public int getStat_Level() {
        return Stat_Level;
    }

    public int getNature() {
        return Nature;
    }

    public int getHeldItem() {
        return HeldItem;
    }

    public int getAbility() {
        return Ability;
    }

    public int getCurrentFriendship() {
        return CurrentFriendship;
    }

    public int getLanguage() {
        return Language;
    }

    public int getVersion() {
        return Version;
    }

    public int getMetLocation() {
        return MetLocation;
    }

    public int getBall() {
        return Ball;
    }

    public int getMetLevel() {
        return MetLevel;
    }

    public Map<String, Integer> getPersonalInfo() {
        return PersonalInfo;
    }

    public Map<String, Integer> getStats() {
        return Stats;
    }

    public Map<String, Integer> getIVs() {
        return IVs;
    }

    public Map<String, Integer> getEVs() {
        return EVs;
    }

    public int getHPType() {
        return HPType;
    }

    public List<Integer> getMoves() {
        return Moves;
    }

    public Map<String, Integer> getMovePPs() {
        return MovePPs;
    }

    public boolean isMarkingCircle() {
        return MarkingCircle;
    }

    public boolean isMarkingTriangle() {
        return MarkingTriangle;
    }

    public boolean isMarkingSquare() {
        return MarkingSquare;
    }

    public boolean isMarkingHeart() {
        return MarkingHeart;
    }

    public int getContestCool() {
        return ContestCool;
    }

    public int getContestBeauty() {
        return ContestBeauty;
    }

    public int getContestCute() {
        return ContestCute;
    }

    public int getContestSmart() {
        return ContestSmart;
    }

    public int getContestTough() {
        return ContestTough;
    }

    public int getContestSheen() {
        return ContestSheen;
    }

    public int getTID16() {
        return TID16;
    }

    public int getSID16() {
        return SID16;
    }

    public String getOriginalTrainerName() {
        return OriginalTrainerName;
    }
}
