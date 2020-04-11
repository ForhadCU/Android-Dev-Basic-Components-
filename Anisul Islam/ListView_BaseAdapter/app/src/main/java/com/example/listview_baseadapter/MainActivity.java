package com.example.listview_baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    int[] flags = {R.drawable.bangladesh, R.drawable.brazil, R.drawable.china,R.drawable.canada,
            R.drawable.india, R.drawable.australia, R.drawable.united_states, R.drawable.south_korea};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        final String[] names = getResources().getStringArray(R.array.countryNames);

        CustomAdapter customAdapter = new CustomAdapter(this, names, flags);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String values = names[position];

                Toast.makeText(MainActivity.this, values, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
