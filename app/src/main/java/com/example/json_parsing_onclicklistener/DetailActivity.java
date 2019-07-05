package com.example.json_parsing_onclicklistener;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.json_parsing_onclicklistener.MainActivity.EXTRA_CREATOR;
import static com.example.json_parsing_onclicklistener.MainActivity.EXTRA_LIKES;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);


        TextView textViewCreator = findViewById(R.id.text_view_creator_detail);
        TextView textViewLikes = findViewById(R.id.text_view_like_detail);

        textViewCreator.setText(creatorName);
        textViewLikes.setText("Likes: " + likeCount);
    }
}