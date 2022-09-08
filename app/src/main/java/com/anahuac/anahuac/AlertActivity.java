package com.anahuac.anahuac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    private Button btnAlert;
    private Button btnAlertWithBtn;
    private Button btnAlertWithOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnAlert = findViewById(R.id.btn_alert);
        btnAlertWithBtn = findViewById(R.id.btn_alert_with_btn);
        btnAlertWithOptions = findViewById(R.id.btn_alert_with_options);

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Mi primera alerta!");
                builder.setMessage("Este es mi mensaje.");
                builder.create().show();
            }
        });

        btnAlertWithBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Mi segunda alerta!");
                builder.setMessage("Este es otro mensaje.");
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Postitivo", Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Negativo", Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNeutralButton("Más tarde", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Neutral", Toast.LENGTH_LONG).show();
                    }
                });
                builder.create().show();
            }
        });

        btnAlertWithOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Selecciona un color:");
                String[] array = new String[3];
                array[0] = "Morado";
                array[1] = "Amarillo";
                array[2] = "Negro";
                builder.setItems(array, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, array[i], Toast.LENGTH_LONG).show();
                    }
                });
                builder.create().show();
            }
        });
    }
}