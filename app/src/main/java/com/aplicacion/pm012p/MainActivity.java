package com.aplicacion.pm012p;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText txtName, txtFirstName, txtAge,txtMail;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    //elemento oncreate es para declarar toda la logica y variables que se van a utilizar e igual los eventos
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName=(EditText) findViewById(R.id.txtName);
        txtFirstName=(EditText) findViewById(R.id.txtFirstName);
        txtAge=(EditText) findViewById(R.id.txtAge);
        txtMail=(EditText) findViewById(R.id.txtMail);
        btnSave=(Button) findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Nombre"+txtName.getText().toString(),Toast.LENGTH_LONG).show();
               Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
               intent.putExtra("Nombre",txtName.getText().toString());
               intent.putExtra("Apellido",txtFirstName.getText().toString());
               intent.putExtra("Edad",txtAge.getText().toString());
               intent.putExtra("Correo Electronico",txtMail.getText().toString());
               startActivity(intent);
            }
        });
    }
}