package com.example.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ToggleButton tbtn;
    TextView Mytext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbtn = (ToggleButton) findViewById(R.id.togglebtn);
        Mytext = (TextView) findViewById(R.id.txt);

        tbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Mytext.setText("Wifi is ON");


//                    Toast.makeText(getApplicationContext(),"You are Online now",Toast.LENGTH_SHORT).show();

                  /*  tbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getApplicationContext(),"You are Online Now", Toast.LENGTH_SHORT).show();

                        }
                    });*/


                }
                else {
                    Mytext.setText("Wifi is OFF");
                }
            }
        });
    }
}
