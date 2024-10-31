package com.example.ecorewardsuser;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Canje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canje);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        TextView textViewCanjeado = findViewById(R.id.textViewCanjeado);
        TextView txvMensaje = findViewById(R.id.txvMensaje);

        Intent intent = getIntent();
        String objetoSeleccionado = intent.getStringExtra("OBJETO_SELECCIONADO");
        String mensaje = intent.getStringExtra("MENSAJE");

        textViewCanjeado.setText("Se ha canjeado '" + objetoSeleccionado + "' correctamente");
        txvMensaje.setText(mensaje);

        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Canje.this, MainTienda.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
