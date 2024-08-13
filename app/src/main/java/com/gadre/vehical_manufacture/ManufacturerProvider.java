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
        carInfoData.setSearchCriteria(null);
        carInfoData.setResults(new ArrayList<Manufacturer>());
        List<VehicalType> list1 = new ArrayList<>();
        list1.add(new VehicalType(true,"Truck"));
        carInfoData.getResults().add(new Manufacturer("India","Mahindra",956,"Mahindra,Ind",list1));

        carInfoData.setCount(2);
        List<VehicalType> list2 =new ArrayList<>();
        list2.add(new VehicalType(true,"Passenger Car"));
        carInfoData.getResults().add(new Manufacturer("UNITED KINGDOM (UK)","Aston Martin",957,"ASTON MARTIN LAGONDA LIMITED",list2));


        carInfoData.setCount(3);
        List<VehicalType> list3=new ArrayList<>();
        list3.add(new VehicalType(true,"Passenger Car"));
        carInfoData.getResults().add(new Manufacturer("UNITED STATES (USA)","JLR",958,"JAGUAR LAND ROVER NA, LLC",list3));


        carInfoData.setCount(4);
        List<VehicalType>list4=new ArrayList<>();
        list4.add(new VehicalType(true,"Passenger Car"));
        carInfoData.getResults().add(new Manufacturer("UNITED STATES (USA)","null",959,"MASERATI NORTH AMERICA, INC.",list4));

        carInfoData.setCount(5);
        List<VehicalType>list5=new ArrayList<>();
        list5.add(new VehicalType(true,"Passenger Car"));
        carInfoData.getResults().add(new Manufacturer("UNITED STATES (USA)","Rolls Royce",960,"ROLLS ROYCE MOTOR CARS",list5));


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
