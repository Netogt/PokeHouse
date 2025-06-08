package com.sdev.pokehome.domain.dto;
import java.util.List;

public class PokeSav {
    private int version;
    private long securityKey;
    private int partyCount;
    private int money;
    private int coin;
    private String rivalName;
    private int language;
    private int generation;
    private String ot;
    private int gender;
    private long id32;
    private int tid16;
    private int sid16;
    private int badges;
    List<Inventory> inventory;
    private String playTimeString;
     List<PartyData> partyData;
    private int seenCount;
    private int caughtCount;
     List<BoxData> boxData;

    // Getters and Setters
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
    public List<BoxData> getBoxData() { return boxData; }
    public void setBoxData(List<BoxData> boxData) { this.boxData = boxData; }
}

class Inventory {
    private int type;
    private Object info;
    private int maxCount;
    private List<Item> items;
    private int offset;
    private int pouchDataSize;
    private long securityKey;
    private int count;
    private boolean isCramped;

    // Getters and Setters
    public int getType() { return type; }
    public void setType(int type) { this.type = type; }
    public Object getInfo() { return info; }
    public void setInfo(Object info) { this.info = info; }
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
    public void setCramped(boolean isCramped) { this.isCramped = isCramped; }
}

class Item {
    private int index;
    private int count;

    // Getters and Setters
    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }
    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}

