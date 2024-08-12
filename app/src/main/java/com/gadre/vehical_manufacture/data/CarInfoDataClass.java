package com.gadre.vehical_manufacture.data;

import java.util.List;

public class CarInfoDataClass {
    private int count;
    private String message;
    private String searchCriteria;
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

    public String getSearchCriteria(String aNull) {
        return searchCriteria;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public List<Manufacturer> getResults(String aNull) {
        return results;
    }

    public void setResults(List<Manufacturer> results) {
        this.results = results;
    }

}

