package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView editText_1, textView_1, textView_2;
    private Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_1 = findViewById(R.id.edit_txt_id_1);
        textView_1 = findViewById(R.id.txt_id_1);
        textView_2 = findViewById(R.id.txt_id_2);
        checkButton = findViewById(R.id.btn_id_2);

        Handler handler = new Handler();

        checkButton.setOnClickListener(handler);
    }
    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
           try{
               String number = editText_1.getText().toString();
               int num = Integer.parseInt(number);

               if (num>5)
               {
                  errorMassage();
               }
               else {
                Random random = new Random();
                int rand_num = random.nextInt(5)+1;

                if (num == rand_num)
                    {
                         textView_1.setText("You Won!!");

                    }
                else if (num != rand_num)
                    {
                        textView_1.setText("You have lost & number is :"+ rand_num);

                    }
                }
           }

               catch (Exception e)
                {
               Toast toast = Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT);
               toast.setGravity(Gravity.NO_GRAVITY, 0,0);
               toast.show();
                }

        }
    }
    void errorMassage()
    {
        editText_1.setError("Please Enter a valid number");
        editText_1.requestFocus();
        return;
    }

}
