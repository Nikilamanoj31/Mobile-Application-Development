package com.example.linearlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText uname,em,pwd;
    private Button b1;
    String usname,ema,psw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        uname=(EditText) findViewById(R.id.uname);
        em=(EditText) findViewById(R.id.em);
        pwd=(EditText) findViewById(R.id.pwd);
        b1=(Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usname=uname.getText().toString().trim();
                ema=em.getText().toString().trim();
                psw=pwd.getText().toString().trim();

                if(usname.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your user name", Toast.LENGTH_SHORT).show();
                }

                else if(ema.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your email", Toast.LENGTH_SHORT).show();
                }
                else if(psw.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}
