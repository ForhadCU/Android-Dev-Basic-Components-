package com.example.button_onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Mybtn;
    TextView Mytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mybtn = (Button) findViewById(R.id.btn);
        Mytext = (TextView) findViewById(R.id.text);

        Mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Mytext.setText("I am Clicked");

            }

        });

    }
}
