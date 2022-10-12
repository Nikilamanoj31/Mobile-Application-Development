package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;



public class MainActivity extends AppCompatActivity {
    private EditText name, email, phone, age, edu, pwd;
    private Button b1;
    private RadioGroup gn;
    String na, em, ph, ed, ag, pswd;
    int gnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        age = (EditText) findViewById(R.id.age);
        edu = (EditText) findViewById(R.id.edu);
        pwd = (EditText) findViewById(R.id.pwd);
        gn = (RadioGroup) findViewById(R.id.gp);
        b1 = (Button) findViewById(R.id.b1);
    }
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            na=name.getText().toString().trim();
            em=email.getText().toString().trim();
            ph=email.getText().toString().trim();
            gnd=gn.getCheckedRadioButtonId();
            ag=age.getText().toString().trim();
            ed=edu.getText().toString().trim();
            pswd=pwd.getText().toString().trim();

            if(name.equals(""))
            {
                Toast.makeText(MainActivity.this, "Enter your user name", Toast.LENGTH_SHORT).show();
            }

            else if(email.equals(""))
            {
                Toast.makeText(MainActivity.this, "Enter your email", Toast.LENGTH_SHORT).show();
            }
            else if(phone.equals(""))
            {
                Toast.makeText(MainActivity.this, "Enter your phone number", Toast.LENGTH_SHORT).show();
            }
            else if(gnd==-1)
            {
                Toast.makeText(MainActivity.this, "Select your gender", Toast.LENGTH_SHORT).show();
            }
            else if(age.equals(""))
            {
                Toast.makeText(MainActivity.this, "Enter your age", Toast.LENGTH_SHORT).show();
            }
            else if(edu.equals(""))
            {
                Toast.makeText(MainActivity.this, "Enter your qualification", Toast.LENGTH_SHORT).show();
            }
            else if(pwd.equals(""))
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
