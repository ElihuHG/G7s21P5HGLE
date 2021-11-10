package com.tesoem.g7s21p5hgle;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre,txtedad,txtcurp,txtemail,txtestado,txtnumerotel,txtjson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
        txtcurp = findViewById(R.id.txtcurp);
        txtemail = findViewById(R.id.txtemail);
        txtnumerotel = findViewById(R.id.txtnumerotel);
        txtestado = findViewById(R.id.txtestado);
        txtjson = findViewById(R.id.txtjson);
    }
    public void cjson(View v){
        Datos dato = new Datos();
        Gson gson = new Gson();
        dato.setNombre(txtnombre.getText().toString());
        dato.setEdad(txtedad.getText().toString());
        dato.setEmail(txtemail.getText().toString());
        dato.setEstado(txtestado.getText().toString());
        dato.setNumerotel(txtnumerotel.getText().toString());
        dato.setCurp(txtcurp.getText().toString());
        txtjson.setText(gson.toJson(dato));

    }



}