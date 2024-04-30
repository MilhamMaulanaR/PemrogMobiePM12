package com.example.p3_h071221035;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_story,rv_post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rv_story = findViewById(R.id.rv_story);
        StoryAdapter storyAdapter = new StoryAdapter (Data_source.accounts,this);
        rv_story.setAdapter(storyAdapter);

        rv_post = findViewById(R.id.rv_post);
        PostAdapter postAdapter = new PostAdapter (Data_source.accounts,this);
        rv_post.setAdapter(postAdapter);
    }
}