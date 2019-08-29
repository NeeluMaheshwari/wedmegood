package com.example.wedmegood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Hotel> hotelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private HotelAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new HotelAdapter(hotelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareHotelData();
    }

    private void prepareHotelData() {
        Hotel hotel = new Hotel("Hyatt Regency Gurgaon", "3.7", "3","Manesra, Delhi NCR","2500 per plate");
        hotelList.add(hotel);

        hotel = new Hotel("Udman by Ferna n petals", "4.4", "15","Aerocity/Mahiplapur,Delhi NCR","Rental Only");
        hotelList.add(hotel);



        mAdapter.notifyDataSetChanged();
    }


}
