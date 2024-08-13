package com.gadre.vehical_manufacture.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Manufacturer {
    @SerializedName("Country")
    private String countryName;
    @SerializedName("Mfr_CommonName")
    private String mrfCommonName;
    @SerializedName("Mfr_ID")
    private int mrfID;
    @SerializedName("Mfr_Name")
    private String mrfName;
    @SerializedName("VehicleTypes")
    private List<VehicalType> vehicalTypes;


    public Manufacturer(String countryName, String mrfCommonName, int mrfID, String mrfName, List<VehicalType> vehicalTypes) {
        this.countryName = countryName;
        this.mrfCommonName = mrfCommonName;
        this.mrfID = mrfID;
        this.mrfName = mrfName;
        this.vehicalTypes = vehicalTypes;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getMrfCommonName() {
        return mrfCommonName;
    }

    public void setMrfCommonName(String mrfCommonName) {
        this.mrfCommonName = mrfCommonName;
    }

    public int getMrfID() {
        return mrfID;
    }

    public void setMrfID(int mrfID) {
        this.mrfID = mrfID;
    }

    public String getMrfName() {
        return mrfName;
    }

    public void setMrfName(String mrfName) {
        this.mrfName = mrfName;
    }

    public List<VehicalType> getVehicalTypes() {
        return vehicalTypes;
    }

    public void setVehicleTypes(List<VehicalType> vehicleTypes) {
        this.vehicalTypes = vehicleTypes;
    }
}
