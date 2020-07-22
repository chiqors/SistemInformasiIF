package com.example.sisteminformasiif;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Berkas extends AppCompatActivity {
    Button btnkembali, btnskripsi, btnkerjapraktek, btnakademik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.berkas);

        btnkembali = (Button) findViewById(R.id.btnkembali);
        btnkerjapraktek = (Button) findViewById(R.id.btnkerjapraktek);
        btnskripsi = (Button) findViewById(R.id.btnskripsi);
        btnakademik = (Button) findViewById(R.id.btnakademik);

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Berkas.this, Menu.class);
                Berkas.this.startActivity(intent);
            }
        });

        btnkerjapraktek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Berkas.this, KerjaPraktek.class);
                Berkas.this.startActivity(intent);
            }
        });

        btnskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Berkas.this, Skripsi.class);
                Berkas.this.startActivity(intent);
            }
        });

        btnakademik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Berkas.this, Akademik.class);
                Berkas.this.startActivity(intent);
            }
        });
}}
