package com.example.listview_array_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);
        final String[] names = getResources().getStringArray(R.array.name);

//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.view_layout,R.id.textID, names);
//        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = names[position];

                Toast.makeText(MainActivity.this, value+"/"+position, Toast.LENGTH_LONG).show();
            }
        });

    }
}
