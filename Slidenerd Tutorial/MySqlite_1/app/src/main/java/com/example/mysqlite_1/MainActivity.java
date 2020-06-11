package com.example.mysqlite_1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MySqlite_Helper mySqlite_helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySqlite_helper = new MySqlite_Helper(this);
        SQLiteDatabase sqLiteDatabase = mySqlite_helper.getWritableDatabase();


    }
}