class PartyData {
    private String data;
    private int sizeParty;
    private int sizeStored;
    private int context;
    private PersonalInfo personalInfo;
    private int trashCharCountTrainer;
    private int trashCharCountNickname;
    private long pid;
    private long id32;
    private int tid16;
    private int sid16;
    private String nickname;
    private int language;
    private boolean flagIsBadEgg;
    private boolean flagHasSpecies;
    private boolean flagIsEgg;
    private String originalTrainerName;
    private int markingValue;
    private int checksum;
    private int sanity;
    private int speciesInternal;
    private int species;
    private int spriteItem;
    private int heldItem;
    private int exp;
    private int ppUps;
    private int move1PPUps;
    private int move2PPUps;
    private int move3PPUps;
    private int move4PPUps;
    private int originalTrainerFriendship;
    private int move1;
    private int move2;
    private int move3;
    private int move4;
    private int move1PP;
    private int move2PP;
    private int move3PP;
    private int move4PP;
    private int evHP;
    private int evATK;
    private int evDEF;
    private int evSPE;
    private int evSPA;
    private int evSPD;
    private int contestCool;
    private int contestBeauty;
    private int contestCute;
    private int contestSmart;
    private int contestTough;
    private int contestSheen;
    private int pokerusState;
    private int pokerusDays;
    private int pokerusStrain;
    private int metLocation;
    private int origins;
    private int metLevel;
    private int version;
    private int ball;
    private int originalTrainerGender;
    private long iv32;
    private int ivHP;
    private int ivATK;
    private int ivDEF;
    private int ivSPE;
    private int ivSPA;
    private int ivSPD;
    private boolean isEgg;
    private boolean abilityBit;
    private int rib0;
    private int ribbonCountG3Cool;
    private int ribbonCountG3Beauty;
    private int ribbonCountG3Cute;
    private int ribbonCountG3Smart;
    private int ribbonCountG3Tough;
    private boolean ribbonChampionG3;
    private boolean ribbonWinning;
    private boolean ribbonVictory;
    private boolean ribbonArtist;
    private boolean ribbonEffort;
    private boolean ribbonChampionBattle;
    private boolean ribbonChampionRegional;
    private boolean ribbonChampionNational;
    private boolean ribbonCountry;
    private boolean ribbonNational;
    private boolean ribbonEarth;
    private boolean ribbonWorld;
    private boolean unused1;
    private boolean unused2;
    private boolean unused3;
    private boolean unused4;
    private boolean fatefulEncounter;
    private int ribbonCount;
    private int statusCondition;
    private int statLevel;
    private int heldMailID;
    private int statHPCurrent;
    private int statHPMax;
    private int statATK;
    private int statDEF;
    private int statSPE;
    private int statSPA;
    private int statSPD;
    private boolean checksumValid;
    private int maxMoveID;
    private int maxSpeciesID;
    private int maxAbilityID;
    private int maxItemID;
    private int maxBallID;
    private int maxGameID;
    private int maxIV;
    private int maxEV;
    private int maxStringLengthTrainer;
    private int maxStringLengthNickname;
    private int psv;
    private int tsv;
    private boolean japanese;
    private int ability;
    private long encryptionConstant;
    private int nature;
    private boolean isNicknamed;
    private int gender;
    private int characteristic;
    private int currentFriendship;
    private int currentHandler;
    private int eggLocation;
    private int markingCount;
    private boolean markingCircle;
    private boolean markingTriangle;
    private boolean markingSquare;
    private boolean markingHeart;
    private int form;
    private int abilityNumber;
    private boolean valid;
    private String extension;
    private String encryptedPartyData;
    private String encryptedBoxData;
    private String decryptedPartyData;
    private String decryptedBoxData;
    private int format;
    private int trainerIDDisplayFormat;
    private int statNature;
    private int trainerTID7;
    private int trainerSID7;
    private int displayTID;
    private int displaySID;
    private boolean korean;
    private int metYear;
    private int metMonth;
    private int metDay;
    private String handlingTrainerName;
    private int handlingTrainerGender;
    private int handlingTrainerFriendship;
    private Object metDate;
    private int eggYear;
    private int eggMonth;
    private int eggDay;
    private Object eggMetDate;
    private int relearnMove1;
    private int relearnMove2;
    private int relearnMove3;
    private int relearnMove4;
    private int minGameID;
    private boolean isShiny;
    private int shinyXor;
    private boolean e;
    private boolean frlg;
    private boolean pt;
    private boolean hgss;
    private boolean bw;
    private boolean b2w2;
    private boolean xy;
    private boolean ao;
    private boolean sm;
    private boolean usum;
    private boolean go;
    private boolean vc1;
    private boolean vc2;
    private boolean lgpe;
    private boolean swsh;
    private boolean bdsp;
    private boolean la;
    private boolean sv;
    private boolean goLgpe;
    private boolean goHome;
    private boolean vc;
    private boolean gg;
    private boolean gen9;
    private boolean gen8;
    private boolean gen7;
    private boolean gen6;
    private boolean gen5;
    private boolean gen4;
    private boolean gen3;
    private boolean gen2;
    private boolean gen1;
    private boolean genU;
    private int generation;
    private boolean isPokerusInfected;
    private boolean isPokerusCured;
    private int currentLevel;
    private int ivTotal;
    private int maximumIV;
    private int flawlessIVCount;
    private String fileName;
    private String fileNameWithoutExtension;
    private List<Integer> ivs;
    private List<Integer> stats;
    private List<Integer> moves;
    private int moveCount;
    private List<Integer> relearnMoves;
    private int pidAbility;
    private int hpPower;
    private int hpType;
    private boolean wasEgg;
    private boolean wasTradedEgg;
    private boolean isTradedEgg;
    private boolean isUntraded;
    private boolean isOriginValid;
    private boolean hasOriginalMetLocation;
    private int potentialRating;
    private boolean partyStatsPresent;
    private int hpBitValPower;
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

    public int getTrainerTID7() {
        return trainerTID7;
    }

    public void setTrainerTID7(int trainerTID7) {
        this.trainerTID7 = trainerTID7;
    }

    public int getTrainerSID7() {
        return trainerSID7;
    }

