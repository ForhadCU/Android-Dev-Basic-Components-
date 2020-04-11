package com.example.listview_baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] countryNames;
    private int[] flags = {R.drawable.bangladesh,R.drawable.australia,
            R.drawable.brazil, R.drawable.china,
            R.drawable.canada, R.drawable.germany,
            R.drawable.india,
            R.drawable.south_korea, R.drawable.united_states};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);
        countryNames = getResources().getStringArray(R.array.names);

        CustomAdapter customAdapter = new CustomAdapter(this, countryNames, flags);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String values = countryNames[position];

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("key", values);
                startActivity(intent);

            }
        });

    }
}
