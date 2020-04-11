package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Button button;
    private TextView textView;
    private String[] sportNames;
    private boolean isSelected = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner = findViewById(R.id.spinnerId);
        button = findViewById(R.id.btnId);
        textView = findViewById(R.id.txtViewId);
        sportNames = getResources().getStringArray(R.array.arrays);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.view_layout_1, R.id.textViewLayoutId, sportNames );
        spinner.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = (String) spinner.getSelectedItem();
                textView.setText(value);
            }
        });
    }
}
