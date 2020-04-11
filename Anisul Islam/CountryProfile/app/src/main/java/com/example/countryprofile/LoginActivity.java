package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button loginButton;
    private EditText usernameEdittext, passEdittext;
    private TextView atemptTextView;
    private int count = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = findViewById(R.id.loginButtonId);
        usernameEdittext = findViewById(R.id.EditTextId1);
        passEdittext = findViewById(R.id.EditTextId2);
        atemptTextView = findViewById(R.id.attemptTextViewId);


        atemptTextView.setText("Remaining attempt: 5");
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEdittext.getText().toString();
                String password = passEdittext.getText().toString();

                if (username.equals("Country Profile") && password.equals("12345"))
                {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    count--;
                    atemptTextView.setText("Remaining attempt: "+ count);
                    if (count == 0)
                        loginButton.setEnabled(false);
                }
            }
        });
    }
}
