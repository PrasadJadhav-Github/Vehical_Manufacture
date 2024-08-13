package com.gadre.vehical_manufacture.data;

import com.google.gson.annotations.SerializedName;

public class VehicalType {

    @SerializedName("IsPrimary")
    private Boolean isPrimary;
    @SerializedName("Name")
    private String name;

    public VehicalType(Boolean isPrimary, String name) {
        this.isPrimary = isPrimary;
        this.name = name;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getName() {
        return name;
    }

    public void setIsPrimary(String name) {
        this.name = name;
    }
}
