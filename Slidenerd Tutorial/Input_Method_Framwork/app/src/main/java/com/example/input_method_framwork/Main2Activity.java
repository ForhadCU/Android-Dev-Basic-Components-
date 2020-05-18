package com.example.input_method_framwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null)
        {
            String v = bundle.getString("key", "ERROR");
            textView.setText(v);
        }




    }
}
