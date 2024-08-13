package com.gadre.vehical_manufacture.OtherClasses;

import android.net.DnsResolver;
import android.util.Log;
import android.widget.TextView;

import com.gadre.vehical_manufacture.APiServices.ApiService;
import com.gadre.vehical_manufacture.APiServices.RetrofitClient;
import com.gadre.vehical_manufacture.Intercafe.ViewInterface;
import com.gadre.vehical_manufacture.Intercafe.ViewModelInterface;
import com.gadre.vehical_manufacture.data.CarInfoDataClass;
import com.gadre.vehical_manufacture.data.Manufacturer;
import com.gadre.vehical_manufacture.data.VehicalType;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Display implements ViewModelInterface {

    ManufacturerProvider provider = ManufacturerProvider.getInstance();
    CarInfoDataClass carInfoData = provider.getCarInfoData();
    private ViewInterface viewInterface;
    private ApiService apiService;

    private List<CarInfoDataClass> carInfoDataClasses = new ArrayList<>();


    // Constructor to accept TextView
    public Display(ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
        apiService = RetrofitClient.getCarInfo();
    }

    @Override
    public void fetchDataFromSingleton() {
        Call<CarInfoDataClass> call = apiService.getAllManufacturers();
        call.enqueue(new Callback<CarInfoDataClass>() {
            @Override
            public void onResponse(Call<CarInfoDataClass> call, Response<CarInfoDataClass> response) {
                String cardetails = "";
                Log.d("Response", "" + response.message());
                CarInfoDataClass carInfoData = response.body();
                //Iterates over each Manufacturer object in the list returned by carInfoData.getResults()
                for (Manufacturer manufacturer : carInfoData.getResults()) {
                    cardetails += "Country: " + manufacturer.getCountryName() + "\n"
                            + "Name: " + manufacturer.getMrfName() + "\n"
                            + "ID: " + manufacturer.getMrfID() + "\n"
                            + "Full Name: " + manufacturer.getMrfCommonName() + "\n"
                            + "Vehicle Types: ";
                    for (VehicalType vehicalType : manufacturer.getVehicalTypes()) {
                        cardetails += vehicalType.getName() + " ";
                    }
                    cardetails += "\n\n";
                }

                viewInterface.DisplayData(cardetails);
            }

            @Override
            public void onFailure(Call<CarInfoDataClass> call, Throwable t) {
                Log.d("Response", "" + t.getMessage());
            }
        });
    }

}


