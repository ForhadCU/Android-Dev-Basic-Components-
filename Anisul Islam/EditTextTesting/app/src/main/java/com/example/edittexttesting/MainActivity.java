package com.example.edittexttesting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView result_text, editText_1, editText_2;
    private Button addButton, subButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_text = findViewById(R.id.txt_id_1);
        editText_1 = findViewById(R.id.edit_id_1);
        editText_2 = findViewById(R.id.edit_id_2);
        addButton = findViewById(R.id.btn_id_1);
        subButton = findViewById(R.id.btn_id_2);

        Handler handler = new Handler();

        addButton.setOnClickListener(handler);
        subButton.setOnClickListener(handler);
    }
    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
           try{
               String number_1 = editText_1.getText().toString();
               String number_2 = editText_2.getText().toString();

               Double num_1 = Double.parseDouble(number_1);
               Double num_2 = Double.parseDouble(number_2);

               if (v.getId() == R.id.btn_id_1)
               {
                   double sum = num_1 + num_2;
                   result_text.setText("Result is : "+ sum);
               }
               else if (v.getId() == R.id.btn_id_2)
               {
                   double sub = num_1 - num_2;
                   result_text.setText("Result is : "+ sub);
               }
           }
           catch (Exception e)
           {
               Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
           }

        }
    }
}
