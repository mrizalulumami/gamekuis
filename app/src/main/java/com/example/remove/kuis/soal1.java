package com.example.remove.kuis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class soal1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal1);
        Button merkuri = (Button) findViewById(R.id.merkr);
        Button jupiter = (Button) findViewById(R.id.jptr);
        Button bumi = (Button) findViewById(R.id.bmi);
        Button satrns = (Button) findViewById(R.id.strns);


        //Lakukan pemanggilan variabel untuk berpindah ke halaman level
        merkuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Selamat anda Benar,silahkan jawab soal selanjutnya!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(soal1.this,soal2.class);
                MediaPlayer benar= MediaPlayer.create(soal1.this,R.raw.benar);
                benar.start();
                startActivity(intent);

            }
        });
        jupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(soal1.this,R.raw.slh);
                salah.start();

            }
        });
        bumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(soal1.this,R.raw.slh);
                salah.start();


            }
        });
        satrns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(soal1.this,R.raw.slh);
                salah.start();


            }
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), soal_soal.class));
        super.onBackPressed();
    }
}
