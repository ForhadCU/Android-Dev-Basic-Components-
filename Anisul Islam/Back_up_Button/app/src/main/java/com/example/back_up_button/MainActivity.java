package com.example.back_up_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonId);
        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("key", "It's done!");
        startActivity(intent);
    }
}
