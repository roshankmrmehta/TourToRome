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

public class FestivalFragment extends Fragment {

    List<FestivalData> festivalData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.festival_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.festival_recycler);
        FestivalAdapter festivalAdapter = new FestivalAdapter(getContext(), festivalData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(festivalAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        festivalData = new ArrayList<>();

        festivalData.add(new FestivalData(getString(R.string.rock_in_roma_festival), "", getString(R.string.rock_time_table), getString(R.string.rock_in_roma_location), getString(R.string.rock_in_roma_link), R.drawable.rock_in_roma));
        festivalData.add(new FestivalData(getString(R.string.lungo_il_festival), "", getString(R.string.lungo_time_table), getString(R.string.lungo_location), getString(R.string.lungo_link), R.drawable.lungo_il_tevere));
        festivalData.add(new FestivalData(getString(R.string.delle_festival), "", getString(R.string.delle_time_table), getString(R.string.delle_location), getString(R.string.delle_link), R.drawable.delle_festival));
        festivalData.add(new FestivalData(getString(R.string.bonus_festival), "", getString(R.string.bonus_time_table), getString(R.string.bonus_location), getString(R.string.bonus_link), R.drawable.bonus_festival));

    }
}
