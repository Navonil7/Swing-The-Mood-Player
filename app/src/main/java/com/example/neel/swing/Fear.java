package com.example.neel.swing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fear);
    }
    public void fearArticle(View view){
        Intent intent= new Intent(this, fearArticles.class);
        startActivity(intent);
    }

    public void fearVideo(View view){
        Intent intent= new Intent(this, FearVideos.class);
        startActivity(intent);
    }

    public void fearSongs(View view){
        Intent intent= new Intent(this, FearSongs.class);
        startActivity(intent);
    }
}
