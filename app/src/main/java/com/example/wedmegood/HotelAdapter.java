package com.example.wedmegood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.MyViewHolder> {

    private List<Hotel> hotelList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, rating, review,location,price;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.hotel_name);
            rating = (TextView) view.findViewById(R.id.hotel_rating);
            review = (TextView) view.findViewById(R.id.hotel_review);
            location = (TextView) view.findViewById(R.id.hotel_location);
            price = (TextView) view.findViewById(R.id.hotel_price);
            image = (ImageView) view.findViewById(R.id.hotel_img);

        }
    }

    public HotelAdapter(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_display, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);

        if(position == 0)
        {
            holder.image.setImageResource(R.drawable.hyatt);
        }
        if(position ==1){
            holder.image.setImageResource(R.drawable.udman);
        }

        holder.name.setText(hotel.getName());
        holder.rating.setText(hotel.getRating());
        holder.review.setText(hotel.getReview() + " Reviews");
        holder.location.setText(hotel.getLocation());
        holder.price.setText(hotel.getPrice());

    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }


}
