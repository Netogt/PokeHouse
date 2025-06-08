package com.sdev.pokehome.domain.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class Inventory {
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
