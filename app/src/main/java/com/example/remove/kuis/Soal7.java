package com.example.remove.kuis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Soal7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal7);
        Button pocado=(Button)findViewById(R.id.pcdo);
        Button jakartabndg=(Button)findViewById(R.id.jkrtbndg);
        Button jakartaplmbg=(Button)findViewById(R.id.jakrtplmbg);
        Button surabaya=(Button)findViewById(R.id.srby);
        TextView score=findViewById(R.id.hasl4);

        //Lakukan pemanggilan variabel untuk berpindah ke halaman level
        jakartaplmbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Selamat anda Benar,silahkan jawab soal selanjutnya!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Soal7.this,Soal8.class);
                MediaPlayer benar= MediaPlayer.create(Soal7.this,R.raw.benar);
                benar.start();
                startActivity(intent);

            }
        });
        jakartabndg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal7.this,R.raw.slh);
                salah.start();

            }
        });
        pocado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal7.this,R.raw.slh);
                salah.start();

            }
        });
        surabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"anda salah.! pastikan jawaban anda benar.!",Toast.LENGTH_LONG).show();
                MediaPlayer salah= MediaPlayer.create(Soal7.this,R.raw.slh);
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
