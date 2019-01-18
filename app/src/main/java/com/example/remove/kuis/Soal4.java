package com.example.remove.kuis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Soal4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivity_soal4);
        Button newdelhi=(Button)findViewById(R.id.newdlh);
        Button jakarta=(Button)findViewById(R.id.jkrt);
        Button paradise=(Button)findViewById(R.id.prdrst);
        Button malaysia=(Button)findViewById(R.id.malay);
        TextView score=findViewById(R.id.hasl4);

        //Lakukan pemanggilan variabel untuk berpindah ke halaman level
        newdelhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Selamat anda Benar,silahkan jawab soal selanjutnya!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Soal4.this,Soal5.class);
                MediaPlayer benar= MediaPlayer.create(Soal4.this,R.raw.benar);
                benar.start();
                startActivity(intent);

            }
        });
        jakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal4.this,R.raw.slh);
                salah.start();

            }
        });
        paradise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal4.this,R.raw.slh);
                salah.start();

            }
        });
        malaysia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal4.this,R.raw.slh);
                salah.start();

            }
        });

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),Soal_soal2.class));
        super.onBackPressed();
    }

}