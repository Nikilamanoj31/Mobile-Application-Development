package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list1);
        String[] names = new String [] {"india","usa","pakistan","china","bangladesh"};
        ArrayAdapter<String> nameAdapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,names);
        listView.setAdapter(nameAdapter);

        listView.setAdapter(nameAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),adapter2.class);
                intent.putExtra("name",names);
                startActivity(intent);
            }
        });
    }
}
