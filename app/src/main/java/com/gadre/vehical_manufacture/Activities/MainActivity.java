package com.gadre.vehical_manufacture.Activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gadre.vehical_manufacture.Adapter.DisplayAdapter;
import com.gadre.vehical_manufacture.Interface.ViewInterface;
import com.gadre.vehical_manufacture.Interface.ViewModelInterface;
import com.gadre.vehical_manufacture.OtherClasses.Display;
import com.gadre.vehical_manufacture.data.Manufacturer;
import com.gadre.vehical_manufacture.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewInterface {

    private ActivityMainBinding binding;
    private DisplayAdapter displayAdapter;
    private  RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //initialize  recycler view
        recyclerView = binding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize Adapter
       // List<Manufacturer> Manufacturer = Collections.emptyList();
//        displayAdapter = new DisplayAdapter(Manufacturer);
//        recyclerView.setAdapter(displayAdapter);



        //creating object of interface
        ViewModelInterface viewModelInterface = new Display(this);
        viewModelInterface.fetchDataFromSingleton();

    }


//    @Override
//    public void DisplayData(String data) {
//        binding.textViewDetails.setText(data);
//        List<Manufacturer> manufacturerList =
//
//
//    }

    @Override
    public void DisplayData(ArrayList<Manufacturer> manufacturerArrayList) {
        displayAdapter = new DisplayAdapter(manufacturerArrayList);
        recyclerView.setAdapter(displayAdapter);
    }
}
