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
public class Item {
    @SerializedName("Index")
    private int index;

    @SerializedName("Count")
    private int count;

}
