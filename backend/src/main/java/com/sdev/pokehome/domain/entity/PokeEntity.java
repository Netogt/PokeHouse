package com.sdev.pokehome.domain.entity;

import com.google.gson.annotations.SerializedName;

public class PokeEntity {


    @SerializedName("Context")
    private int context;

    @SerializedName("PersonalInfo")
    private PersonalInfo personalInfo;

    @SerializedName("PID")
    private long pid;

    @SerializedName("ID32")
    private long id32;

    @SerializedName("TID16")
    private int tid16;

    @SerializedName("SID16")
    private int sid16;

    @SerializedName("Nickname")
    private String nickname;

    @SerializedName("Language")
    private int language;

    @SerializedName("OriginalTrainerName")
    private String originalTrainerName;

    @SerializedName("Species")
    private int species;

    @SerializedName("SpriteItem")
    private int spriteItem;

    @SerializedName("HeldItem")
    private int heldItem;

    @SerializedName("EXP")
    private int exp;

    @SerializedName("OriginalTrainerFriendship")
    private int originalTrainerFriendship;

    @SerializedName("Move1")
    private int move1;

    @SerializedName("Move2")
    private int move2;

    @SerializedName("Move3")
    private int move3;

    @SerializedName("Move4")
    private int move4;

    @SerializedName("Move1_PP")
    private int move1PP;

    @SerializedName("Move2_PP")
    private int move2PP;

    @SerializedName("Move3_PP")
    private int move3PP;

    @SerializedName("Move4_PP")
    private int move4PP;

    @SerializedName("EV_HP")
    private int evHP;

    @SerializedName("EV_ATK")
    private int evATK;

    @SerializedName("EV_DEF")
    private int evDEF;

    @SerializedName("EV_SPE")
    private int evSPE;

    @SerializedName("EV_SPA")
    private int evSPA;

    @SerializedName("EV_SPD")
    private int evSPD;

    @SerializedName("MetLocation")
    private int metLocation;

    @SerializedName("MetLevel")
    private int metLevel;

    @SerializedName("Version")
    private int version;

    @SerializedName("Ball")
    private int ball;

    @SerializedName("OriginalTrainerGender")
    private int originalTrainerGender;

    @SerializedName("IV32")
    private long iv32;

    @SerializedName("IV_HP")
    private int ivHP;

    @SerializedName("IV_ATK")
    private int ivATK;

    @SerializedName("IV_DEF")
    private int ivDEF;

    @SerializedName("IV_SPE")
    private int ivSPE;

    @SerializedName("IV_SPA")
    private int ivSPA;

    @SerializedName("IV_SPD")
    private int ivSPD;

    @SerializedName("Ability")
    private int ability;

    @SerializedName("Nature")
    private int nature;

    @SerializedName("Gender")
    private int gender;

    @SerializedName("CurrentFriendship")
    private int currentFriendship;

    @SerializedName("MarkingCount")
    private int markingCount;

    @SerializedName("MarkingCircle")
    private boolean markingCircle;

    @SerializedName("MarkingTriangle")
    private boolean markingTriangle;

    @SerializedName("MarkingSquare")
    private boolean markingSquare;

    @SerializedName("MarkingHeart")
    private boolean markingHeart;

    @SerializedName("Form")
    private int form;

    @SerializedName("AbilityNumber")
    private int abilityNumber;

    @SerializedName("Valid")
    private boolean valid;

    @SerializedName("MetDate")
    private String metDate;

    @SerializedName("EggMetDate")
    private String eggMetDate;

    @SerializedName("IsShiny")
    private boolean isShiny;

    @SerializedName("E")
    private boolean e;

    @SerializedName("FRLG")
    private boolean frlg;

    @SerializedName("Pt")
    private boolean pt;

    @SerializedName("HGSS")
    private boolean hgss;

    @SerializedName("BW")
    private boolean bw;

    @SerializedName("BB2W2")
    private boolean b2w2;

    @SerializedName("XY")
    private boolean xy;

    @SerializedName("AO")
    private boolean ao;

    @SerializedName("SM")
    private boolean sm;

    @SerializedName("USUM")
    private boolean usum;

    @SerializedName("GO")
    private boolean go;

    @SerializedName("VVC1")
    private boolean vc1;

    @SerializedName("VVC2")
    private boolean vc2;

    @SerializedName("LGPE")
    private boolean lgpe;

    @SerializedName("SWSH")
    private boolean swsh;

    @SerializedName("BDSP")
    private boolean bdsp;

    @SerializedName("LA")
    private String la;

    @SerializedName("SV")
    private boolean sv;

    @SerializedName("GO_LGPE")
    private boolean goLGPE;

    @SerializedName("GO_HOME")
    private String goHome;

    @SerializedName("VC")
    private boolean vc;

    @SerializedName("GG")
    private boolean gg;

    @SerializedName("Generation")
    private int generation;

    @SerializedName("CurrentLevel")
    private int currentLevel;

    @SerializedName("FileName")
    private String fileName;
    
    @SerializedName("IVs")
    private int[] ivs;

    @SerializedName("Stats")
    private int[] stats;

    @SerializedName("Moves")
    private int[] moves;

    @SerializedName("HPPower")
    private int hpPower;

    @SerializedName("HPType")
    private int hpType;

    @SerializedName("IsOriginValid")
    private boolean isOriginValid;

    @SerializedName("HasOriginalMetLocation")
    private boolean hasOriginalMetLocation;

}
