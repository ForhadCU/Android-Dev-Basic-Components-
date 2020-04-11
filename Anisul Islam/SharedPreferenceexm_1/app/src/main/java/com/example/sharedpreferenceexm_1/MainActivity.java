package com.example.sharedpreferenceexm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button incrementButton, decrementButton;
    private TextView scoreDisplay;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.increaseButtonId);
        decrementButton = findViewById(R.id.decreaseButtonId);
        scoreDisplay = findViewById(R.id.scoreTextId);

        if (loadMethod() != 0)
        {
            scoreDisplay.setText(""+loadMethod());
            score = loadMethod();
        }
        incrementButton.setOnClickListener(this);
        decrementButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.increaseButtonId)
        {
            score = score + 1;
            scoreDisplay.setText(""+score);
            Toast.makeText(MainActivity.this, "Increment", Toast.LENGTH_SHORT).show();
            saveMethod(score);
        }
        else if (v.getId() == R.id.decreaseButtonId)
        {
            score = score - 1;
            scoreDisplay.setText(""+score);
            Toast.makeText(MainActivity.this, "Decrement", Toast.LENGTH_SHORT).show();

            saveMethod(score);
        }
    }
    private void saveMethod(int score)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("Name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("finalScore", score);
        editor.apply();

    }
    private int loadMethod()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("Name", Context.MODE_PRIVATE);
        int loadScore = sharedPreferences.getInt("finalScore", 0);
        return loadScore;
    }

}
