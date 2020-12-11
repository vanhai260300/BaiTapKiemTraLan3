package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeDetailActivity extends AppCompatActivity {
    ImageView image;
    TextView name,content,name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_detail);
        image=findViewById(R.id.image);
        name=findViewById(R.id.name);
        name2=findViewById(R.id.name2);
        content=findViewById(R.id.content);
        Intent intent = getIntent();
        image.setImageResource(intent.getIntExtra("image",0));
        name.setText(intent.getStringExtra("name"));
        name2.setText(intent.getStringExtra("name"));
        content.setText(intent.getStringExtra("content"));
    }
}