package com.gadre.vehical_manufacture.data;

public class VehicalType {

    private Boolean isPrimary;
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
