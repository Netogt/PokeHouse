package com.sdev.pokehome.domain.entity;

import com.google.gson.annotations.SerializedName;

public class Item {
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
