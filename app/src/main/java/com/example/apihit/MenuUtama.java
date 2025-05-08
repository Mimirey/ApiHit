package com.example.apihit;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuUtama extends AppCompatActivity {

    private AppCompatButton btnPremiere;
    private AppCompatButton btnLaLiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_utama);

        btnPremiere= findViewById(R.id.btnPremiere);
        btnLaLiga=findViewById(R.id.btnLaLiga);

       btnPremiere.setOnClickListener(v -> {
           Intent intent= new Intent(MenuUtama.this, MainActivity.class);
           startActivity(intent);
       }
       );

       btnLaLiga.setOnClickListener(v->{
           Intent intent= new Intent(MenuUtama.this, LaLigaActivity.class);
           startActivity(intent);
       }

       );

    }
}