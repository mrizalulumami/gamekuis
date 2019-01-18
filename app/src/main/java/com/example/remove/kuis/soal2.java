package com.example.remove.kuis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class soal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal2);
        Button marzuk=(Button)findViewById(R.id.mrzk);
        Button wrsuprat=(Button)findViewById(R.id.wrs);
        Button  rudihartno=(Button)findViewById(R.id.rdh);
        Button kurniawan=(Button)findViewById(R.id.krnwn);



        //Lakukan pemanggilan variabel untuk berpindah ke halaman level
        wrsuprat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Selamat anda Benar,silahkan jawab soal selanjutnya!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(soal2.this,soal3.class);
                MediaPlayer benar= MediaPlayer.create(soal2.this,R.raw.benar);
                benar.start();
                startActivity(intent);
            }
        });
        rudihartno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(soal2.this,R.raw.slh);
                salah.start();
            }
        });
        marzuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(soal2.this,R.raw.slh);
                salah.start();
            }
        });
        kurniawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(soal2.this,R.raw.slh);
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
