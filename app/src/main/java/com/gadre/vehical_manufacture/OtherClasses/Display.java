package com.gadre.vehical_manufacture.OtherClasses;

import android.widget.TextView;

import com.gadre.vehical_manufacture.Intercafe.ViewInterface;
import com.gadre.vehical_manufacture.Intercafe.ViewModelInterface;
import com.gadre.vehical_manufacture.data.CarInfoDataClass;
import com.gadre.vehical_manufacture.data.Manufacturer;
import com.gadre.vehical_manufacture.data.VehicalType;

public class Display implements ViewModelInterface {

    ManufacturerProvider provider = ManufacturerProvider.getInstance();
    CarInfoDataClass carInfoData = provider.getCarInfoData();
    private ViewInterface viewInterface;

    // Constructor to accept TextView
    public Display(ViewInterface viewInterface) {
       this.viewInterface=viewInterface;
    }
    @Override
    public void fetchDataFromSingleton() {
        String cardetails = "";
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
}
