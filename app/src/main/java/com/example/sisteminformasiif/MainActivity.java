package com.example.sisteminformasiif;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nim, password;
    Button btnlogin, btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nim = (EditText) findViewById(R.id.nim);
        password = (EditText) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btndaftar = (Button) findViewById(R.id.btndaftar);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nimkey = nim.getText().toString();
                String passwordkey = password.getText().toString();

                if (nimkey.equals("mahasiswa") && passwordkey.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Username dan Password benar Anda berhasil Login", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("NIM atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                }


            }
        });

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Daftar.class);
                MainActivity.this.startActivity(intent);

            }
        });



    }}