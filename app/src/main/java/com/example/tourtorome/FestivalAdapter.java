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

public class FestivalAdapter extends RecyclerView.Adapter<FestivalAdapter.MyViewHolder> {

    Context mContext;
    List<FestivalData> festivalData;

    public FestivalAdapter(Context mContext, List<FestivalData> festivalData) {
        this.mContext = mContext;
        this.festivalData = festivalData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sample_event_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.eventTitle.setText(festivalData.get(position).getEventTitle());
        holder.eventInfo.setText(festivalData.get(position).getEventInfo());
        holder.eventTime.setText(festivalData.get(position).getEventTime());
        holder.eventLocation.setText(festivalData.get(position).getEventLocation());
        holder.eventWebLink.setText(festivalData.get(position).getEventWebLink());
        holder.eventImg.setImageResource(festivalData.get(position).getEventImg());
    }

    @Override
    public int getItemCount() {
        return festivalData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView eventTitle;
        private TextView eventInfo;
        private TextView eventTime;
        private TextView eventLocation;
        private TextView eventWebLink;
        private ImageView eventImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            eventTitle = itemView.findViewById(R.id.event_title);
            eventInfo = itemView.findViewById(R.id.event_info);
            eventTime = itemView.findViewById(R.id.event_time);
            eventLocation = itemView.findViewById(R.id.event_location);
            eventWebLink = itemView.findViewById(R.id.event_webLink);
            eventImg = itemView.findViewById(R.id.event_img);
        }
    }
}
