package com.example.neel.swing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Contempt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contempt);
    }
    public void contemptArticle(View view){
        Intent intent= new Intent(this, ContemptArticles.class);
        startActivity(intent);
    }

    public void contemptVideo(View view){
        Intent intent= new Intent(this, ContemptVideo.class);
        startActivity(intent);
    }

    public void contemptSongs(View view){
        Intent intent= new Intent(this, ContemptSongs.class);
        startActivity(intent);
    }
}
