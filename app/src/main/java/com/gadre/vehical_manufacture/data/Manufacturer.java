package com.gadre.vehical_manufacture.data;

import java.util.List;

public class Manufacturer {
    private String countryName;
    private String mrfCommonName;
    private int mrfID;
    private String mrfName;
    private List<VehicalType> vehicalTypes;


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
