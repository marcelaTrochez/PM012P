package com.aplicacion.pm012p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText txtResultName, txtResultFirstName, txtResultAge,txtResultMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtResultName=(EditText) findViewById(R.id.txtResultName);

        txtResultName.setText(getIntent().getExtras().getString("Nombre"));
        txtResultFirstName.setText(getIntent().getExtras().getString("Apellido"));
        txtResultAge.setText(getIntent().getExtras().getString("Edad"));
        txtResultMail.setText(getIntent().getExtras().getString("Correo Electronico"));
    }
}