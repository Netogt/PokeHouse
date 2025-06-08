package com.sdev.pokehome.domain.entity;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class PokeSav {
    @SerializedName("Version")
    private int version;

    @SerializedName("SecurityKey")
    private long securityKey;

    @SerializedName("PartyCount")
    private int partyCount;

    @SerializedName("Money")
    private int money;

    @SerializedName("Coin")
    private int coin;

    @SerializedName("RivalName")
    private String rivalName;

    @SerializedName("Language")
    private int language;

    @SerializedName("Generation")
    private int generation;

    @SerializedName("OT")
    private String ot;

    @SerializedName("Gender")
    private int gender;

    @SerializedName("ID32")
    private long id32;

    @SerializedName("TID16")
    private int tid16;

    @SerializedName("SID16")
    private int sid16;

    @SerializedName("Badges")
    private int badges;

    @SerializedName("Inventory")
    private List<Inventory> inventory;

    @SerializedName("PlayTimeString")
    private String playTimeString;

    @SerializedName("PartyData")
    private List<PartyData> partyData;

    @SerializedName("SeenCount")
    private int seenCount;

    @SerializedName("CaughtCount")
    private int caughtCount;

    @SerializedName("BoxData")
    private List<Object> boxData;

    // Getters and setters
    public int getVersion() { return version; }
    public void setVersion(int version) { this.version = version; }
    public long getSecurityKey() { return securityKey; }
    public void setSecurityKey(long securityKey) { this.securityKey = securityKey; }
    public int getPartyCount() { return partyCount; }
    public void setPartyCount(int partyCount) { this.partyCount = partyCount; }
    public int getMoney() { return money; }
    public void setMoney(int money) { this.money = money; }
    public int getCoin() { return coin; }
    public void setCoin(int coin) { this.coin = coin; }
    public String getRivalName() { return rivalName; }
    public void setRivalName(String rivalName) { this.rivalName = rivalName; }
    public int getLanguage() { return language; }
    public void setLanguage(int language) { this.language = language; }
    public int getGeneration() { return generation; }
    public void setGeneration(int generation) { this.generation = generation; }
    public String getOt() { return ot; }
    public void setOt(String ot) { this.ot = ot; }
    public int getGender() { return gender; }
    public void setGender(int gender) { this.gender = gender; }
    public long getId32() { return id32; }
    public void setId32(long id32) { this.id32 = id32; }
    public int getTid16() { return tid16; }
    public void setTid16(int tid16) { this.tid16 = tid16; }
    public int getSid16() { return sid16; }
    public void setSid16(int sid16) { this.sid16 = sid16; }
    public int getBadges() { return badges; }
    public void setBadges(int badges) { this.badges = badges; }
    public List<Inventory> getInventory() { return inventory; }
    public void setInventory(List<Inventory> inventory) { this.inventory = inventory; }
    public String getPlayTimeString() { return playTimeString; }
    public void setPlayTimeString(String playTimeString) { this.playTimeString = playTimeString; }
    public List<PartyData> getPartyData() { return partyData; }
    public void setPartyData(List<PartyData> partyData) { this.partyData = partyData; }
    public int getSeenCount() { return seenCount; }
    public void setSeenCount(int seenCount) { this.seenCount = seenCount; }
    public int getCaughtCount() { return caughtCount; }
    public void setCaughtCount(int caughtCount) { this.caughtCount = caughtCount; }
    public List<Object> getBoxData() { return boxData; }
    public void setBoxData(List<Object> boxData) { this.boxData = boxData; }

    public static class Inventory {
        @SerializedName("Type")
        private int type;

        @SerializedName("Info")
        private Map<String, Object> info;

        @SerializedName("MaxCount")
        private int maxCount;

        @SerializedName("Items")
        private List<Item> items;

        @SerializedName("Offset")
        private int offset;

        @SerializedName("PouchDataSize")
        private int pouchDataSize;

        @SerializedName("SecurityKey")
        private long securityKey;

        @SerializedName("Count")
        private int count;

        @SerializedName("IsCramped")
        private boolean isCramped;

        // Getters and setters
        public int getType() { return type; }
        public void setType(int type) { this.type = type; }
        public Map<String, Object> getInfo() { return info; }
        public void setInfo(Map<String, Object> info) { this.info = info; }
        public int getMaxCount() { return maxCount; }
        public void setMaxCount(int maxCount) { this.maxCount = maxCount; }
        public List<Item> getItems() { return items; }
        public void setItems(List<Item> items) { this.items = items; }
        public int getOffset() { return offset; }
        public void setOffset(int offset) { this.offset = offset; }
        public int getPouchDataSize() { return pouchDataSize; }
        public void setPouchDataSize(int pouchDataSize) { this.pouchDataSize = pouchDataSize; }
        public long getSecurityKey() { return securityKey; }
        public void setSecurityKey(long securityKey) { this.securityKey = securityKey; }
        public int getCount() { return count; }
        public void setCount(int count) { this.count = count; }
        public boolean isCramped() { return isCramped; }
        public void setCramped(boolean cramped) { isCramped = cramped; }
    }

    public static class Item {
        @SerializedName("Index")
        private int index;

        @SerializedName("Count")
        private int count;

        // Getters and setters
        public int getIndex() { return index; }
        public void setIndex(int index) { this.index = index; }
        public int getCount() { return count; }
        public void setCount(int count) { this.count = count; }
    }

    public static class PartyData {
        @SerializedName("Data")
        private String data;

        @SerializedName("SIZE_PARTY")
        private int sizeParty;

        @SerializedName("SIZE_STORED")
        private int sizeStored;

        @SerializedName("Context")
        private int context;

        @SerializedName("PersonalInfo")
        private PersonalInfo personalInfo;

        @SerializedName("TrashCharCountTrainer")
        private int trashCharCountTrainer;

        @SerializedName("TrashCharCountNickname")
        private int trashCharCountNickname;

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

        @SerializedName("FlagIsBadEgg")
        private boolean flagIsBadEgg;

        @SerializedName("FlagHasSpecies")
        private boolean flagHasSpecies;

        @SerializedName("FlagIsEgg")
        private boolean flagIsEgg;

        @SerializedName("OriginalTrainerName")
        private String originalTrainerName;

        @SerializedName("MarkingValue")
        private int markingValue;

        @SerializedName("Checksum")
        private int checksum;

        @SerializedName("Sanity")
        private int sanity;

        @SerializedName("SpeciesInternal")
        private int speciesInternal;

        @SerializedName("Species")
        private int species;

        @SerializedName("SpriteItem")
        private int spriteItem;

        @SerializedName("HeldItem")
        private int heldItem;

        @SerializedName("EXP")
        private int exp;

        @SerializedName("PPUps")
        private int ppUps;

        @SerializedName("Move1_PPUps")
        private int move1PPUps;

        @SerializedName("Move2_PPUps")
        private int move2PPUps;

        @SerializedName("Move3_PPUps")
        private int move3PPUps;

        @SerializedName("Move4_PPUps")
        private int move4PPUps;

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

        @SerializedName("ContestCool")
        private int contestCool;

        @SerializedName("ContestBeauty")
        private int contestBeauty;

        @SerializedName("ContestCute")
        private int contestCute;

        @SerializedName("ContestSmart")
        private int contestSmart;

        @SerializedName("ContestTough")
        private int contestTough;

        @SerializedName("ContestSheen")
        private int contestSheen;

        @SerializedName("PokerusState")
        private int pokerusState;

        @SerializedName("PokerusDays")
        private int pokerusDays;

        @SerializedName("PokerusStrain")
        private int pokerusStrain;

        @SerializedName("MetLocation")
        private int metLocation;

        @SerializedName("Origins")
        private int origins;

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

        @SerializedName("IsEgg")
        private boolean isEgg;

        @SerializedName("AbilityBit")
        private boolean abilityBit;

        @SerializedName("RIB0")
        private int rib0;

        @SerializedName("RibbonCountG3Cool")
        private int ribbonCountG3Cool;

        @SerializedName("RibbonCountG3Beauty")
        private int ribbonCountG3Beauty;

        @SerializedName("RibbonCountG3Cute")
        private int ribbonCountG3Cute;

        @SerializedName("RibbonCountG3Smart")
        private int ribbonCountG3Smart;

        @SerializedName("RibbonCountG3Tough")
        private int ribbonCountG3Tough;

        @SerializedName("RibbonChampionG3")
        private boolean ribbonChampionG3;

        @SerializedName("RibbonWinning")
        private boolean ribbonWinning;

        @SerializedName("RibbonVictory")
        private boolean ribbonVictory;

        @SerializedName("RibbonArtist")
        private boolean ribbonArtist;

        @SerializedName("RibbonEffort")
        private boolean ribbonEffort;

        @SerializedName("RibbonChampionBattle")
        private boolean ribbonChampionBattle;

        @SerializedName("RibbonChampionRegional")
        private boolean ribbonChampionRegional;

        @SerializedName("RibbonChampionNational")
        private boolean ribbonChampionNational;

        @SerializedName("RibbonCountry")
        private boolean ribbonCountry;

        @SerializedName("RibbonNational")
        private boolean ribbonNational;

        @SerializedName("RibbonEarth")
        private boolean ribbonEarth;

        @SerializedName("RibbonWorld")
        private boolean ribbonWorld;

        @SerializedName("Unused1")
        private boolean unused1;

        @SerializedName("Unused2")
        private boolean unused2;

        @SerializedName("Unused3")
        private boolean unused3;

        @SerializedName("Unused4")
        private boolean unused4;

        @SerializedName("FatefulEncounter")
        private boolean fatefulEncounter;

        @SerializedName("RibbonCount")
        private int ribbonCount;

        @SerializedName("Status_Condition")
        private int statusCondition;

        @SerializedName("Stat_Level")
        private int statLevel;

        @SerializedName("HeldMailID")
        private int heldMailID;

        @SerializedName("Stat_HPCurrent")
        private int statHPCurrent;

        @SerializedName("Stat_HPMax")
        private int statHPMax;

        @SerializedName("Stat_ATK")
        private int statATK;

        @SerializedName("Stat_DEF")
        private int statDEF;

        @SerializedName("Stat_SPE")
        private int statSPE;

        @SerializedName("Stat_SPA")
        private int statSPA;

        @SerializedName("Stat_SPD")
        private int statSPD;

        @SerializedName("ChecksumValid")
        private boolean checksumValid;

        @SerializedName("MaxMoveID")
        private int maxMoveID;

        @SerializedName("MaxSpeciesID")
        private int maxSpeciesID;

        @SerializedName("MaxAbilityID")
        private int maxAbilityID;

        @SerializedName("MaxItemID")
        private int maxItemID;

        @SerializedName("MaxBallID")
        private int maxBallID;

        @SerializedName("MaxGameID")
        private int maxGameID;

        @SerializedName("MaxIV")
        private int maxIV;

        @SerializedName("MaxEV")
        private int maxEV;

        @SerializedName("MaxStringLengthTrainer")
        private int maxStringLengthTrainer;

        @SerializedName("MaxStringLengthNickname")
        private int maxStringLengthNickname;

        @SerializedName("PSV")
        private int psv;

        @SerializedName("TSV")
        private int tsv;

        @SerializedName("Japanese")
        private boolean japanese;

        @SerializedName("Ability")
        private int ability;

        @SerializedName("EncryptionConstant")
        private long encryptionConstant;

        @SerializedName("Nature")
        private int nature;

        @SerializedName("IsNicknamed")
        private boolean isNicknamed;

        @SerializedName("Gender")
        private int gender;

        @SerializedName("Characteristic")
        private int characteristic;

        @SerializedName("CurrentFriendship")
        private int currentFriendship;

        @SerializedName("CurrentHandler")
        private int currentHandler;

        @SerializedName("EggLocation")
        private int eggLocation;

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

        @SerializedName("Extension")
        private String extension;

        @SerializedName("EncryptedPartyData")
        private String encryptedPartyData;

        @SerializedName("EncryptedBoxData")
        private String encryptedBoxData;

        @SerializedName("DecryptedPartyData")
        private String decryptedPartyData;

        @SerializedName("DecryptedBoxData")
        private String decryptedBoxData;

        @SerializedName("Format")
        private int format;

        @SerializedName("TrainerIDDisplayFormat")
        private int trainerIDDisplayFormat;

        @SerializedName("StatNature")
        private int statNature;

        @SerializedName("TrainerTID7")
        private Integer trainerTID7;

        @SerializedName("TrainerSID7")
        private Integer trainerSID7;

        @SerializedName("DisplayTID")
        private int displayTID;

        @SerializedName("DisplaySID")
        private int displaySID;

        @SerializedName("Korean")
        private boolean korean;

        @SerializedName("MetYear")
        private int metYear;

        @SerializedName("MetMonth")
        private int metMonth;

        @SerializedName("MetDay")
        private int metDay;

        @SerializedName("MetDate")
        private String metDate;

        @SerializedName("HandlingTrainerName")
        private String handlingTrainerName;

        @SerializedName("HandlingTrainerGender")
        private int handlingTrainerGender;

        @SerializedName("HandlingTrainerFriendship")
        private int handlingTrainerFriendship;

        @SerializedName("EggYear")
        private int eggYear;

        @SerializedName("EggMonth")
        private int eggMonth;

        @SerializedName("EggDay")
        private int eggDay;

        @SerializedName("EggMetDate")
        private String eggMetDate;

        @SerializedName("RelearnMove1")
        private Integer relearnMove1;

        @SerializedName("relearnMove2")
        private Integer relearnMove2;

        @SerializedName("RelearnMove3")
        private int relearnMove3;

        @SerializedName("RelearnMove4")
        private int relearnMove4;

        @SerializedName("MinGameID")
        private int minGameID;

        @SerializedName("IsShiny")
        private boolean isShiny;

        @SerializedName("ShinyXor")
        private int shinyXor;

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

        @SerializedName("SSV")
        private boolean sv;

        private boolean svv;

        @SerializedName("GO_LG_LGPE")
        private boolean goLGPE;

        @SerializedName("GO_HOME")
        private String goHome;

        @SerializedName("VVC")
        private boolean vc;

        @SerializedName("GGGG")
        private boolean gg;

        @SerializedName("Gen9")
        private String g;

        @SerializedName("en8")
        private boolean gen8;

        @SerializedName("Gen7")
        private String gen7;

        @SerializedName("Gen8")
        private boolean gen6;

        @SerializedName("Gen5")
        private String gen5;

        @SerializedName("Gen4")
        private String gen4;

        @SerializedName("Gen3")
        private boolean gen3;

        @SerializedName("Gen2")
        private String gen2;

        @SerializedName("Gen1")
        private boolean gen1;

        @SerializedName("GenU")
        private String gen;

        @SerializedName("Generation")
        private int generation;

        @SerializedName("IsPokerusInfected")
        private boolean isPokerusInfected;

        @SerializedName("IsPokerusCured")
        private boolean isPokerusCured;

        @SerializedName("CurrentLevel")
        private int currentLevel;

        @SerializedName("IVTotal")
        private int ivTotal;

        @SerializedName("MaximumIV")
        private int maximumIV;

        @SerializedName("FlawlessIVCount")
        private int flawlessIVCount;

        @SerializedName("FileName")
        private String fileName;

        @SerializedName("FileNameWithoutExtension")
        private String fileNameWithoutExtension;

        @SerializedName("IVs")
        private int[] ivs;

        @SerializedName("Stats")
        private int[] stats;

        @SerializedName("Moves")
        private int[] moves;

        @SerializedName("MoveCount")
        private int moveCount;

        @SerializedName("RelearnMoves")
        private int[] relearnMoves;

        @SerializedName("PIDAbility")
        private int pidAbility;

        @SerializedName("HPPower")
        private int hpPower;

        @SerializedName("HPType")
        private int hpType;

        @SerializedName("WasEgg")
        private boolean wasEgg;

        @SerializedName("WasTradedEgg")
        private boolean wasTradedEgg;

        @SerializedName("IsTradedEgg")
        private boolean isTradedEgg;

        @SerializedName("IsUntraded")
        private boolean isUntraded;

        @SerializedName("IsOriginValid")
        private boolean isOriginValid;

        @SerializedName("HasOriginalMetLocation")
        private boolean hasOriginalMetLocation;

        @SerializedName("PotentialRating")
        private int potentialRating;

        @SerializedName("PartyStatsPresent")
        private boolean partyStatsPresent;

        @SerializedName("HPBitValPower")
        private int hpBitValPower;

        @SerializedName("HPBitValType")
        private int hpBitValType;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public int getSizeParty() {
            return sizeParty;
        }

        public void setSizeParty(int sizeParty) {
            this.sizeParty = sizeParty;
        }

        public int getSizeStored() {
            return sizeStored;
        }

        public void setSizeStored(int sizeStored) {
            this.sizeStored = sizeStored;
        }

        public int getContext() {
            return context;
        }

        public void setContext(int context) {
            this.context = context;
        }

        public PersonalInfo getPersonalInfo() {
            return personalInfo;
        }

        public void setPersonalInfo(PersonalInfo personalInfo) {
            this.personalInfo = personalInfo;
        }

        public int getTrashCharCountTrainer() {
            return trashCharCountTrainer;
        }

        public void setTrashCharCountTrainer(int trashCharCountTrainer) {
            this.trashCharCountTrainer = trashCharCountTrainer;
        }

        public int getTrashCharCountNickname() {
            return trashCharCountNickname;
        }

        public void setTrashCharCountNickname(int trashCharCountNickname) {
            this.trashCharCountNickname = trashCharCountNickname;
        }

        public long getPid() {
            return pid;
        }

        public void setPid(long pid) {
            this.pid = pid;
        }

        public long getId32() {
            return id32;
        }

        public void setId32(long id32) {
            this.id32 = id32;
        }

        public int getTid16() {
            return tid16;
        }

        public void setTid16(int tid16) {
            this.tid16 = tid16;
        }

        public int getSid16() {
            return sid16;
        }

        public void setSid16(int sid16) {
            this.sid16 = sid16;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getLanguage() {
            return language;
        }

        public void setLanguage(int language) {
            this.language = language;
        }

        public boolean isFlagIsBadEgg() {
            return flagIsBadEgg;
        }

        public void setFlagIsBadEgg(boolean flagIsBadEgg) {
            this.flagIsBadEgg = flagIsBadEgg;
        }

        public boolean isFlagHasSpecies() {
            return flagHasSpecies;
        }

        public void setFlagHasSpecies(boolean flagHasSpecies) {
            this.flagHasSpecies = flagHasSpecies;
        }

        public boolean isFlagIsEgg() {
            return flagIsEgg;
        }

        public void setFlagIsEgg(boolean flagIsEgg) {
            this.flagIsEgg = flagIsEgg;
        }

        public String getOriginalTrainerName() {
            return originalTrainerName;
        }

        public void setOriginalTrainerName(String originalTrainerName) {
            this.originalTrainerName = originalTrainerName;
        }

        public int getMarkingValue() {
            return markingValue;
        }

        public void setMarkingValue(int markingValue) {
            this.markingValue = markingValue;
        }

        public int getChecksum() {
            return checksum;
        }

        public void setChecksum(int checksum) {
            this.checksum = checksum;
        }

        public int getSanity() {
            return sanity;
        }

        public void setSanity(int sanity) {
            this.sanity = sanity;
        }

        public int getSpeciesInternal() {
            return speciesInternal;
        }

        public void setSpeciesInternal(int speciesInternal) {
            this.speciesInternal = speciesInternal;
        }

        public int getSpecies() {
            return species;
        }

        public void setSpecies(int species) {
            this.species = species;
        }

        public int getSpriteItem() {
            return spriteItem;
        }

        public void setSpriteItem(int spriteItem) {
            this.spriteItem = spriteItem;
        }

        public int getHeldItem() {
            return heldItem;
        }

        public void setHeldItem(int heldItem) {
            this.heldItem = heldItem;
        }

        public int getExp() {
            return exp;
        }

        public void setExp(int exp) {
            this.exp = exp;
        }

        public int getPpUps() {
            return ppUps;
        }

        public void setPpUps(int ppUps) {
            this.ppUps = ppUps;
        }

        public int getMove1PPUps() {
            return move1PPUps;
        }

        public void setMove1PPUps(int move1PPUps) {
            this.move1PPUps = move1PPUps;
        }

        public int getMove2PPUps() {
            return move2PPUps;
        }

        public void setMove2PPUps(int move2PPUps) {
            this.move2PPUps = move2PPUps;
        }

        public int getMove3PPUps() {
            return move3PPUps;
        }

        public void setMove3PPUps(int move3PPUps) {
            this.move3PPUps = move3PPUps;
        }

        public int getMove4PPUps() {
            return move4PPUps;
        }

        public void setMove4PPUps(int move4PPUps) {
            this.move4PPUps = move4PPUps;
        }

        public int getOriginalTrainerFriendship() {
            return originalTrainerFriendship;
        }

        public void setOriginalTrainerFriendship(int originalTrainerFriendship) {
            this.originalTrainerFriendship = originalTrainerFriendship;
        }

        public int getMove1() {
            return move1;
        }

        public void setMove1(int move1) {
            this.move1 = move1;
        }

        public int getMove2() {
            return move2;
        }

        public void setMove2(int move2) {
            this.move2 = move2;
        }

        public int getMove3() {
            return move3;
        }

        public void setMove3(int move3) {
            this.move3 = move3;
        }

        public int getMove4() {
            return move4;
        }

        public void setMove4(int move4) {
            this.move4 = move4;
        }

        public int getMove1PP() {
            return move1PP;
        }

        public void setMove1PP(int move1PP) {
            this.move1PP = move1PP;
        }

        public int getMove2PP() {
            return move2PP;
        }

        public void setMove2PP(int move2PP) {
            this.move2PP = move2PP;
        }

        public int getMove3PP() {
            return move3PP;
        }

        public void setMove3PP(int move3PP) {
            this.move3PP = move3PP;
        }

        public int getMove4PP() {
            return move4PP;
        }

        public void setMove4PP(int move4PP) {
            this.move4PP = move4PP;
        }

        public int getEvHP() {
            return evHP;
        }

        public void setEvHP(int evHP) {
            this.evHP = evHP;
        }

        public int getEvATK() {
            return evATK;
        }

        public void setEvATK(int evATK) {
            this.evATK = evATK;
        }

        public int getEvDEF() {
            return evDEF;
        }

        public void setEvDEF(int evDEF) {
            this.evDEF = evDEF;
        }

        public int getEvSPE() {
            return evSPE;
        }

        public void setEvSPE(int evSPE) {
            this.evSPE = evSPE;
        }

        public int getEvSPA() {
            return evSPA;
        }

        public void setEvSPA(int evSPA) {
            this.evSPA = evSPA;
        }

        public int getEvSPD() {
            return evSPD;
        }

        public void setEvSPD(int evSPD) {
            this.evSPD = evSPD;
        }

        public int getContestCool() {
            return contestCool;
        }

        public void setContestCool(int contestCool) {
            this.contestCool = contestCool;
        }

        public int getContestBeauty() {
            return contestBeauty;
        }

        public void setContestBeauty(int contestBeauty) {
            this.contestBeauty = contestBeauty;
        }

        public int getContestCute() {
            return contestCute;
        }

        public void setContestCute(int contestCute) {
            this.contestCute = contestCute;
        }

        public int getContestSmart() {
            return contestSmart;
        }

        public void setContestSmart(int contestSmart) {
            this.contestSmart = contestSmart;
        }

        public int getContestTough() {
            return contestTough;
        }

        public void setContestTough(int contestTough) {
            this.contestTough = contestTough;
        }

        public int getContestSheen() {
            return contestSheen;
        }

        public void setContestSheen(int contestSheen) {
            this.contestSheen = contestSheen;
        }

        public int getPokerusState() {
            return pokerusState;
        }

        public void setPokerusState(int pokerusState) {
            this.pokerusState = pokerusState;
        }

        public int getPokerusDays() {
            return pokerusDays;
        }

        public void setPokerusDays(int pokerusDays) {
            this.pokerusDays = pokerusDays;
        }

        public int getPokerusStrain() {
            return pokerusStrain;
        }

        public void setPokerusStrain(int pokerusStrain) {
            this.pokerusStrain = pokerusStrain;
        }

        public int getMetLocation() {
            return metLocation;
        }

        public void setMetLocation(int metLocation) {
            this.metLocation = metLocation;
        }

        public int getOrigins() {
            return origins;
        }

        public void setOrigins(int origins) {
            this.origins = origins;
        }

        public int getMetLevel() {
            return metLevel;
        }

        public void setMetLevel(int metLevel) {
            this.metLevel = metLevel;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public int getBall() {
            return ball;
        }

        public void setBall(int ball) {
            this.ball = ball;
        }

        public int getOriginalTrainerGender() {
            return originalTrainerGender;
        }

        public void setOriginalTrainerGender(int originalTrainerGender) {
            this.originalTrainerGender = originalTrainerGender;
        }

        public long getIv32() {
            return iv32;
        }

        public void setIv32(long iv32) {
            this.iv32 = iv32;
        }

        public int getIvHP() {
            return ivHP;
        }

        public void setIvHP(int ivHP) {
            this.ivHP = ivHP;
        }

        public int getIvATK() {
            return ivATK;
        }

        public void setIvATK(int ivATK) {
            this.ivATK = ivATK;
        }

        public int getIvDEF() {
            return ivDEF;
        }

        public void setIvDEF(int ivDEF) {
            this.ivDEF = ivDEF;
        }

        public int getIvSPE() {
            return ivSPE;
        }

        public void setIvSPE(int ivSPE) {
            this.ivSPE = ivSPE;
        }

        public int getIvSPA() {
            return ivSPA;
        }

        public void setIvSPA(int ivSPA) {
            this.ivSPA = ivSPA;
        }

        public int getIvSPD() {
            return ivSPD;
        }

        public void setIvSPD(int ivSPD) {
            this.ivSPD = ivSPD;
        }

        public boolean isEgg() {
            return isEgg;
        }

        public void setEgg(boolean egg) {
            isEgg = egg;
        }

        public boolean isAbilityBit() {
            return abilityBit;
        }

        public void setAbilityBit(boolean abilityBit) {
            this.abilityBit = abilityBit;
        }

        public int getRib0() {
            return rib0;
        }

        public void setRib0(int rib0) {
            this.rib0 = rib0;
        }

        public int getRibbonCountG3Cool() {
            return ribbonCountG3Cool;
        }

        public void setRibbonCountG3Cool(int ribbonCountG3Cool) {
            this.ribbonCountG3Cool = ribbonCountG3Cool;
        }

        public int getRibbonCountG3Beauty() {
            return ribbonCountG3Beauty;
        }

        public void setRibbonCountG3Beauty(int ribbonCountG3Beauty) {
            this.ribbonCountG3Beauty = ribbonCountG3Beauty;
        }

        public int getRibbonCountG3Cute() {
            return ribbonCountG3Cute;
        }

        public void setRibbonCountG3Cute(int ribbonCountG3Cute) {
            this.ribbonCountG3Cute = ribbonCountG3Cute;
        }

        public int getRibbonCountG3Smart() {
            return ribbonCountG3Smart;
        }

        public void setRibbonCountG3Smart(int ribbonCountG3Smart) {
            this.ribbonCountG3Smart = ribbonCountG3Smart;
        }

        public int getRibbonCountG3Tough() {
            return ribbonCountG3Tough;
        }

        public void setRibbonCountG3Tough(int ribbonCountG3Tough) {
            this.ribbonCountG3Tough = ribbonCountG3Tough;
        }

        public boolean isRibbonChampionG3() {
            return ribbonChampionG3;
        }

        public void setRibbonChampionG3(boolean ribbonChampionG3) {
            this.ribbonChampionG3 = ribbonChampionG3;
        }

        public boolean isRibbonWinning() {
            return ribbonWinning;
        }

        public void setRibbonWinning(boolean ribbonWinning) {
            this.ribbonWinning = ribbonWinning;
        }

        public boolean isRibbonVictory() {
            return ribbonVictory;
        }

        public void setRibbonVictory(boolean ribbonVictory) {
            this.ribbonVictory = ribbonVictory;
        }

        public boolean isRibbonArtist() {
            return ribbonArtist;
        }

        public void setRibbonArtist(boolean ribbonArtist) {
            this.ribbonArtist = ribbonArtist;
        }

        public boolean isRibbonEffort() {
            return ribbonEffort;
        }

        public void setRibbonEffort(boolean ribbonEffort) {
            this.ribbonEffort = ribbonEffort;
        }

        public boolean isRibbonChampionBattle() {
            return ribbonChampionBattle;
        }

        public void setRibbonChampionBattle(boolean ribbonChampionBattle) {
            this.ribbonChampionBattle = ribbonChampionBattle;
        }

        public boolean isRibbonChampionRegional() {
            return ribbonChampionRegional;
        }

        public void setRibbonChampionRegional(boolean ribbonChampionRegional) {
            this.ribbonChampionRegional = ribbonChampionRegional;
        }

        public boolean isRibbonChampionNational() {
            return ribbonChampionNational;
        }

        public void setRibbonChampionNational(boolean ribbonChampionNational) {
            this.ribbonChampionNational = ribbonChampionNational;
        }

        public boolean isRibbonCountry() {
            return ribbonCountry;
        }

        public void setRibbonCountry(boolean ribbonCountry) {
            this.ribbonCountry = ribbonCountry;
        }

        public boolean isRibbonNational() {
            return ribbonNational;
        }

        public void setRibbonNational(boolean ribbonNational) {
            this.ribbonNational = ribbonNational;
        }

        public boolean isRibbonEarth() {
            return ribbonEarth;
        }

        public void setRibbonEarth(boolean ribbonEarth) {
            this.ribbonEarth = ribbonEarth;
        }

        public boolean isRibbonWorld() {
            return ribbonWorld;
        }

        public void setRibbonWorld(boolean ribbonWorld) {
            this.ribbonWorld = ribbonWorld;
        }

        public boolean isUnused1() {
            return unused1;
        }

        public void setUnused1(boolean unused1) {
            this.unused1 = unused1;
        }

        public boolean isUnused2() {
            return unused2;
        }

        public void setUnused2(boolean unused2) {
            this.unused2 = unused2;
        }

        public boolean isUnused3() {
            return unused3;
        }

        public void setUnused3(boolean unused3) {
            this.unused3 = unused3;
        }

        public boolean isUnused4() {
            return unused4;
        }

        public void setUnused4(boolean unused4) {
            this.unused4 = unused4;
        }

        public boolean isFatefulEncounter() {
            return fatefulEncounter;
        }

        public void setFatefulEncounter(boolean fatefulEncounter) {
            this.fatefulEncounter = fatefulEncounter;
        }

        public int getRibbonCount() {
            return ribbonCount;
        }

        public void setRibbonCount(int ribbonCount) {
            this.ribbonCount = ribbonCount;
        }

        public int getStatusCondition() {
            return statusCondition;
        }

        public void setStatusCondition(int statusCondition) {
            this.statusCondition = statusCondition;
        }

        public int getStatLevel() {
            return statLevel;
        }

        public void setStatLevel(int statLevel) {
            this.statLevel = statLevel;
        }

        public int getHeldMailID() {
            return heldMailID;
        }

        public void setHeldMailID(int heldMailID) {
            this.heldMailID = heldMailID;
        }

        public int getStatHPCurrent() {
            return statHPCurrent;
        }

        public void setStatHPCurrent(int statHPCurrent) {
            this.statHPCurrent = statHPCurrent;
        }

        public int getStatHPMax() {
            return statHPMax;
        }

        public void setStatHPMax(int statHPMax) {
            this.statHPMax = statHPMax;
        }

        public int getStatATK() {
            return statATK;
        }

        public void setStatATK(int statATK) {
            this.statATK = statATK;
        }

        public int getStatDEF() {
            return statDEF;
        }

        public void setStatDEF(int statDEF) {
            this.statDEF = statDEF;
        }

        public int getStatSPE() {
            return statSPE;
        }

        public void setStatSPE(int statSPE) {
            this.statSPE = statSPE;
        }

        public int getStatSPA() {
            return statSPA;
        }

        public void setStatSPA(int statSPA) {
            this.statSPA = statSPA;
        }

        public int getStatSPD() {
            return statSPD;
        }

        public void setStatSPD(int statSPD) {
            this.statSPD = statSPD;
        }

        public boolean isChecksumValid() {
            return checksumValid;
        }

        public void setChecksumValid(boolean checksumValid) {
            this.checksumValid = checksumValid;
        }

        public int getMaxMoveID() {
            return maxMoveID;
        }

        public void setMaxMoveID(int maxMoveID) {
            this.maxMoveID = maxMoveID;
        }

        public int getMaxSpeciesID() {
            return maxSpeciesID;
        }

        public void setMaxSpeciesID(int maxSpeciesID) {
            this.maxSpeciesID = maxSpeciesID;
        }

        public int getMaxAbilityID() {
            return maxAbilityID;
        }

        public void setMaxAbilityID(int maxAbilityID) {
            this.maxAbilityID = maxAbilityID;
        }

        public int getMaxItemID() {
            return maxItemID;
        }

        public void setMaxItemID(int maxItemID) {
            this.maxItemID = maxItemID;
        }

        public int getMaxBallID() {
            return maxBallID;
        }

        public void setMaxBallID(int maxBallID) {
            this.maxBallID = maxBallID;
        }

        public int getMaxGameID() {
            return maxGameID;
        }

        public void setMaxGameID(int maxGameID) {
            this.maxGameID = maxGameID;
        }

        public int getMaxIV() {
            return maxIV;
        }

        public void setMaxIV(int maxIV) {
            this.maxIV = maxIV;
        }

        public int getMaxEV() {
            return maxEV;
        }

        public void setMaxEV(int maxEV) {
            this.maxEV = maxEV;
        }

        public int getMaxStringLengthTrainer() {
            return maxStringLengthTrainer;
        }

        public void setMaxStringLengthTrainer(int maxStringLengthTrainer) {
            this.maxStringLengthTrainer = maxStringLengthTrainer;
        }

        public int getMaxStringLengthNickname() {
            return maxStringLengthNickname;
        }

        public void setMaxStringLengthNickname(int maxStringLengthNickname) {
            this.maxStringLengthNickname = maxStringLengthNickname;
        }

        public int getPsv() {
            return psv;
        }

        public void setPsv(int psv) {
            this.psv = psv;
        }

        public int getTsv() {
            return tsv;
        }

        public void setTsv(int tsv) {
            this.tsv = tsv;
        }

        public boolean isJapanese() {
            return japanese;
        }

        public void setJapanese(boolean japanese) {
            this.japanese = japanese;
        }

        public int getAbility() {
            return ability;
        }

        public void setAbility(int ability) {
            this.ability = ability;
        }

        public long getEncryptionConstant() {
            return encryptionConstant;
        }

        public void setEncryptionConstant(long encryptionConstant) {
            this.encryptionConstant = encryptionConstant;
        }

        public int getNature() {
            return nature;
        }

        public void setNature(int nature) {
            this.nature = nature;
        }

        public boolean isNicknamed() {
            return isNicknamed;
        }

        public void setNicknamed(boolean nicknamed) {
            isNicknamed = nicknamed;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getCharacteristic() {
            return characteristic;
        }

        public void setCharacteristic(int characteristic) {
            this.characteristic = characteristic;
        }

        public int getCurrentFriendship() {
            return currentFriendship;
        }

        public void setCurrentFriendship(int currentFriendship) {
            this.currentFriendship = currentFriendship;
        }

        public int getCurrentHandler() {
            return currentHandler;
        }

        public void setCurrentHandler(int currentHandler) {
            this.currentHandler = currentHandler;
        }

        public int getEggLocation() {
            return eggLocation;
        }

        public void setEggLocation(int eggLocation) {
            this.eggLocation = eggLocation;
        }

        public int getMarkingCount() {
            return markingCount;
        }

        public void setMarkingCount(int markingCount) {
            this.markingCount = markingCount;
        }

        public boolean isMarkingCircle() {
            return markingCircle;
        }

        public void setMarkingCircle(boolean markingCircle) {
            this.markingCircle = markingCircle;
        }

        public boolean isMarkingTriangle() {
            return markingTriangle;
        }

        public void setMarkingTriangle(boolean markingTriangle) {
            this.markingTriangle = markingTriangle;
        }

        public boolean isMarkingSquare() {
            return markingSquare;
        }

        public void setMarkingSquare(boolean markingSquare) {
            this.markingSquare = markingSquare;
        }

        public boolean isMarkingHeart() {
            return markingHeart;
        }

        public void setMarkingHeart(boolean markingHeart) {
            this.markingHeart = markingHeart;
        }

        public int getForm() {
            return form;
        }

        public void setForm(int form) {
            this.form = form;
        }

        public int getAbilityNumber() {
            return abilityNumber;
        }

        public void setAbilityNumber(int abilityNumber) {
            this.abilityNumber = abilityNumber;
        }

        public boolean isValid() {
            return valid;
        }

        public void setValid(boolean valid) {
            this.valid = valid;
        }

        public String getExtension() {
            return extension;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }

        public String getEncryptedPartyData() {
            return encryptedPartyData;
        }

        public void setEncryptedPartyData(String encryptedPartyData) {
            this.encryptedPartyData = encryptedPartyData;
        }

        public String getEncryptedBoxData() {
            return encryptedBoxData;
        }

        public void setEncryptedBoxData(String encryptedBoxData) {
            this.encryptedBoxData = encryptedBoxData;
        }

        public String getDecryptedPartyData() {
            return decryptedPartyData;
        }

        public void setDecryptedPartyData(String decryptedPartyData) {
            this.decryptedPartyData = decryptedPartyData;
        }

        public String getDecryptedBoxData() {
            return decryptedBoxData;
        }

        public void setDecryptedBoxData(String decryptedBoxData) {
            this.decryptedBoxData = decryptedBoxData;
        }

        public int getFormat() {
            return format;
        }

        public void setFormat(int format) {
            this.format = format;
        }

        public int getTrainerIDDisplayFormat() {
            return trainerIDDisplayFormat;
        }

        public void setTrainerIDDisplayFormat(int trainerIDDisplayFormat) {
            this.trainerIDDisplayFormat = trainerIDDisplayFormat;
        }

        public int getStatNature() {
            return statNature;
        }

        public void setStatNature(int statNature) {
            this.statNature = statNature;
        }

        public Integer getTrainerTID7() {
            return trainerTID7;
        }

        public void setTrainerTID7(Integer trainerTID7) {
            this.trainerTID7 = trainerTID7;
        }

        public Integer getTrainerSID7() {
            return trainerSID7;
        }

        public void setTrainerSID7(Integer trainerSID7) {
            this.trainerSID7 = trainerSID7;
        }

        public int getDisplayTID() {
            return displayTID;
        }

        public void setDisplayTID(int displayTID) {
            this.displayTID = displayTID;
        }

        public int getDisplaySID() {
            return displaySID;
        }

        public void setDisplaySID(int displaySID) {
            this.displaySID = displaySID;
        }

        public boolean isKorean() {
            return korean;
        }

        public void setKorean(boolean korean) {
            this.korean = korean;
        }

        public int getMetYear() {
            return metYear;
        }

        public void setMetYear(int metYear) {
            this.metYear = metYear;
        }

        public int getMetMonth() {
            return metMonth;
        }

        public void setMetMonth(int metMonth) {
            this.metMonth = metMonth;
        }

        public int getMetDay() {
            return metDay;
        }

        public void setMetDay(int metDay) {
            this.metDay = metDay;
        }

        public String getMetDate() {
            return metDate;
        }

        public void setMetDate(String metDate) {
            this.metDate = metDate;
        }

        public String getHandlingTrainerName() {
            return handlingTrainerName;
        }

        public void setHandlingTrainerName(String handlingTrainerName) {
            this.handlingTrainerName = handlingTrainerName;
        }

        public int getHandlingTrainerGender() {
            return handlingTrainerGender;
        }

        public void setHandlingTrainerGender(int handlingTrainerGender) {
            this.handlingTrainerGender = handlingTrainerGender;
        }

        public int getHandlingTrainerFriendship() {
            return handlingTrainerFriendship;
        }

        public void setHandlingTrainerFriendship(int handlingTrainerFriendship) {
            this.handlingTrainerFriendship = handlingTrainerFriendship;
        }

        public int getEggYear() {
            return eggYear;
        }

        public void setEggYear(int eggYear) {
            this.eggYear = eggYear;
        }

        public int getEggMonth() {
            return eggMonth;
        }

        public void setEggMonth(int eggMonth) {
            this.eggMonth = eggMonth;
        }

        public int getEggDay() {
            return eggDay;
        }

        public void setEggDay(int eggDay) {
            this.eggDay = eggDay;
        }

        public String getEggMetDate() {
            return eggMetDate;
        }

        public void setEggMetDate(String eggMetDate) {
            this.eggMetDate = eggMetDate;
        }

        public Integer getRelearnMove1() {
            return relearnMove1;
        }

        public void setRelearnMove1(Integer relearnMove1) {
            this.relearnMove1 = relearnMove1;
        }

        public Integer getRelearnMove2() {
            return relearnMove2;
        }

        public void setRelearnMove2(Integer relearnMove2) {
            this.relearnMove2 = relearnMove2;
        }

        public int getRelearnMove3() {
            return relearnMove3;
        }

        public void setRelearnMove3(int relearnMove3) {
            this.relearnMove3 = relearnMove3;
        }

        public int getRelearnMove4() {
            return relearnMove4;
        }

        public void setRelearnMove4(int relearnMove4) {
            this.relearnMove4 = relearnMove4;
        }

        public int getMinGameID() {
            return minGameID;
        }

        public void setMinGameID(int minGameID) {
            this.minGameID = minGameID;
        }

        public boolean isShiny() {
            return isShiny;
        }

        public void setShiny(boolean shiny) {
            isShiny = shiny;
        }

        public int getShinyXor() {
            return shinyXor;
        }

        public void setShinyXor(int shinyXor) {
            this.shinyXor = shinyXor;
        }

        public boolean isE() {
            return e;
        }

        public void setE(boolean e) {
            this.e = e;
        }

        public boolean isFrlg() {
            return frlg;
        }

        public void setFrlg(boolean frlg) {
            this.frlg = frlg;
        }

        public boolean isPt() {
            return pt;
        }

        public void setPt(boolean pt) {
            this.pt = pt;
        }

        public boolean isHgss() {
            return hgss;
        }

        public void setHgss(boolean hgss) {
            this.hgss = hgss;
        }

        public boolean isBw() {
            return bw;
        }

        public void setBw(boolean bw) {
            this.bw = bw;
        }

        public boolean isB2w2() {
            return b2w2;
        }

        public void setB2w2(boolean b2w2) {
            this.b2w2 = b2w2;
        }

        public boolean isXy() {
            return xy;
        }

        public void setXy(boolean xy) {
            this.xy = xy;
        }

        public boolean isAo() {
            return ao;
        }

        public void setAo(boolean ao) {
            this.ao = ao;
        }

        public boolean isSm() {
            return sm;
        }

        public void setSm(boolean sm) {
            this.sm = sm;
        }

        public boolean isUsum() {
            return usum;
        }

        public void setUsum(boolean usum) {
            this.usum = usum;
        }

        public boolean isGo() {
            return go;
        }

        public void setGo(boolean go) {
            this.go = go;
        }

        public boolean isVc1() {
            return vc1;
        }

        public void setVc1(boolean vc1) {
            this.vc1 = vc1;
        }

        public boolean isVc2() {
            return vc2;
        }

        public void setVc2(boolean vc2) {
            this.vc2 = vc2;
        }

        public boolean isLgpe() {
            return lgpe;
        }

        public void setLgpe(boolean lgpe) {
            this.lgpe = lgpe;
        }

        public boolean isSwsh() {
            return swsh;
        }

        public void setSwsh(boolean swsh) {
            this.swsh = swsh;
        }

        public boolean isBdsp() {
            return bdsp;
        }

        public void setBdsp(boolean bdsp) {
            this.bdsp = bdsp;
        }

        public String getLa() {
            return la;
        }

        public void setLa(String la) {
            this.la = la;
        }

        public boolean isSv() {
            return sv;
        }

        public void setSv(boolean sv) {
            this.sv = sv;
        }

        public boolean isSvv() {
            return svv;
        }

        public void setSvv(boolean svv) {
            this.svv = svv;
        }

        public boolean isGoLGPE() {
            return goLGPE;
        }

        public void setGoLGPE(boolean goLGPE) {
            this.goLGPE = goLGPE;
        }

        public String getGoHome() {
            return goHome;
        }

        public void setGoHome(String goHome) {
            this.goHome = goHome;
        }

        public boolean isVc() {
            return vc;
        }

        public void setVc(boolean vc) {
            this.vc = vc;
        }

        public boolean isGg() {
            return gg;
        }

        public void setGg(boolean gg) {
            this.gg = gg;
        }

        public String getG() {
            return g;
        }

        public void setG(String g) {
            this.g = g;
        }

        public boolean isGen8() {
            return gen8;
        }

        public void setGen8(boolean gen8) {
            this.gen8 = gen8;
        }

        public String getGen7() {
            return gen7;
        }

        public void setGen7(String gen7) {
            this.gen7 = gen7;
        }

        public boolean isGen6() {
            return gen6;
        }

        public void setGen6(boolean gen6) {
            this.gen6 = gen6;
        }

        public String getGen5() {
            return gen5;
        }

        public void setGen5(String gen5) {
            this.gen5 = gen5;
        }

        public String getGen4() {
            return gen4;
        }

        public void setGen4(String gen4) {
            this.gen4 = gen4;
        }

        public boolean isGen3() {
            return gen3;
        }

        public void setGen3(boolean gen3) {
            this.gen3 = gen3;
        }

        public String getGen2() {
            return gen2;
        }

        public void setGen2(String gen2) {
            this.gen2 = gen2;
        }

        public boolean isGen1() {
            return gen1;
        }

        public void setGen1(boolean gen1) {
            this.gen1 = gen1;
        }

        public String getGen() {
            return gen;
        }

        public void setGen(String gen) {
            this.gen = gen;
        }

        public int getGeneration() {
            return generation;
        }

        public void setGeneration(int generation) {
            this.generation = generation;
        }

        public boolean isPokerusInfected() {
            return isPokerusInfected;
        }

        public void setPokerusInfected(boolean pokerusInfected) {
            isPokerusInfected = pokerusInfected;
        }

        public boolean isPokerusCured() {
            return isPokerusCured;
        }

        public void setPokerusCured(boolean pokerusCured) {
            isPokerusCured = pokerusCured;
        }

        public int getCurrentLevel() {
            return currentLevel;
        }

        public void setCurrentLevel(int currentLevel) {
            this.currentLevel = currentLevel;
        }

        public int getIvTotal() {
            return ivTotal;
        }

        public void setIvTotal(int ivTotal) {
            this.ivTotal = ivTotal;
        }

        public int getMaximumIV() {
            return maximumIV;
        }

        public void setMaximumIV(int maximumIV) {
            this.maximumIV = maximumIV;
        }

        public int getFlawlessIVCount() {
            return flawlessIVCount;
        }

        public void setFlawlessIVCount(int flawlessIVCount) {
            this.flawlessIVCount = flawlessIVCount;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFileNameWithoutExtension() {
            return fileNameWithoutExtension;
        }

        public void setFileNameWithoutExtension(String fileNameWithoutExtension) {
            this.fileNameWithoutExtension = fileNameWithoutExtension;
        }

        public int[] getIvs() {
            return ivs;
        }

        public void setIvs(int[] ivs) {
            this.ivs = ivs;
        }

        public int[] getStats() {
            return stats;
        }

        public void setStats(int[] stats) {
            this.stats = stats;
        }

        public int[] getMoves() {
            return moves;
        }

        public void setMoves(int[] moves) {
            this.moves = moves;
        }

        public int getMoveCount() {
            return moveCount;
        }

        public void setMoveCount(int moveCount) {
            this.moveCount = moveCount;
        }

        public int[] getRelearnMoves() {
            return relearnMoves;
        }

        public void setRelearnMoves(int[] relearnMoves) {
            this.relearnMoves = relearnMoves;
        }

        public int getPidAbility() {
            return pidAbility;
        }

        public void setPidAbility(int pidAbility) {
            this.pidAbility = pidAbility;
        }

        public int getHpPower() {
            return hpPower;
        }

        public void setHpPower(int hpPower) {
            this.hpPower = hpPower;
        }

        public int getHpType() {
            return hpType;
        }

        public void setHpType(int hpType) {
            this.hpType = hpType;
        }

        public boolean isWasEgg() {
            return wasEgg;
        }

        public void setWasEgg(boolean wasEgg) {
            this.wasEgg = wasEgg;
        }

        public boolean isWasTradedEgg() {
            return wasTradedEgg;
        }

        public void setWasTradedEgg(boolean wasTradedEgg) {
            this.wasTradedEgg = wasTradedEgg;
        }

        public boolean isTradedEgg() {
            return isTradedEgg;
        }

        public void setTradedEgg(boolean tradedEgg) {
            isTradedEgg = tradedEgg;
        }

        public boolean isUntraded() {
            return isUntraded;
        }

        public void setUntraded(boolean untraded) {
            isUntraded = untraded;
        }

        public boolean isOriginValid() {
            return isOriginValid;
        }

        public void setOriginValid(boolean originValid) {
            isOriginValid = originValid;
        }

        public boolean isHasOriginalMetLocation() {
            return hasOriginalMetLocation;
        }

        public void setHasOriginalMetLocation(boolean hasOriginalMetLocation) {
            this.hasOriginalMetLocation = hasOriginalMetLocation;
        }

        public int getPotentialRating() {
            return potentialRating;
        }

        public void setPotentialRating(int potentialRating) {
            this.potentialRating = potentialRating;
        }

        public boolean isPartyStatsPresent() {
            return partyStatsPresent;
        }

        public void setPartyStatsPresent(boolean partyStatsPresent) {
            this.partyStatsPresent = partyStatsPresent;
        }

        public int getHpBitValPower() {
            return hpBitValPower;
        }

        public void setHpBitValPower(int hpBitValPower) {
            this.hpBitValPower = hpBitValPower;
        }

        public int getHpBitValType() {
            return hpBitValType;
        }

        public void setHpBitValType(int hpBitValType) {
            this.hpBitValType = hpBitValType;
        }
    }

    public static class PersonalInfo {
        @SerializedName("HP")
        private int hp;

        @SerializedName("ATK")
        private int atk;

        @SerializedName("DEF")
        private int def;

        @SerializedName("SPE")
        private int spe;

        @SerializedName("SPA")
        private int spa;

        @SerializedName("SPD")
        private int spd;

        @SerializedName("Type1")
        private int type1;

        @SerializedName("Type2")
        private int type2;

        @SerializedName("CatchRate")
        private int catchRate;

        @SerializedName("BaseEXP")
        private int baseEXP;

        @SerializedName("EVYield")
        private int evYield;

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

        @SerializedName("Item1")
        private int item1;

        @SerializedName("Item2")
        private int item2;

        @SerializedName("Gender")
        private int gender;

        @SerializedName("HatchCycles")
        private int hatchCycles;

        @SerializedName("BaseFriendship")
        private int baseFriendship;

        @SerializedName("EXPGrowth")
        private int expGrowth;

        @SerializedName("EggGroup1")
        private int eggGroup1;

        @SerializedName("EggGroup2")
        private int eggGroup2;

        @SerializedName("Ability1")
        private int ability1;

        @SerializedName("Ability2")
        private int ability2;

        @SerializedName("EscapeRate")
        private int escapeRate;

        @SerializedName("Color")
        private int color;

        @SerializedName("NoCustom")
        private boolean noFlip;

        @SerializedName("AbilityCount")
        private int abilityCount;

        @SerializedName("HasSecondAbility")
        private boolean hasSecondAbility;

        @SerializedName("TMHM")
        private boolean[] tmHm;

        @SerializedName("TypeTutors")
        private boolean[] typeTutors;

        @SerializedName("EvoStage")
        private int evoStage;

        @SerializedName("FormCount")
        private int formCount;

        @SerializedName("FormStatsIndex")
        private int formStatsIndex;

        @SerializedName("Height")
        private int height;

        @SerializedName("Weight")
        private int weight;

        @SerializedName("IsDualGender")
        private boolean isDualGender;

        @SerializedName("Genderless")
        private boolean genderless;

        @SerializedName("OnlyFemale")
        private boolean onlyFemale;

        @SerializedName("OnlyMale")
        private boolean onlyMale;

        @SerializedName("HasForms")
        private boolean hasForms;

        // Getters and setters
        public int getHp() { return hp; }
        public void setHp(int hp) { this.hp = hp; }
        public int getMax() { return atk; }
        public void setAt(int atk) { this.atk = atk; }
        public int getDef() { return def; }
        public void setDef(int def) { this.def = def; }
        public int getSpe() { return spe; }
        public void setSpe(int spe) { this.spe = spe; }
        public int getSpa() { return spa; }
        public void setSpa(int spa) { this.spa = spa; }
        public int getSpd() { return spd; }
        public void setSpd(int spd) { this.spd = spd; }
        public int getType1() { return type1; }
        public void setType1(int type1) { this.type1 = type1; }
        public int getType2() { return type2; }
        public void setType2(int type2) { this.type2 = type2; }
        public int getCatchRate() { return catchRate; }
        public void setCatchRate(int catchRate) { this.catchRate = catchRate; }
        public int getBaseEXP() { return baseEXP; }
        public void setBaseEXP(int baseEXP) { this.baseEXP = baseEXP; }
        public int getEvYield() { return evYield; }
        public void setEvYield(int evYield) { this.evYield = evYield; }
        public int getEvHP() { return evHP; }
        public void setEvHP(int evHP) { this.evHP = evHP; }
        public int getEvATK() { return evATK; }
        public void setEvATK(int evATK) { this.evATK = evATK; }
        public int getEvDEF() { return evDEF; }
        public void setEvDEF(int evDEF) { this.evDEF = evDEF; }
        public int getEvSPE() { return evSPE; }
        public void setEvSPE(int evSPE) { this.evSPE = evSPE; }
        public int getEvSPA() { return evSPA; }
        public void setEvSPA(int evSPA) { this.evSPA = evSPA; }
        public int getEvSPD() { return evSPD; }
        public void setEvSPD(int evSPD) { this.evSPD = evSPD; }
        public int getItem1() { return item1; }
        public void setItem1(int item1) { this.item1 = item1; }
        public int getItem2() { return item2; }
        public void setItem2(int item2) { this.item2 = item2; }
        public int getGender() { return gender; }
        public void setGender(int gender) { this.gender = gender; }
        public int getHatchCycles() { return hatchCycles; }
        public void setHatchCycles(int hatchCycles) { this.hatchCycles = hatchCycles; }
        public int getBaseFriendship() { return baseFriendship; }
        public void setBaseFriendship(int baseFriendship) { this.baseFriendship = baseFriendship; }
        public int getExpGrowth() { return this.expGrowth; }
        public void setExpGrowth(int growth) { this.expGrowth = growth;}
        public int getEggGroup1() { return eggGroup1; }
        public void setEggGroup1(int eggGroup1) { this.eggGroup1 = eggGroup1; }
        public int getEggGroup2() { return eggGroup2; }
        public void setEggGroup2(int eggGroup2) { this.eggGroup2 = eggGroup2; }
        public int getAbility1() { return ability1; }
        public void setAbility1(int ability1) { this.ability1 = ability1; }
        public int getAbility2() { return ability2; }
        public void setAbility2(int ability2) { this.ability2 = ability2; }
        public int getEscapeRate() { return escapeRate; }
        public void setEscapeRate(int escapeRate) { this.escapeRate = escapeRate; }
        public int getColor() { return color; }
        public void setColor(int color) { this.color = color; }
        public boolean isNoFlip() { return noFlip; }
        public void setNoFlip(boolean noFlip) { this.noFlip = noFlip; }
        public int getAbilityCount() { return abilityCount; }
        public void setAbilityCount(int abilityCount) { this.abilityCount = abilityCount; }
        public boolean isHasSecondAbility() { return hasSecondAbility; }
        public void setHasSecondAbility(boolean hasSecondAbility) { this.hasSecondAbility = hasSecondAbility; }
        public boolean[] getTmHm() { return tmHm; }
        public void setTmHm(boolean[] tmHm) { this.tmHm = tmHm; }
        public boolean[] getTypeTutors() { return typeTutors; }
        public void setTypeTutors(boolean[] typeTutors) { this.typeTutors = typeTutors; }
        public int getEvoStage() { return evoStage; }
        public void setEvoStage(int evoStage) { this.evoStage = evoStage; }
        public int getFormCount() { return formCount; }
        public void setFormCount(int formCount) { this.formCount = formCount; }
        public int getFormStatsIndex() { return formStatsIndex; }
        public void setFormStatsIndex(int index) { this.formStatsIndex = formStatsIndex; }
        public int getHeight() { return height; }
        public void setHeight(int height) { this.height = height; }
        public int getWeight() { return weight; }
        public void setWeight(int weight) { this.weight = weight; }
        public boolean isIsDualGender() { return isDualGender; }
        public void setIsDualGender(boolean isDualGender) { this.isDualGender = isDualGender; }
        public boolean isGenderless() { return genderless; }
        public void setGenderless(boolean genderless) { this.genderless = genderless; }
        public boolean isOnlyFemale() { return onlyFemale; }
        public void setOnlyFemale(boolean onlyFemale) { this.onlyFemale = onlyFemale; }
        public boolean isOnlyMale() { return onlyMale; }
        public void setOnlyMale(boolean onlyMale) { this.onlyMale = onlyMale; }
        public boolean isHasForms() { return hasForms; }
        public void setHasForms(boolean hasForms) { this.hasForms = hasForms; }
    }
}