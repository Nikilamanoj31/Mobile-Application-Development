package com.example.gridview2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    GridView simplegrid;
    int logs[] = {R.drawable.insta,
            R.drawable.linkedin,
            R.drawable.pininterest,
            R.drawable.twitter,
            R.drawable.whatsapp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simplegrid = (GridView) findViewById(R.id.simpleGridView);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logs);

        simplegrid.setAdapter(customAdapter);
        simplegrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                intent.putExtra("image", logs[i]);
                startActivity(intent);

                //Alert Box on selection
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Do you want to exit?");
                builder.setTitle("Alert!");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // When the user click yes button then app will close
                    finish();
                });

                builder.setNegativeButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // When the user click yes button then app will close
                    dialog.cancel();
                });

                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();
            }
        });


    }
}