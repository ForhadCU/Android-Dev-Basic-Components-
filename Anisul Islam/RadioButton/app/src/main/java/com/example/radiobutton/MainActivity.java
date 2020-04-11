package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton_1,radioButton_2, infoGather;
    private Button subButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radio_grp_id);
        subButton = findViewById(R.id.btn_id_1);
        resultTextView = findViewById(R.id.txt_id);

        Handler handler = new Handler();

        subButton.setOnClickListener(handler);
    }
    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int selected_id = radioGroup.getCheckedRadioButtonId();
            infoGather = findViewById(selected_id);
            String value = infoGather.getText().toString();

            resultTextView.setText("Selected button is: "+value);
        }
    }
}
