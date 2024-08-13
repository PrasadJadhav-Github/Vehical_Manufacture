package com.gadre.vehical_manufacture.APiServices;

import com.gadre.vehical_manufacture.data.CarInfoDataClass;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("vehicles/getallmanufacturers?format=json")
    Call<CarInfoDataClass> getAllManufacturers();

}
