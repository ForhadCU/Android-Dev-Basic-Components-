package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt_id);
        button = findViewById(R.id.btn_id);
        datePicker = findViewById(R.id.datePicker_id);

        textView.setText(CurrentDate());

        //2nd task
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(CurrentDate());
            }
        });
    }
    //1st task
    String CurrentDate() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(datePicker.getDayOfMonth() + "/");
        stringBuilder.append(datePicker.getMonth() + "/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();

    }
}
