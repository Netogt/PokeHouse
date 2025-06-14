package com.sdev.pokehome.domain.entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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


}
