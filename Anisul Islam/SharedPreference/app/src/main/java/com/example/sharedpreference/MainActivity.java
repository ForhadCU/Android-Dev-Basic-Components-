package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText usernameEditText, passwordEditText;
    private Button saveButton, loadButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditTextId);
        passwordEditText = findViewById(R.id.passwordEditTextId);
        saveButton = findViewById(R.id.saveButtonId);
        loadButton = findViewById(R.id.loadButtonId);
        textView = findViewById(R.id.textViewId);

        saveButton.setOnClickListener(this);
        loadButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (v.getId() == R.id.saveButtonId)
        {
            if (username.equals("") && password.equals(""))
            {
                Toast.makeText(MainActivity.this, "Please Enter Data", Toast.LENGTH_LONG).show();
            }
            else {
                SharedPreferences sharedPreferences = getSharedPreferences("My_Preference", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username_key", username);
                editor.putString("password_key", password);
                editor.apply();
                usernameEditText.setText("");
                passwordEditText.setText("");
                Toast.makeText(MainActivity.this, "Data has been saved", Toast.LENGTH_LONG).show();
            }
        }
        else if (v.getId() == R.id.loadButtonId)
        {
            SharedPreferences sharedPreferences = getSharedPreferences("My_Preference", Context.MODE_PRIVATE);
            String loadUsername = sharedPreferences.getString("username_key", "Do not find username");
            String loadPassword = sharedPreferences.getString("password_key", "Do not find password");
            textView.setText("User name: "+loadUsername + "\n" + "Password: "+loadPassword);
        }
    }
}
