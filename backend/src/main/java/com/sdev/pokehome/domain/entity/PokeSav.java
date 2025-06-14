package com.sdev.pokehome.domain.entity;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private List<PokeEntity> partyData;

    @SerializedName("SeenCount")
    private int seenCount;

    @SerializedName("CaughtCount")
    private int caughtCount;

    @SerializedName("BoxData")
    private List<PokeEntity> boxData;
}