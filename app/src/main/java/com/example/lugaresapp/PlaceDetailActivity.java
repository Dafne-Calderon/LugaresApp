package com.example.lugaresapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class PlaceDetailActivity extends AppCompatActivity {

    ImageView imageDetail;
    TextView textNameDetail, textAddressDetail, textDescriptionDetail;
    Button buttonOpenMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);

        imageDetail = findViewById(R.id.imageDetail);
        textNameDetail = findViewById(R.id.textNameDetail);
        textAddressDetail = findViewById(R.id.textAddressDetail);
        textDescriptionDetail = findViewById(R.id.textDescriptionDetail);
        buttonOpenMaps = findViewById(R.id.buttonOpenMaps);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String desc = intent.getStringExtra("description");
        String address = intent.getStringExtra("address");
        String imageUrl = intent.getStringExtra("imageUrl");
        double lat = intent.getDoubleExtra("lat", 0);
        double lng = intent.getDoubleExtra("lng", 0);

        textNameDetail.setText(name);
        textDescriptionDetail.setText(desc);
        textAddressDetail.setText(address);

        Glide.with(this).load(imageUrl).into(imageDetail);

        // ABRIR GOOGLE MAPS CON PERMISOS
        buttonOpenMaps.setOnClickListener(v -> {

            Uri uri = Uri.parse("geo:" + lat + "," + lng + "?q=" + lat + "," + lng + "(" + name + ")");

            Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
            mapIntent.setPackage("com.google.android.apps.maps");

            startActivity(mapIntent);
        });
    }
}
