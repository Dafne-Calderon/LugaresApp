package com.example.lugaresapp;

public class Place {

    private String name;
    private String description;
    private String address;
    private String imageUrl;
    private double lat;
    private double lng;

    public Place(String name, String description, String address, String imageUrl, double lat, double lng) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.imageUrl = imageUrl;
        this.lat = lat;
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
