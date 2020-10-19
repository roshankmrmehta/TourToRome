package com.example.tourtorome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    Context mContext;
    List<HomeData> homeData;

    public HomeAdapter(Context mContext, List<HomeData> homeData) {
        this.mContext = mContext;
        this.homeData = homeData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sample_home_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.homeTitle.setText(homeData.get(position).getHomeTitle());
        holder.homeInfo.setText(homeData.get(position).getHomeInfo());
        holder.homeTime.setText(homeData.get(position).getHomeTime());
        holder.homeLocation.setText(homeData.get(position).getHomeLocation());
        holder.homeCost.setText(homeData.get(position).getHomeCost());
        holder.homeWeb.setText(homeData.get(position).getHomeWeb());
        holder.homeImg.setImageResource(homeData.get(position).getHomeImage());
    }

    @Override
    public int getItemCount() {
        return homeData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView homeTitle;
        TextView homeInfo;
        TextView homeTime;
        TextView homeCost;
        TextView homeLocation;
        TextView homeWeb;
        ImageView homeImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            homeTitle = itemView.findViewById(R.id.home_title);
            homeInfo = itemView.findViewById(R.id.home_info);
            homeTime = itemView.findViewById(R.id.home_time);
            homeCost = itemView.findViewById(R.id.home_travel_cost);
            homeLocation = itemView.findViewById(R.id.home_location);
            homeWeb = itemView.findViewById(R.id.home_webLink);
            homeImg = itemView.findViewById(R.id.home_img);
        }
    }
}
