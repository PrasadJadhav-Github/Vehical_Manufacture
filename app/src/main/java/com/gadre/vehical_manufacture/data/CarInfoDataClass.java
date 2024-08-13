package com.gadre.vehical_manufacture.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CarInfoDataClass {
    @SerializedName("Count")
    private int count;
    @SerializedName("Message")
    private String message;
    @SerializedName("SearchCriteria")
    private String searchCriteria;
    @SerializedName("Results")
    private List<Manufacturer> results;


    public int getCount(String usa) {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMessage(String responseReturnedSuccessfully) {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public List<Manufacturer> getResults() {
        return results;
    }

    public void setResults(List<Manufacturer> results) {
        this.results = results;
    }

}

