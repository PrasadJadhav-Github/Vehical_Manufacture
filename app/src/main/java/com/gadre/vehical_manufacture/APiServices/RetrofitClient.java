package com.gadre.vehical_manufacture.APiServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static ApiService apiService = null;

    public static ApiService getCarInfo() {
        if (apiService == null) {
           Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://vpic.nhtsa.dot.gov/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
                    apiService=retrofit.create(ApiService.class);
        }
        return apiService;
    }
}

