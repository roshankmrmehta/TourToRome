package com.example.tourtorome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HotelFragment extends Fragment {
    List<HotelData> hotelData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hotel_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.hotel_recycler);
        HotelAdapter hotelAdapter = new HotelAdapter(getContext(), hotelData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(hotelAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hotelData = new ArrayList<>();

        hotelData.add(new HotelData(getString(R.string.hotel_info_1), "Rating: 4*", "open 24*7", "40 - 60  ", getString(R.string.hotel_location_1), "sampleHotelWeb", R.drawable.exe_international_palace));
        hotelData.add(new HotelData(getString(R.string.hotel_info_2), "Rating: 4*", "open 24*7", "80 - 120  ", getString(R.string.hotel_location_2), "sampleHotelWeb", R.drawable.triano_hotel));
        hotelData.add(new HotelData(getString(R.string.hotel_info_3), "Rating: 4*", "open 24*7", "110 - 150  ", getString(R.string.hotel_location_3), "sampleHotelWeb", R.drawable.aldrovandi_villa_borghese));
        hotelData.add(new HotelData(getString(R.string.hotel_info_4), "Rating: 4*", "open 24*7", "50 - 60  ", getString(R.string.hotel_location_4), "sampleHotelWeb", R.drawable.alpi_hotel));



    }
}
