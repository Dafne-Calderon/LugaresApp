package com.example.lugaresapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PlaceAdapter placeAdapter;
    PlaceRepository repository = new PlaceRepository();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Place> places = repository.loadPlaces();

        placeAdapter = new PlaceAdapter(places, new PlaceAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Place place) {
                openDetail(place);
            }
        });

        recyclerView.setAdapter(placeAdapter);
    }

    private void openDetail(Place place) {
        Intent intent = new Intent(this, PlaceDetailActivity.class);
        intent.putExtra("name", place.getName());
        intent.putExtra("description", place.getDescription());
        intent.putExtra("address", place.getAddress());
        intent.putExtra("lat", place.getLat());
        intent.putExtra("lng", place.getLng());
        intent.putExtra("imageUrl", place.getImageUrl());
        startActivity(intent);
    }
}
