package com.gadre.vehical_manufacture;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.gadre.vehical_manufacture.data.CarInfoDataClass;
import com.gadre.vehical_manufacture.data.Manufacturer;
import com.gadre.vehical_manufacture.data.VehicalType;
import com.gadre.vehical_manufacture.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Get the singleton instance of ManufacturerProvider
        ManufacturerProvider provider = ManufacturerProvider.getInstance();

        // Retrieve car info data
        CarInfoDataClass carInfoData = provider.getCarInfoData();

        // Display the details of each manufacturer
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
        binding.textViewDetails.setText(cardetails);

    }
}
