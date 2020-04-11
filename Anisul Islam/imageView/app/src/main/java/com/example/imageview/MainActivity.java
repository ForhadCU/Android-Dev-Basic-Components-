package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView_1, imageView_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_1 = findViewById(R.id.imgV_id_1);
        imageView_2 = findViewById(R.id.imgV_id_2);

        Handler handler = new Handler();
        imageView_1.setOnClickListener(handler);
        imageView_2.setOnClickListener(handler);
    }
    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.imgV_id_1)
            {
                Toast toast = Toast.makeText(MainActivity.this, "First image has been clicked", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.NO_GRAVITY, 0, 0);
                toast.show();
            }
            else if (v.getId() == R.id.imgV_id_2)
            {
                Toast toast = Toast.makeText(MainActivity.this, "Second image has been clicked", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.NO_GRAVITY, 0 , 0);
                toast.show();
            }

        }
    }
}
