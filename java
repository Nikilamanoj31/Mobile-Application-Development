package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText user,pswd;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user =findViewById(R.id.user);
        pswd = findViewById(R.id.pass);
        btn = findViewById(R.id.login);

        String uname = user.getText().toString();
        String pwd = user.getText().toString();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uname.equals(""))
                {
                    Toast.makeText(MainActivity.this, "UserID required", Toast.LENGTH_SHORT).show();
                }
                if (pwd.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Password required", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
