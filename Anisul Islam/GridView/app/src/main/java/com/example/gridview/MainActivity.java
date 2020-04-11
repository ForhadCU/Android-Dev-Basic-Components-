package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private String[] countryNames;
    private int[] flags = {R.drawable.bangladesh, R.drawable.china,
                           R.drawable.united_states, R.drawable.canada,
                           R.drawable.australia, R.drawable.india,
                            R.drawable.germany, R.drawable.south_korea,
                            R.drawable.brazil, R.drawable.bangladesh, R.drawable.china,
                           R.drawable.united_states, R.drawable.canada,
                           R.drawable.australia, R.drawable.india,
                            R.drawable.germany, R.drawable.south_korea,
                            R.drawable.brazil};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridViewId);
        countryNames = getResources().getStringArray(R.array.names);

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, countryNames, flags);
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryNames[position];
//                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("key", value);
                startActivity(intent);
            }
        });
    }
}

