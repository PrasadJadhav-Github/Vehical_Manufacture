package com.gadre.vehical_manufacture.Activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.gadre.vehical_manufacture.Intercafe.ViewInterface;
import com.gadre.vehical_manufacture.Intercafe.ViewModelInterface;
import com.gadre.vehical_manufacture.OtherClasses.Display;
import com.gadre.vehical_manufacture.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ViewInterface {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //creating object of interface
        ViewModelInterface viewModelInterface = new Display(this);
        viewModelInterface.fetchDataFromSingleton();

    }


    @Override
    public void DisplayData(String data) {
        binding.textViewDetails.setText(data);
    }
}
