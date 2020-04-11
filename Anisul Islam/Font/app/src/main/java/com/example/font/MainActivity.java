package com.example.font;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView_1, textView_2, textView_3;
    private Typeface typeface_1, typeface_2, typeface_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_1 = findViewById(R.id.text_id_1);
        textView_2 = findViewById(R.id.text_id_2);
        textView_3 = findViewById(R.id.text_id_3);


        typeface_1 = Typeface.createFromAsset(getAssets(), "Rubik_Bold.ttf");
        textView_1.setTypeface(typeface_1);
        typeface_2 = Typeface.createFromAsset(getAssets(), "Rubik_Italic.ttf");
        textView_2.setTypeface(typeface_2);
        typeface_3 = Typeface.createFromAsset(getAssets(), "Rubik_Black.ttf");
        textView_3.setTypeface(typeface_3);
    }
}
