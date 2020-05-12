package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView_1, recyclerView_2;
    private MyAdapter myAdapter;
    private MyAdapter_2 myAdapter_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_1 = findViewById(R.id.recyclerView1_Id);
        recyclerView_2 = findViewById(R.id.recyclerView2_Id);

        myAdapter = new MyAdapter(this, getDataMethod());
        recyclerView_1.setHasFixedSize(true);
        recyclerView_1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_1.setAdapter(myAdapter);

        myAdapter_2 = new MyAdapter_2(this, getDataMethod_2());
        recyclerView_2.setHasFixedSize(true);
        recyclerView_2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_2.setAdapter(myAdapter_2);




    }

    private List<Data_handler_2> getDataMethod_2() {

        List<Data_handler_2> dataList2 = new ArrayList<>();
        int[] images_2 = {R.drawable.ic_android_2, R.drawable.ic_backup_2, R.drawable.ic_credit_2,R.drawable.ic_downlaod_2, R.drawable.ic_dropdown_2};
        String[] texts_2 = {"ANDROID 2", "BACKUP 2", "CREDIT 2", "DOWNLOAD 2", "DROPDOWN 2"};

        for (int i = 0; i<texts_2.length && i<images_2.length; i++)
        {
            Data_handler_2 data_handler_2 = new Data_handler_2();
            data_handler_2.image_data_2 = images_2[i];
            data_handler_2.text_data_2 = texts_2[i];
            dataList2.add(data_handler_2);
        }

        return dataList2;
    }


    private List<Data_handler> getDataMethod() {
        List<Data_handler> dataList = new ArrayList<>();

        int[] images_1 = {R.drawable.ic_android, R.drawable.ic_backup, R.drawable.ic_credit, R.drawable.ic_download, R.drawable.ic_dropdown};
        String[] texts_1 = {"ANDROID", "BACKUP", "CREDIT", "DOWNLOAD", "DROPDOWN"};

        for (int i = 0; i<texts_1.length && i<images_1.length; i++)
        {
            Data_handler data_handler = new Data_handler();
            data_handler.image_data_1 = images_1[i];
            data_handler.text_data_1 = texts_1[i];
            dataList.add(data_handler);
        }

        return dataList;
    }
}
