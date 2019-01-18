package com.example.remove.kuis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Soal6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal6);
        Button Amazon=(Button)findViewById(R.id.Amaz);
        Button  sungainil=(Button)findViewById(R.id.nil);
        Button  Bengawansolo=(Button)findViewById(R.id.bgwnSol);
        Button cyanhan=(Button)findViewById(R.id.cyan);

        //Lakukan pemanggilan variabel untuk berpindah ke halaman level
        Amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Selamat anda Benar,Mission Success!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Soal6.this,Score.class);
                MediaPlayer benar= MediaPlayer.create(Soal6.this,R.raw.benar);
                benar.start();
                startActivity(intent);
            }
        });
        sungainil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal6.this,R.raw.slh);
                salah.start();
            }
        });
        Bengawansolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal6.this,R.raw.slh);
                salah.start();
            }
        });
        cyanhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal6.this,R.raw.slh);
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
