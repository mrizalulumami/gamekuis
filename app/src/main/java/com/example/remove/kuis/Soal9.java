package com.example.remove.kuis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Soal9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal9);
        Button thomasalfa=(Button)findViewById(R.id.thms);
        Button donald=(Button)findViewById(R.id.dt);
        Button  alexander=(Button)findViewById(R.id.alxndr);
        Button einstein=(Button)findViewById(R.id.einstein);

        //Lakukan pemanggilan variabel untuk berpindah ke halaman level
        thomasalfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Selamat anda Benar,Mission Success!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Soal9.this,Score.class);
                MediaPlayer benar= MediaPlayer.create(Soal9.this,R.raw.benar);
                benar.start();
                startActivity(intent);
            }
        });
        donald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal9.this,R.raw.slh);
                salah.start();
            }
        });
        einstein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal9.this,R.raw.slh);
                salah.start();
            }
        });
        alexander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal9.this,R.raw.slh);
                salah.start();
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),Soal_soal3.class));
        super.onBackPressed();
    }
}