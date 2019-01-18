package com.example.remove.kuis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Soal8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal8);
        Button kelapaswit=(Button)findViewById(R.id.klpswit);
        Button tunaskelapa=(Button)findViewById(R.id.tnsklp);
        Button  bebekberenang=(Button)findViewById(R.id.bbk);
        Button garuda=(Button)findViewById(R.id.grd);



        //Lakukan pemanggilan variabel untuk berpindah ke halaman level
        tunaskelapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Selamat anda Benar,silahkan jawab soal selanjutnya!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Soal8.this,Soal9.class);
                MediaPlayer benar= MediaPlayer.create(Soal8.this,R.raw.benar);
                benar.start();
                startActivity(intent);
            }
        });
        kelapaswit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal8.this,R.raw.slh);
                salah.start();
            }
        });
        bebekberenang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal8.this,R.raw.slh);
                salah.start();
            }
        });
        garuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal8.this,R.raw.slh);
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
