package com.example.hw3_3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Clotning_BrendsViewHolger> {
    private  ArrayList<String> clotning_brendsList;

    private  Adapter (ArrayList<String>clotning_brendsList) {
        this.clotning_brendsList=clotning_brendsList;
    }



    @NonNull
    @Override
    public Clotning_BrendsViewHolger onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Clotning_BrendsViewHolger(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_brends,parent,false ));

    }

    @Override
    public void onBindViewHolder(@NonNull Clotning_BrendsViewHolger holder, int position) {
        holder.bind(holder.get(position));


    }

    @Override
    public int getItemCount() {
        return clotning_brendsList();
    }



}

