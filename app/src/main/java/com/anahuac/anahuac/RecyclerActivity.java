package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anahuac.anahuac.adapters.CampusAdapter;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView rvCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        rvCampus = findViewById(R.id.rv_campus);
        rvCampus.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        ArrayList<String> listCampus = new ArrayList<String>();
        listCampus.add("Cancún");
        listCampus.add("CDMX");
        listCampus.add("Guadalajara");
        listCampus.add("Mérida");
        listCampus.add("Puebla");
        listCampus.add("Querétaro");
        listCampus.add("Xalapa");

        CampusAdapter adapters = new CampusAdapter(listCampus);
        rvCampus.setAdapter(adapters);
    }
}