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

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.MyViewHolder> {

    Context mContext;
    List<HotelData> hotelData;

    public HotelAdapter(Context mContext, List<HotelData> hotelData) {
        this.mContext = mContext;
        this.hotelData = hotelData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sample_hotel_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.hotelName.setText(hotelData.get(position).getHotelName());
        holder.hotelInfo.setText(hotelData.get(position).getHotelInfo());
        holder.hotelTime.setText(hotelData.get(position).getHotelTime());
        holder.hotelCost.setText(hotelData.get(position).getHotelCost());
        holder.hotelLocation.setText(hotelData.get(position).getHotelLocation());
        holder.hotelWebLink.setText(hotelData.get(position).getHotelWebLink());
        holder.hotelImg.setImageResource(hotelData.get(position).getHotelImg());
    }

    @Override
    public int getItemCount() {
        return hotelData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView hotelName;
        private TextView hotelInfo;
        private TextView hotelTime;
        private TextView hotelCost;
        private TextView hotelLocation;
        private TextView hotelWebLink;
        private ImageView hotelImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            hotelName = itemView.findViewById(R.id.hotel_title);
            hotelInfo = itemView.findViewById(R.id.hotel_info);
            hotelTime = itemView.findViewById(R.id.hotel_time);
            hotelCost = itemView.findViewById(R.id.hotel_cost);
            hotelLocation = itemView.findViewById(R.id.hotel_location);
            hotelWebLink = itemView.findViewById(R.id.hotel_webLink);
            hotelImg = itemView.findViewById(R.id.hotel_img);
        }
    }
}

