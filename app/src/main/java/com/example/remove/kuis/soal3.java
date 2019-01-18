package com.example.remove.kuis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Set;

public class soal3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal3);
        Button yamaha=(Button)findViewById(R.id.ymh);
        Button ducati=(Button)findViewById(R.id.dct);
        Button  suzuki=(Button)findViewById(R.id.suzu);
        Button Honda=(Button)findViewById(R.id.hond);

        //Lakukan pemanggilan variabel untuk berpindah ke halaman level
        yamaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Selamat anda Benar,Mission Success!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(soal3.this,Score.class);
                MediaPlayer benar= MediaPlayer.create(soal3.this,R.raw.benar);
                benar.start();
                startActivity(intent);
            }
        });
        ducati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(soal3.this,R.raw.slh);
                salah.start();
            }
        });
        Honda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(soal3.this,R.raw.slh);
                salah.start();

            }
        });
        suzuki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(soal3.this,R.raw.slh);
                salah.start();
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),soal_soal.class));
        super.onBackPressed();
    }
}
