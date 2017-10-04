package com.example.neel.swing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Surprise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surprise);
    }


    public void surpriseArticle(View view){
        Intent intent= new Intent(this, SurpriseArticles.class);
        startActivity(intent);
    }

    public void surpriseVideo(View view){
        Intent intent= new Intent(this, SurpriseVideo.class);
        startActivity(intent);
    }

    public void surpriseSongs(View view){
        Intent intent= new Intent(this, SurpriseSongs.class);
        startActivity(intent);
    }
}
