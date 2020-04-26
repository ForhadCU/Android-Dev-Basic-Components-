package com.example.savestatedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyTest", "onCreate() is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        counter++;
        Log.d("MyTest", "onResume() is called");
    }

/*    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyTest", "onStart() is called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyTest", "onPause() is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyTest", "onStop() is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyTest", "onDestroy() is called");
    }*/

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("MyPutIntKey", counter);
        Log.d("SavedIns", counter+" is saved");
        Toast.makeText(getApplicationContext(), counter+" is saved", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("MyPutIntKey");
        Log.d("RestoreIns", counter+" is restored");
        Toast.makeText(getApplicationContext(), counter+" is restored", Toast.LENGTH_LONG).show();

    }

}
