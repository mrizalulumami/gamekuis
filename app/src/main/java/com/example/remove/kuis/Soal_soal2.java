package com.example.remove.kuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Soal_soal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_soal2);
        ImageButton Soal1=(ImageButton)findViewById(R.id.soal1);
        ImageButton Soal2=(ImageButton)findViewById(R.id.soal2);
        ImageButton Soal3=(ImageButton)findViewById(R.id.soal3);

        //Lakukan pemanggilan variabel untuk berpindah ke halaman level
        Soal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Soal_soal2.this,Soal4.class);
                startActivity(intent);
            }
        });
        Soal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Soal_soal2.this,Soal5.class);
                startActivity(intent);
            }
        });
        Soal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Soal_soal2.this,Soal6.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),menu_level.class));
        super.onBackPressed();
    }
}
