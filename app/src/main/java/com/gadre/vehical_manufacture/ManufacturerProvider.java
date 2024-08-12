package com.gadre.vehical_manufacture;

import com.gadre.vehical_manufacture.data.CarInfoDataClass;
import com.gadre.vehical_manufacture.data.Manufacturer;

public class ManufacturerProvider {

    // The single instance of the class
    private static ManufacturerProvider instance;

    // The data class instance that the singleton will manage
    private CarInfoDataClass carInfoData;

    // Private constructor to prevent instantiation
    private ManufacturerProvider() {
        carInfoData = new CarInfoDataClass();
        // Initialize the CarInfoDataClass object
    }

    // Public method to provide access to the instance
    public static synchronized ManufacturerProvider getInstance() {
        if (instance == null) {
            instance = new ManufacturerProvider();
        }
        return instance;
    }

    public CarInfoDataClass getCarInfoData() {
        return carInfoData;
    }

    public void setCarInfoData(CarInfoDataClass carInfoData) {
        this.carInfoData = carInfoData;
    }


}
