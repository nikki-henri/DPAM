package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anahuac.anahuac.adapters.ListCampusAdapter;
import com.anahuac.anahuac.models.Campus;

import java.util.ArrayList;

public class ListCampusActivity extends AppCompatActivity {

    private RecyclerView rvCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_campus);

        rvCampus = findViewById(R.id.rv_campus);
        ArrayList<Campus> listCampus = new ArrayList<>();
        Campus c1 = new Campus(
                "Universidad Anáhuac - Campus Online",
                R.drawable.ic_campus_online
        );
        Campus c2 = new Campus(
                "Universidad Anáhuac - Campus Cancún",
                R.drawable.ic_campus_cancun
        );
        Campus c3 = new Campus(
                "Universidad Anáhuac - Campus JuanPablo",
                R.drawable.ic_campus_juanpablo
        );
        Campus c4 = new Campus(
                "Universidad Anáhuac - Campus Mayab",
                R.drawable.ic_campus_mayab
        );
        Campus c5 = new Campus(
                "Universidad Anáhuac - Campus México Norte",
                R.drawable.ic_campus_mx_norte
        );
        Campus c6 = new Campus(
                "Universidad Anáhuac - Campus México Sur",
                R.drawable.ic_campus_mx_sur
        );
        Campus c7 = new Campus(
                "Universidad Anáhuac - Campus Oaxaca",
                R.drawable.ic_campus_oaxaca
        );
        Campus c8 = new Campus(
                "Universidad Anáhuac - Campus Puebla",
                R.drawable.ic_campus_puebla
        );
        Campus c9 = new Campus(
                "Universidad Anáhuac - Campus Querétaro",
                R.drawable.ic_campus_queretaro
        );
        Campus c10 = new Campus(
                "Universidad Anáhuac - Campus Tamaulipas",
                R.drawable.ic_campus_tamaulipas
        );
        Campus c11 = new Campus(
                "Universidad Anáhuac - Campus Veracruz",
                R.drawable.ic_campus_veracruz
        );
        Campus c12 = new Campus(
                "Universidad Anáhuac - Campus Xalapa",
                R.drawable.ic_campus_xalapa
        );
        listCampus.add(c1);
        listCampus.add(c2);
        listCampus.add(c3);
        listCampus.add(c4);
        listCampus.add(c5);
        listCampus.add(c6);
        listCampus.add(c7);
        listCampus.add(c8);
        listCampus.add(c9);
        listCampus.add(c10);
        listCampus.add(c11);
        listCampus.add(c12);

        rvCampus.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ListCampusAdapter adapter = new ListCampusAdapter(listCampus);
        rvCampus.setAdapter(adapter);
    }
}