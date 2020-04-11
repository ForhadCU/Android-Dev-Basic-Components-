package com.example.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private TextView textView;
    Button selectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.timepk_id);
        timePicker.setIs24HourView(true);
        textView = findViewById(R.id.txt_id);
        selectButton = findViewById(R.id.btn_id);

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView.setText(timePicker.getHour()+":"+ timePicker.getMinute());
//                StringBuilder stringBuilder = new StringBuilder();
//
//                stringBuilder.append(timePicker.getHour()+" :"+ timePicker.getMinute());
                String string = (timePicker.getHour()+" :"+ timePicker.getMinute());
                textView.setText(string);
            }
        });
    }
}
