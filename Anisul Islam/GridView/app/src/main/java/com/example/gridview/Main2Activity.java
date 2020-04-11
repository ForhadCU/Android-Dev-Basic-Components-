package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    private ListView listView;
    private String[] countryName;
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
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.listViewId);
        countryName = getResources().getStringArray(R.array.names);
        Bundle bundle = getIntent().getExtras();

        CustomAdapter2 customAdapter2 = new CustomAdapter2(Main2Activity.this, countryName, flags);
        listView.setAdapter(customAdapter2);


    }
}
