package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLoginFacebook;
    private Button btnSignInNetflix;
    private Button btnRecyclerCampus;
    private Button btnAlerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginFacebook = findViewById(R.id.btn_login_fb);
        btnSignInNetflix = findViewById(R.id.btn_login_netflix);
        btnRecyclerCampus = findViewById(R.id.btn_recycler_view);
        btnAlerta = findViewById(R.id.btn_alertas);

        btnLoginFacebook.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Boton pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnSignInNetflix.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Boton pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, LoginNetflixActivity.class);
                startActivity(intent);
            }
        });

        btnRecyclerCampus.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Boton pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, ListCampusActivity.class);
                startActivity(intent);
            }
        });

        btnAlerta.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Boton pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, AlertActivity.class);
                startActivity(intent);
            }
        });
    }
}