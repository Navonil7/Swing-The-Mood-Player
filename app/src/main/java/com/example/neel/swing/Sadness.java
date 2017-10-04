package com.example.neel.swing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sadness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadness);
    }

    public void sadArticle(View view){
        Intent intent= new Intent(this, SadArticles.class);
        startActivity(intent);
    }

    public void sadVideo(View view){
        Intent intent= new Intent(this, SadVideo.class);
        startActivity(intent);
    }

    public void sadSongs(View view){
        Intent intent= new Intent(this, SadSongs.class);
        startActivity(intent);
    }
}
