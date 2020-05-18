package com.example.input_method_framwork;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextView.OnEditorActionListener {
    private EditText mActionSend;
    private EditText mActionNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mActionSend = findViewById(R.id.actionSendId);
        mActionNext = findViewById(R.id.actionNextId);
        mActionNext.setOnEditorActionListener(this);
        mActionSend.setOnEditorActionListener(this);
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

        if (actionId == EditorInfo.IME_ACTION_SEND)
        {
            String value = mActionSend.getText().toString();
            //go to another activity
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("key", value);
            startActivity(intent);
        }
        if (actionId == EditorInfo.IME_ACTION_NEXT)
            Toast.makeText(getApplicationContext(), v.getText()+ "", Toast.LENGTH_SHORT).show();

        return true;
    }
}
