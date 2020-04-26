package com.example.orientation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            Log.d("MyTag", "Changed to Portrait");
            Toast.makeText(getApplicationContext(), "Changed to Portrait", Toast.LENGTH_SHORT).show();
        }
        else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            Log.d("MyTag", "Changed to Landscape");
            Toast.makeText(getApplicationContext(), "Changed to Landscape", Toast.LENGTH_SHORT).show();
        }
           }
}
