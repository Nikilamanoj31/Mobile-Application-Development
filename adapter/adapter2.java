package com.example.adapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;


public class adapter2 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter2);

        t1 = findViewById(R.id.textView1);
        t1.setText(getIntent().getExtras().getString("name"));

    }
}
