package com.example.neel.swing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Neutral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neutral);
    }

    public void neutralArticle(View view){
        Intent intent= new Intent(this, NeutralArticles.class);
        startActivity(intent);
    }

    public void neutralVideo(View view){
        Intent intent= new Intent(this, NeutralVideo.class);
        startActivity(intent);
    }

    public void neutralSongs(View view){
        Intent intent= new Intent(this, NeutralSongs.class);
        startActivity(intent);
    }
}
