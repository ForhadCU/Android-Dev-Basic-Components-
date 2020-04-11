package com.example.toast_massege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button Mybtn;
    TextView Mytxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mybtn = (Button)findViewById(R.id.btn);
        Mytxt = (TextView)findViewById(R.id.txt);
        Mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mytxt.setText("I am Clicked");
                Toast.makeText(getApplicationContext(),"Oh! I am Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
