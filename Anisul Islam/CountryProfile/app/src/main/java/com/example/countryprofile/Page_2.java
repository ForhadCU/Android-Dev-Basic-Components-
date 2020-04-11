package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page_2 extends AppCompatActivity {
    private TextView textView;
    private Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);

        textView = findViewById(R.id.txt_id_1);
        buttonHome = findViewById(R.id.exit_btn_id);


        textView.setText("THE END");

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page_2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
