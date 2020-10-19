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


public class HomeFragment extends Fragment {
    List<HomeData> dataHome;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.home_recycler);
        HomeAdapter homeAdapter = new HomeAdapter(getContext(), dataHome);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(homeAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dataHome = new ArrayList<>();

        dataHome.add(new HomeData(getString(R.string.home_title_first), getString(R.string.info_2), "24*7", "860", getString(R.string.colosseum_location), "www.italy.com", R.drawable.rome));
        dataHome.add(new HomeData(getString(R.string.home_title_second), getString(R.string.info_1), "24*7", "1050", getString(R.string.caracalla_location), "www.italy.com", R.drawable.baths_of_caracalla_historical_1));
        dataHome.add(new HomeData(getString(R.string.home_title_third), getString(R.string.info_3), "24*7", "1000", getString(R.string.villa_location), "www.italy.com", R.drawable.villa_farnesina_historical_2));
        dataHome.add(new HomeData(getString(R.string.home_title_fourth), getString(R.string.info_4), "24*7", "950", getString(R.string.piazza_location), "www.italy.com", R.drawable.piazza_del_popolo_historical_3));

    }

}
