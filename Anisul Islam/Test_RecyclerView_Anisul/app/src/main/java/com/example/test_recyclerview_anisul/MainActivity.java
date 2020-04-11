package com.example.test_recyclerview_anisul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    String[] title;
    String[] desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);

//        title = getResources().getStringArray(R.)
        title = getResources().getStringArray(R.array.countryName);
        desc = getResources().getStringArray(R.array.countryDesc);

        MyAdapter myAdapter = new MyAdapter(this, title, desc);     //might be wrong

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter.onItemClickListener(new MyAdapter.OnclickInterface() {
            @Override
            public void itemClick(int position, View v) {
                Toast.makeText(getApplicationContext(), "Clicked on: "+ position, Toast.LENGTH_LONG).show();
            }
        });


    }
}
