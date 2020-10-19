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

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.MyViewHolder> {

    Context mContext;
    List<RestaurantData> restaurantData;

    public RestaurantAdapter(Context mContext, List<RestaurantData> restaurantData) {
        this.mContext = mContext;
        this.restaurantData = restaurantData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sample_hotel_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.resName.setText(restaurantData.get(position).getResName());
        holder.resInfo.setText(restaurantData.get(position).getResInfo());
        holder.resTime.setText(restaurantData.get(position).getResTime());
        holder.resCost.setText(restaurantData.get(position).getResCost());
        holder.resLocation.setText(restaurantData.get(position).getResLocation());
        holder.resWebLink.setText(restaurantData.get(position).getResWebLink());
        holder.resImg.setImageResource(restaurantData.get(position).getResImg());
    }

    @Override
    public int getItemCount() {
        return restaurantData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView resName;
        private TextView resInfo;
        private TextView resTime;
        private TextView resCost;
        private TextView resLocation;
        private TextView resWebLink;
        private ImageView resImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            resName = itemView.findViewById(R.id.hotel_title);
            resInfo = itemView.findViewById(R.id.hotel_info);
            resTime = itemView.findViewById(R.id.hotel_time);
            resCost = itemView.findViewById(R.id.hotel_cost);
            resLocation = itemView.findViewById(R.id.hotel_location);
            resWebLink = itemView.findViewById(R.id.hotel_webLink);
            resImg = itemView.findViewById(R.id.hotel_img);
        }
    }
}
