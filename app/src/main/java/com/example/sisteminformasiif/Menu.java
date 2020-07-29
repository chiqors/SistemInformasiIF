package com.example.sisteminformasiif;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;


public class Menu extends AppCompatActivity {
    Button btnpengumuman, btnkurikulum, btnberkas, btnjadwal, btnLogout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btnpengumuman = (Button) findViewById(R.id.btnpengumuman);
        btnkurikulum = (Button) findViewById(R.id.btnkurikulum);
        btnberkas = (Button) findViewById(R.id.btnberkas);
        btnjadwal = (Button) findViewById(R.id.btnjadwal);

        btnpengumuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Pengumuman.class);
                Menu.this.startActivity(intent);
            }
        });

        btnberkas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Berkas.class);
                Menu.this.startActivity(intent);
            }
        });

        btnkurikulum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Kurikulum.class);
                Menu.this.startActivity(intent);
            }
        });

        btnjadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Jadwal.class);
                Menu.this.startActivity(intent);
            }
        });

        btnLogout = findViewById(R.id.logout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(Menu.this, MainActivity.class);
                startActivity(intToMain);
            }
        });


}}

