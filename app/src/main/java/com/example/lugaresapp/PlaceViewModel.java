package com.example.lugaresapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class PlaceViewModel extends ViewModel {

    private final MutableLiveData<List<Place>> placesLiveData = new MutableLiveData<>();
    private final PlaceRepository repository = new PlaceRepository();

    public MutableLiveData<List<Place>> getPlaces() {
        return placesLiveData;
    }

    public void loadData() {
        placesLiveData.postValue(repository.loadPlaces());
    }
}
