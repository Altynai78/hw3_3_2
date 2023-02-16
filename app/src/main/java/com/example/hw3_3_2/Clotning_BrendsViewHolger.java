package com.example.hw3_3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Clotning_BrendsViewHolger extends RecyclerView.ViewHolder {
    private TextView tv_brends;
    public Clotning_BrendsViewHolger(@NonNull View itemView) {
        super(itemView);
        tv_brends=itemView.findViewById(R.id.lv_brends);

    }

    void bind(String clotning_brends){
        tv_brends.setText(clotning_brends);
    }
}
