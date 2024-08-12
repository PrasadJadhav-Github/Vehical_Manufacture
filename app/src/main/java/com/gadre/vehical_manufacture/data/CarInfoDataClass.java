package com.gadre.vehical_manufacture.data;

import java.util.List;

public class CarInfoDataClass {
    private int count;
    private String message;
    private String searchCriteria;
    private List<Manufacturer> results;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMessage() {
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

