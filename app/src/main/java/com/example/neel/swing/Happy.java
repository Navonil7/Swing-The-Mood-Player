package com.example.neel.swing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Happy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);



    }

    public void happyArticle(View view){
        Intent intent= new Intent(this, HappyArticles.class);
        startActivity(intent);
    }

    public void happyVideo(View view){
        Intent intent= new Intent(this, HappyVideo.class);
        startActivity(intent);
    }

    public void happySongs(View view){
        Intent intent= new Intent(this, HappySongs.class);
        startActivity(intent);
    }

}
