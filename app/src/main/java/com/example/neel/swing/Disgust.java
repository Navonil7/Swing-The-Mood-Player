package com.example.neel.swing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Disgust extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disgust);
    }

    public void disgustArticle(View view){
        Intent intent= new Intent(this, DisgustArticles.class);
        startActivity(intent);
    }

    public void disgustVideo(View view){
        Intent intent= new Intent(this, DisgustVideos.class);
        startActivity(intent);
    }

    public void disgustSongs(View view){
        Intent intent= new Intent(this, DisgustSongs.class);
        startActivity(intent);
    }
}