    public void setTrainerSID7(int trainerSID7) {
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

    public Object getMetDate() {
        return metDate;
    }

    public void setMetDate(Object metDate) {
        this.metDate = metDate;
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

    public Object getEggMetDate() {
        return eggMetDate;
    }

    public void setEggMetDate(Object eggMetDate) {
        this.eggMetDate = eggMetDate;
    }

    public int getRelearnMove1() {
        return relearnMove1;
    }

    public void setRelearnMove1(int relearnMove1) {
        this.relearnMove1 = relearnMove1;
    }

    public int getRelearnMove2() {
        return relearnMove2;
    }

    public void setRelearnMove2(int relearnMove2) {
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

    public boolean isLa() {
        return la;
    }

    public void setLa(boolean la) {
        this.la = la;
    }

    public boolean isSv() {
        return sv;
    }

    public void setSv(boolean sv) {
        this.sv = sv;
    }

    public boolean isGoLgpe() {
        return goLgpe;
    }

    public void setGoLgpe(boolean goLgpe) {
        this.goLgpe = goLgpe;
    }

    public boolean isGoHome() {
        return goHome;
    }

    public void setGoHome(boolean goHome) {
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

    public boolean isGen9() {
        return gen9;
    }

    public void setGen9(boolean gen9) {
        this.gen9 = gen9;
    }

    public boolean isGen8() {
        return gen8;
    }

    public void setGen8(boolean gen8) {
        this.gen8 = gen8;
    }

    public boolean isGen7() {
        return gen7;
    }

    public void setGen7(boolean gen7) {
        this.gen7 = gen7;
    }

    public boolean isGen6() {
        return gen6;
    }

    public void setGen6(boolean gen6) {
        this.gen6 = gen6;
    }

    public boolean isGen5() {
        return gen5;
    }

    public void setGen5(boolean gen5) {
        this.gen5 = gen5;
    }

    public boolean isGen4() {
        return gen4;
    }

    public void setGen4(boolean gen4) {
        this.gen4 = gen4;
    }

    public boolean isGen3() {
        return gen3;
    }

    public void setGen3(boolean gen3) {
        this.gen3 = gen3;
    }

    public boolean isGen2() {
        return gen2;
    }

    public void setGen2(boolean gen2) {
        this.gen2 = gen2;
    }

    public boolean isGen1() {
        return gen1;
    }

    public void setGen1(boolean gen1) {
        this.gen1 = gen1;
    }

    public boolean isGenU() {
        return genU;
    }

    public void setGenU(boolean genU) {
        this.genU = genU;
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

    public List<Integer> getIvs() {
        return ivs;
    }

    public void setIvs(List<Integer> ivs) {
        this.ivs = ivs;
    }

    public List<Integer> getStats() {
        return stats;
    }

    public void setStats(List<Integer> stats) {
        this.stats = stats;
    }

    public List<Integer> getMoves() {
        return moves;
    }

    public void setMoves(List<Integer> moves) {
        this.moves = moves;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public List<Integer> getRelearnMoves() {
        return relearnMoves;
    }

    public void setRelearnMoves(List<Integer> relearnMoves) {
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

class BoxData {
    private String data;
    private int sizeParty;
    private int sizeStored;
    private int context;
    private PersonalInfo personalInfo;
    private int trashCharCountTrainer;
    private int trashCharCountNickname;
    private long pid;
    private long id32;
    private int tid16;
    private int sid16;
    private String nickname;
    private int language;
    private boolean flagIsBadEgg;
    private boolean flagHasSpecies;
    private boolean flagIsEgg;
    private String originalTrainerName;
    private int markingValue;
    private int checksum;
    private int sanity;
    private int speciesInternal;
    private int species;
    private int spriteItem;
    private int heldItem;
    private int exp;
    private int ppUps;
    private int move1PPUps;
    private int move2PPUps;
    private int move3PPUps;
    private int move4PPUps;
    private int originalTrainerFriendship;
    private int move1;
    private int move2;
    private int move3;
    private int move4;
    private int move1PP;
    private int move2PP;
    private int move3PP;
    private int move4PP;
    private int evHP;
    private int evATK;
    private int evDEF;
    private int evSPE;
    private int evSPA;
    private int evSPD;
    private int contestCool;
    private int contestBeauty;
    private int contestCute;
    private int contestSmart;
    private int contestTough;
    private int contestSheen;
    private int pokerusState;
    private int pokerusDays;
    private int pokerusStrain;
    private int metLocation;
    private int origins;
    private int metLevel;
    private int version;
    private int ball;
    private int originalTrainerGender;
    private long iv32;
    private int ivHP;
    private int ivATK;
    private int ivDEF;
    private int ivSPE;
    private int ivSPA;
    private int ivSPD;
    private boolean isEgg;
    private boolean abilityBit;
    private int rib0;
    private int ribbonCountG3Cool;
    private int ribbonCountG3Beauty;
    private int ribbonCountG3Cute;
    private int ribbonCountG3Smart;
    private int ribbonCountG3Tough;
    private boolean ribbonChampionG3;
    private boolean ribbonWinning;
    private boolean ribbonVictory;
    private boolean ribbonArtist;
    private boolean ribbonEffort;
    private boolean ribbonChampionBattle;
    private boolean ribbonChampionRegional;
    private boolean ribbonChampionNational;
    private boolean ribbonCountry;
    private boolean ribbonNational;
    private boolean ribbonEarth;
    private boolean ribbonWorld;
    private boolean unused1;
    private boolean unused2;
    private boolean unused3;
    private boolean unused4;
    private boolean fatefulEncounter;
    private int ribbonCount;
    private int statusCondition;
    private int statLevel;
    private int heldMailID;
    private int statHPCurrent;
    private int statHPMax;
    private int statATK;
    private int statDEF;
    private int statSPE;
    private int statSPA;
    private int statSPD;
    private boolean checksumValid;
    private int maxMoveID;
    private int maxSpeciesID;
    private int maxAbilityID;
    private int maxItemID;
    private int maxBallID;
    private int maxGameID;
    private int maxIV;
    private int maxEV;
    private int maxStringLengthTrainer;
    private int maxStringLengthNickname;
    private int psv;
    private int tsv;
    private boolean japanese;
    private int ability;
    private long encryptionConstant;
    private int nature;
    private boolean isNicknamed;
    private int gender;
    private int characteristic;
    private int currentFriendship;
    private int currentHandler;
    private int eggLocation;
    private int markingCount;
    private boolean markingCircle;
    private boolean markingTriangle;
    private boolean markingSquare;
    private boolean markingHeart;
    private int form;
    private int abilityNumber;
    private boolean valid;
    private String extension;
    private String encryptedPartyData;
    private String encryptedBoxData;
    private String decryptedPartyData;
    private String decryptedBoxData;
    private int format;
    private int trainerIDDisplayFormat;
    private int statNature;
    private int trainerTID7;
    private int trainerSID7;
    private int displayTID;
    private int displaySID;
    private boolean korean;
    private int metYear;
    private int metMonth;
    private int metDay;
    private String handlingTrainerName;
    private int handlingTrainerGender;
    private int handlingTrainerFriendship;
    private Object metDate;
    private int eggYear;
    private int eggMonth;
    private int eggDay;
    private Object eggMetDate;
    private int relearnMove1;
    private int relearnMove2;
    private int relearnMove3;
    private int relearnMove4;
    private int minGameID;
    private boolean isShiny;
    private int shinyXor;
    private boolean e;
    private boolean frlg;
    private boolean pt;
    private boolean hgss;
    private boolean bw;
    private boolean b2w2;
    private boolean xy;
    private boolean ao;
    private boolean sm;
    private boolean usum;
    private boolean go;
    private boolean vc1;
    private boolean vc2;
    private boolean lgpe;
    private boolean swsh;
    private boolean bdsp;
    private boolean la;
    private boolean sv;
    private boolean goLgpe;
    private boolean goHome;
    private boolean vc;
    private boolean gg;
    private boolean gen9;
    private boolean gen8;
    private boolean gen7;
    private boolean gen6;
    private boolean gen5;
    private boolean gen4;
    private boolean gen3;
    private boolean gen2;
    private boolean gen1;
    private boolean genU;
    private int generation;
    private boolean isPokerusInfected;
    private boolean isPokerusCured;
    private int currentLevel;
    private int ivTotal;
    private int maximumIV;
    private int flawlessIVCount;
    private String fileName;
    private String fileNameWithoutExtension;
    private List<Integer> ivs;
    private List<Integer> stats;
    private List<Integer> moves;
    private int moveCount;
    private List<Integer> relearnMoves;
    private int pidAbility;
    private int hpPower;
    private int hpType;
    private boolean wasEgg;
    private boolean wasTradedEgg;
    private boolean isTradedEgg;
    private boolean isUntraded;
    private boolean isOriginValid;
    private boolean hasOriginalMetLocation;
    private int potentialRating;
    private boolean partyStatsPresent;
    private int hpBitValPower;
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

    public int getTrainerTID7() {
        return trainerTID7;
    }

    public void setTrainerTID7(int trainerTID7) {
        this.trainerTID7 = trainerTID7;
    }

    public int getTrainerSID7() {
        return trainerSID7;
    }

    public void setTrainerSID7(int trainerSID7) {
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

    public Object getMetDate() {
        return metDate;
    }

    public void setMetDate(Object metDate) {
        this.metDate = metDate;
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

    public Object getEggMetDate() {
        return eggMetDate;
    }

    public void setEggMetDate(Object eggMetDate) {
        this.eggMetDate = eggMetDate;
    }

    public int getRelearnMove1() {
        return relearnMove1;
    }

    public void setRelearnMove1(int relearnMove1) {
        this.relearnMove1 = relearnMove1;
    }

    public int getRelearnMove2() {
        return relearnMove2;
    }

    public void setRelearnMove2(int relearnMove2) {
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

    public boolean isLa() {
        return la;
    }

    public void setLa(boolean la) {
        this.la = la;
    }

    public boolean isSv() {
        return sv;
    }

    public void setSv(boolean sv) {
        this.sv = sv;
    }

    public boolean isGoLgpe() {
        return goLgpe;
    }

    public void setGoLgpe(boolean goLgpe) {
        this.goLgpe = goLgpe;
    }

    public boolean isGoHome() {
        return goHome;
    }

    public void setGoHome(boolean goHome) {
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

    public boolean isGen9() {
        return gen9;
    }

    public void setGen9(boolean gen9) {
        this.gen9 = gen9;
    }

    public boolean isGen8() {
        return gen8;
    }

    public void setGen8(boolean gen8) {
        this.gen8 = gen8;
    }

    public boolean isGen7() {
        return gen7;
    }

    public void setGen7(boolean gen7) {
        this.gen7 = gen7;
    }

    public boolean isGen6() {
        return gen6;
    }

    public void setGen6(boolean gen6) {
        this.gen6 = gen6;
    }

    public boolean isGen5() {
        return gen5;
    }

    public void setGen5(boolean gen5) {
        this.gen5 = gen5;
    }

    public boolean isGen4() {
        return gen4;
    }

    public void setGen4(boolean gen4) {
        this.gen4 = gen4;
    }

    public boolean isGen3() {
        return gen3;
    }

    public void setGen3(boolean gen3) {
        this.gen3 = gen3;
    }

    public boolean isGen2() {
        return gen2;
    }

    public void setGen2(boolean gen2) {
        this.gen2 = gen2;
    }

    public boolean isGen1() {
        return gen1;
    }

    public void setGen1(boolean gen1) {
        this.gen1 = gen1;
    }

    public boolean isGenU() {
        return genU;
    }

    public void setGenU(boolean genU) {
        this.genU = genU;
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

    public List<Integer> getIvs() {
        return ivs;
    }

    public void setIvs(List<Integer> ivs) {
        this.ivs = ivs;
    }

    public List<Integer> getStats() {
        return stats;
    }

    public void setStats(List<Integer> stats) {
        this.stats = stats;
    }

    public List<Integer> getMoves() {
        return moves;
    }

    public void setMoves(List<Integer> moves) {
        this.moves = moves;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public List<Integer> getRelearnMoves() {
        return relearnMoves;
    }

    public void setRelearnMoves(List<Integer> relearnMoves) {
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

class PersonalInfo {
    private int hp;
    private int atk;
    private int def;
    private int spe;
    private int spa;
    private int spd;
    private int type1;
    private int type2;
    private int catchRate;
    private int baseEXP;
    private int evYield;
    private int evHP;
    private int evATK;
    private int evDEF;
    private int evSPE;
    private int evSPA;
    private int evSPD;
    private int item1;
    private int item2;
    private int gender;
    private int hatchCycles;
    private int baseFriendship;
    private int expGrowth;
    private int eggGroup1;
    private int eggGroup2;
    private int ability1;
    private int ability2;
    private int escapeRate;
    private int color;
    private boolean noFlip;
    private int abilityCount;
    private boolean hasSecondAbility;
    private List<Boolean> tmhm;
    private List<Boolean> typeTutors;
    private int evoStage;
    private int formCount;
    private int formStatsIndex;
    private int height;
    private int weight;
    private boolean isDualGender;
    private boolean genderless;
    private boolean onlyFemale;
    private boolean onlyMale;
    private boolean hasForms;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpe() {
        return spe;
    }

    public void setSpe(int spe) {
        this.spe = spe;
    }

    public int getSpa() {
        return spa;
    }

    public void setSpa(int spa) {
        this.spa = spa;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getType1() {
        return type1;
    }

    public void setType1(int type1) {
        this.type1 = type1;
    }

    public int getType2() {
        return type2;
    }

    public void setType2(int type2) {
        this.type2 = type2;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(int catchRate) {
        this.catchRate = catchRate;
    }

    public int getBaseEXP() {
        return baseEXP;
    }

    public void setBaseEXP(int baseEXP) {
        this.baseEXP = baseEXP;
    }

    public int getEvYield() {
        return evYield;
    }

    public void setEvYield(int evYield) {
        this.evYield = evYield;
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

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getHatchCycles() {
        return hatchCycles;
    }

    public void setHatchCycles(int hatchCycles) {
        this.hatchCycles = hatchCycles;
    }

    public int getBaseFriendship() {
        return baseFriendship;
    }

    public void setBaseFriendship(int baseFriendship) {
        this.baseFriendship = baseFriendship;
    }

    public int getExpGrowth() {
        return expGrowth;
    }

    public void setExpGrowth(int expGrowth) {
        this.expGrowth = expGrowth;
    }

    public int getEggGroup1() {
        return eggGroup1;
    }

    public void setEggGroup1(int eggGroup1) {
        this.eggGroup1 = eggGroup1;
    }

    public int getEggGroup2() {
        return eggGroup2;
    }

    public void setEggGroup2(int eggGroup2) {
        this.eggGroup2 = eggGroup2;
    }

    public int getAbility1() {
        return ability1;
    }

    public void setAbility1(int ability1) {
        this.ability1 = ability1;
    }

    public int getAbility2() {
        return ability2;
    }

    public void setAbility2(int ability2) {
        this.ability2 = ability2;
    }

    public int getEscapeRate() {
        return escapeRate;
    }

    public void setEscapeRate(int escapeRate) {
        this.escapeRate = escapeRate;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isNoFlip() {
        return noFlip;
    }

    public void setNoFlip(boolean noFlip) {
        this.noFlip = noFlip;
    }

    public int getAbilityCount() {
        return abilityCount;
    }

    public void setAbilityCount(int abilityCount) {
        this.abilityCount = abilityCount;
    }

    public boolean isHasSecondAbility() {
        return hasSecondAbility;
    }

    public void setHasSecondAbility(boolean hasSecondAbility) {
        this.hasSecondAbility = hasSecondAbility;
    }

    public List<Boolean> getTmhm() {
        return tmhm;
    }

    public void setTmhm(List<Boolean> tmhm) {
        this.tmhm = tmhm;
    }

    public List<Boolean> getTypeTutors() {
        return typeTutors;
    }

    public void setTypeTutors(List<Boolean> typeTutors) {
        this.typeTutors = typeTutors;
    }

    public int getEvoStage() {
        return evoStage;
    }

    public void setEvoStage(int evoStage) {
        this.evoStage = evoStage;
    }

    public int getFormCount() {
        return formCount;
    }

    public void setFormCount(int formCount) {
        this.formCount = formCount;
    }

    public int getFormStatsIndex() {
        return formStatsIndex;
    }

    public void setFormStatsIndex(int formStatsIndex) {
        this.formStatsIndex = formStatsIndex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isDualGender() {
        return isDualGender;
    }

    public void setDualGender(boolean dualGender) {
        isDualGender = dualGender;
    }

    public boolean isGenderless() {
        return genderless;
    }

    public void setGenderless(boolean genderless) {
        this.genderless = genderless;
    }

    public boolean isOnlyFemale() {
        return onlyFemale;
    }

    public void setOnlyFemale(boolean onlyFemale) {
        this.onlyFemale = onlyFemale;
    }

    public boolean isOnlyMale() {
        return onlyMale;
    }

    public void setOnlyMale(boolean onlyMale) {
        this.onlyMale = onlyMale;
    }

    public boolean isHasForms() {
        return hasForms;
    }

    public void setHasForms(boolean hasForms) {
        this.hasForms = hasForms;
    }
}