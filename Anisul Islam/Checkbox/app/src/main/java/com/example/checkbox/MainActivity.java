package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button subButton;
    private CheckBox milk_checkBox, sugar_checkBox, water_checkBox;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subButton = findViewById(R.id.btn_id_1);
        milk_checkBox = findViewById(R.id.milk_id);
        sugar_checkBox = findViewById(R.id.sugar_id);
        water_checkBox = findViewById(R.id.water_id);
        resultText = findViewById(R.id.txt_id_2);

        Handler handler = new Handler();
        subButton.setOnClickListener(handler);
    }
    class Handler implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            StringBuilder stringBuilder = new StringBuilder();

            if (v.getId() == R.id.milk_id) {
                String value = milk_checkBox.getText().toString();
                stringBuilder.append(value + " is ordered"+ "\n");
            }if (v.getId() == R.id.sugar_id) {
                String value = sugar_checkBox.getText().toString();
                stringBuilder.append(value + " is ordered"+ "\n");
            }if (v.getId() == R.id.water_id) {
                String value = water_checkBox.getText().toString();
                stringBuilder.append(value + " is ordered"+ "\n");
            }
            resultText.setText(stringBuilder);
        }
    }
}
