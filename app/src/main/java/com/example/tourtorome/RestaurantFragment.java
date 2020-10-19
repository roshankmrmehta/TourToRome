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

public class RestaurantFragment extends Fragment {
    List<RestaurantData> restaurantData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.restaurant_fragment, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.restaurant_recycler);
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getContext(), restaurantData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(restaurantAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        restaurantData = new ArrayList<>();

        restaurantData.add(new RestaurantData(getString(R.string.restaurant_polpetta), "", "12 hours", "100-150", getString(R.string.polpetta_location), getString(R.string.poloetta_link), R.drawable.polpetta_trastevere));
        restaurantData.add(new RestaurantData(getString(R.string.pasta_e_vino_restaurant), "", "12 hours", "120-125", getString(R.string.pasta_e_vino_location), getString(R.string.pasta_e_vino_link), R.drawable.pasta_e_vino));
        restaurantData.add(new RestaurantData(getString(R.string.baguetteria_restaurant), "", "14 hours", "110-150", getString(R.string.baguetteria_location), getString(R.string.baguetteria_link), R.drawable.baguetteria_del_fico));
        restaurantData.add(new RestaurantData(getString(R.string.sesamo_restaurant), "", "24 hours", "150-200", getString(R.string.sesamo_location), getString(R.string.sesamo_link), R.drawable.sesamo_pizza));

    }
}
