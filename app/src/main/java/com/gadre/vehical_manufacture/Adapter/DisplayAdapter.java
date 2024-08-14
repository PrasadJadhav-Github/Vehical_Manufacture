package com.gadre.vehical_manufacture.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gadre.vehical_manufacture.R;
import com.gadre.vehical_manufacture.data.Manufacturer;
import com.gadre.vehical_manufacture.data.VehicalType;

import java.util.List;
import java.util.stream.Collectors;

public class DisplayAdapter extends RecyclerView.Adapter<DisplayAdapter.CarInfoViewHolder> {

    private List<Manufacturer> manufacturerList;

    public DisplayAdapter(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    @NonNull
    @Override
    public CarInfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview_display, parent, false);
        return new CarInfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarInfoViewHolder holder, int position) {
        Manufacturer manufacturer = manufacturerList.get(position);
        holder.countryNameTxtView.setText(manufacturer.getCountryName());
        holder.nameTextView.setText(manufacturer.getMrfCommonName());
        holder.idTextView.setText(String.valueOf(manufacturer.getMrfID()));
        holder.fullNameTextView.setText(manufacturer.getMrfName());

        // Initialize StringBuffer to build the vehicle types string
        StringBuffer cardetails = new StringBuffer();

        // Append each vehicle type's name to the StringBuffer
        for (VehicalType vehicalType : manufacturer.getVehicalTypes()) {
            if (cardetails.length() > 0) {
                cardetails.append(", ");
            }
            cardetails.append(vehicalType.getName());
        }

        // Set the concatenated vehicle types string to the TextView
        holder.vehicleTypeTextView.setText(cardetails.toString());
    }


    @Override
    public int getItemCount() {
        return manufacturerList.size();
    }

    public class CarInfoViewHolder extends RecyclerView.ViewHolder {

        TextView countryNameTxtView;
        TextView nameTextView;
        TextView idTextView;
        TextView fullNameTextView;
        TextView vehicleTypeTextView;

        public CarInfoViewHolder(@NonNull View itemView) {
            super(itemView);
            countryNameTxtView = itemView.findViewById(R.id.countryNameTextView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            idTextView = itemView.findViewById(R.id.idTextView);
            fullNameTextView = itemView.findViewById(R.id.fullNameTextView);
            vehicleTypeTextView = itemView.findViewById(R.id.vehicleTypeTextView);
        }
    }
}
