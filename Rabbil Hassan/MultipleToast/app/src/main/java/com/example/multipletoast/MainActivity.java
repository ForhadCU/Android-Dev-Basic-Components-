package com.example.multipletoast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Mybtn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            Mybtn = (Button) findViewById(R.id.btn);

            Mybtn.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {

//                Toast.makeText(getApplicationContext(),"Oh! I am clicked",Toast.LENGTH_SHORT).show();

                    Mytoast_2();
                    Mytoast_1();
                }
            });
        }





    public void Mytoast_1(){

       LayoutInflater li = getLayoutInflater();
       View layout = li.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.customtoast));

        Toast t = new Toast(getApplicationContext());
        t.setDuration(Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER_VERTICAL,0,0);
        t.setView(layout);
        t.show();
    }

    public void Mytoast_2()
    {
        LayoutInflater lin = getLayoutInflater();
        View layout2 = lin.inflate(R.layout.customtoast2,(ViewGroup) findViewById(R.id.coustomtoast2));

        Toast toast2 = new Toast(getApplicationContext());
        toast2.setDuration(Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast2.setView(layout2);
        toast2.show();
    }

}

