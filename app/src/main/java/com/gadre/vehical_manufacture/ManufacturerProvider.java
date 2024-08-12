package com.gadre.vehical_manufacture;

import static java.util.Collections.list;

import com.gadre.vehical_manufacture.data.CarInfoDataClass;
import com.gadre.vehical_manufacture.data.Manufacturer;
import com.gadre.vehical_manufacture.data.VehicalType;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerProvider {

    // The single instance of the class
    private static ManufacturerProvider single_instance;

    // The data class instance
    private CarInfoDataClass carInfoData;




    // Private constructor to prevent instantiation
    private ManufacturerProvider() {
        // Initialize the CarInfoDataClass object
        carInfoData = new CarInfoDataClass();
        carInfoData.setCount(1);
        carInfoData.setMessage("Response returned successfully");
        carInfoData.setSearchCriteria("null");
        carInfoData.setResults(new ArrayList<Manufacturer>());
        List<VehicalType> list = new ArrayList<>();
        list.add(new VehicalType(true,"Truck"));
        carInfoData.getResults().add(new Manufacturer("India","Mahindra",1,"Mahindra,Ind",list));




    }

    //synchronized keyword to ensure that multiple threads can safely access this method,
    public static synchronized ManufacturerProvider getInstance() {
        if (single_instance == null) {
            single_instance = new ManufacturerProvider();
        }
        return single_instance;
    }

    public CarInfoDataClass getCarInfoData() {
        return carInfoData;
    }

    public void setCarInfoData(CarInfoDataClass carInfoData) {
        this.carInfoData = carInfoData;
    }

}
