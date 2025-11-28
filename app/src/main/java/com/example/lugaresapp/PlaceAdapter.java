package com.example.lugaresapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    private List<Place> list;
    private OnItemClickListener listener;
    private Context context;

    public PlaceAdapter(List<Place> list, OnItemClickListener listener) {
        this.list = list;
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(Place place);
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_place, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place place = list.get(position);

        holder.txtName.setText(place.getName());
        holder.txtDescription.setText(place.getDescription());
        holder.txtAddress.setText(place.getAddress());

        Glide.with(context)
                .load(place.getImageUrl())
                .into(holder.imgPlace);

        holder.itemView.setOnClickListener(v -> listener.onItemClick(place));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class PlaceViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPlace;
        TextView txtName, txtDescription, txtAddress;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPlace = itemView.findViewById(R.id.imgPlace);
            txtName = itemView.findViewById(R.id.txtName);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            txtAddress = itemView.findViewById(R.id.txtAddress);
        }
    }
}
