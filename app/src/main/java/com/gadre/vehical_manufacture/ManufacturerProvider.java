package com.gadre.vehical_manufacture;

import com.gadre.vehical_manufacture.data.CarInfoDataClass;
import com.gadre.vehical_manufacture.data.Manufacturer;

import java.util.ArrayList;

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
        carInfoData.setResults(new ArrayList<>());

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
