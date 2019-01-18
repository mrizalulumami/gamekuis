package com.example.remove.kuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        TextView tampil=(TextView)findViewById(R.id.xscore);


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),menu_level.class));
        super.onBackPressed();
    }
}
