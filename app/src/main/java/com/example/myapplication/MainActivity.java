package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Toolbar Toolbar;
    private ImageView ImageView;
    private TextView name;
    private TextView type;
    private TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar = findViewById(R.id.Toolbar);
        ImageView = findViewById(R.id.ImageView);
        name = findViewById(R.id.name);
        type = findViewById(R.id.type);
        date = findViewById(R.id.date);

        Toolbar.setTitle("My San Ta Wah Wah Application");
        ImageView.setImageResource(R.drawable.re6);
        name.setText("Resident evil");
        type.setText("Video and game");
        date.setText("1.1.973");
    }
}
