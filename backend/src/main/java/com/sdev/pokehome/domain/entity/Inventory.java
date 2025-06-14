package com.sdev.pokehome.domain.entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

}
