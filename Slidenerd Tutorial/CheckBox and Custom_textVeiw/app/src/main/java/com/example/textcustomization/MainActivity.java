package com.example.textcustomization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkboxId);
        checkBox.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        CheckBox view = (CheckBox) v;

        if (view.isChecked())
        {
            Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Unchecked", Toast.LENGTH_SHORT).show();

        }
    }
}
