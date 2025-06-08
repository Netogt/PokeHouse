package com.sdev.pokehome.domain.entity;
import com.google.gson.annotations.SerializedName;

import java.util.List;

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
    public List<PokeEntity> getPartyData() { return partyData; }
    public void setPartyData(List<PokeEntity> partyData) { this.partyData = partyData; }
    public int getSeenCount() { return seenCount; }
    public void setSeenCount(int seenCount) { this.seenCount = seenCount; }
    public int getCaughtCount() { return caughtCount; }
    public void setCaughtCount(int caughtCount) { this.caughtCount = caughtCount; }
    public List<PokeEntity> getBoxData() { return boxData; }
    public void setBoxData(List<PokeEntity> boxData) { this.boxData = boxData; }




}