package com.sdev.pokehome.domain.entity;

import com.google.gson.annotations.SerializedName;

public class PersonalInfo {
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
