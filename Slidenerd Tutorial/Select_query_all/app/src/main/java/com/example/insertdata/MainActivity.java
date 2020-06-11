package com.example.insertdata;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditText, passEditText;
    DbAdapter dbAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameId);
        passEditText = findViewById(R.id.passId);
        dbAdapter = new DbAdapter(this);

    }

    public void processMethod(View view) {
        String name = nameEditText.getText().toString().trim();
        String pass = passEditText.getText().toString().trim();

        long id = dbAdapter.insertMethod(name, pass);

        if (id<0)
            Toast.makeText(getApplicationContext(), "Unsuccessful", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getApplicationContext(), "Successfully inserted a Row", Toast.LENGTH_LONG).show();
        passEditText.setText("");
        nameEditText.setText("");
        nameEditText.requestFocus();

    }

    public void ViewMethod(View view) {
        String data = dbAdapter.selectMethod();
        Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();
    }
}
