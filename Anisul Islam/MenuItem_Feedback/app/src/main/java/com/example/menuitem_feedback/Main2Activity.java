package com.example.menuitem_feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText nameEditText, messageEditText;
    private Button sendButton, clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sendButton = findViewById(R.id.btnId_1);
        clearButton = findViewById(R.id.btnId_2);
        nameEditText = findViewById(R.id.editTextId_1);
        messageEditText = findViewById(R.id.editTextId_2);

        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String name = nameEditText.getText().toString();
        String message = messageEditText.getText().toString();

        try {


            if (v.getId() == R.id.btnId_1)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"kashem.tipo1@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from Apps");
                intent.putExtra(Intent.EXTRA_TEXT, "Name : "+name+"\n"+"Feedback : "+ message);
                startActivity(Intent.createChooser(intent, "Share with"));
            }
            else if (v.getId() == R.id.btnId_2)
            {
                nameEditText.setText("");
                messageEditText.setText("");
            }
        }catch (Exception e)
        {
            Toast.makeText(Main2Activity.this, "please fill up each fields", Toast.LENGTH_LONG).show();
        }
    }
}
