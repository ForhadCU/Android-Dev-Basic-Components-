package com.example.custom_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static com.example.custom_toast.R.*;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        button = findViewById(id.btn_id_1);

        Handler handler = new Handler();
        button.setOnClickListener(handler);
    }
    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(layout.custom_toast_layout, (ViewGroup) findViewById(id.custom_layout_id_1));

            Toast toast = new  Toast(MainActivity.this);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            toast.setView(view);
            toast.show();
        }
    }
}
