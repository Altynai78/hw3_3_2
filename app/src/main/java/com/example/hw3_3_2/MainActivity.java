package com.example.hw3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String>clotning_brandsList;
    private Clotning_BrendsAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.lv_brends);
        loaData();
        adapter=new Clotning_BrendsAdapter(clotning_brandsList);
        recyclerView.setAdapter(adapter);




    }


    private void loaData() {
        clotning_brandsList= new ArrayList<>();
        clotning_brandsList.add("pandora");
        clotning_brandsList.add("chanel");
        clotning_brandsList.add("dior");
        clotning_brandsList.add("adidas");
        clotning_brandsList.add("celena");
        clotning_brandsList.add("lui vuitton ");
        clotning_brandsList.add("");

