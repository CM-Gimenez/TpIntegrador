package com.example.tpintegrador.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PropiedadRecyclerAdapter extends RecyclerView.Adapter<PropiedadRecyclerAdapter.PropiedadViewHolder> {
    @NonNull
    @Override
    public PropiedadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PropiedadViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PropiedadViewHolder extends RecyclerView.ViewHolder {
        public PropiedadViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
