package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter myAdapterObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);

        myAdapterObj = new MyAdapter(this, getDataMethod());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapterObj);


    }

    private List<Data_handler> getDataMethod() {
        List<Data_handler> data = new ArrayList<>();

        int[] imagelist = {R.drawable.ic_android, R.drawable.ic_moon, R.drawable.ic_bettery, R.drawable.ic_bluetooth};
        String[] textList = {"Bluetooth", "Moon", "Battery", "Android"};

        for (int i = 0; i < textList.length && i < imagelist.length; i++)
        {
            Data_handler data_handlerObj2 = new Data_handler();
            data_handlerObj2.mImageData = imagelist[i];
            data_handlerObj2.mTextData = textList[i];
            data.add(data_handlerObj2);
        }

        return data;
    }

}
