package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private ImageView imageView;
    private Button buttonPre, buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView = findViewById(R.id.txt_id_1);
        imageView = findViewById(R.id.img_id);
        buttonNext = findViewById(R.id.next_btn_id);
        buttonPre = findViewById(R.id.previous_btn_id);

        Bundle bundle = getIntent().getExtras();
        if (bundle  != null)
        {
            String value = bundle.getString("key");
            assert value != null;
            setMethod(value);
        }
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
        buttonNext.setOnClickListener(this);
        buttonPre.setOnClickListener(this);

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home)
//            this.finish();
//
//        return super.onOptionsItemSelected(item);
//    }

    void setMethod(String value)
    {
        switch (value) {
            case "bangladesh":
                imageView.setImageResource(R.drawable.bangladesh_map);
                textView.setText(R.string.bangladesh);

                break;
            case "china":
                imageView.setImageResource(R.drawable.china_map);
                textView.setText(R.string.china);
                break;
            case "canada":
                imageView.setImageResource(R.drawable.canada_map);
                textView.setText(R.string.canada);
                break;
            case "usa":
                imageView.setImageResource(R.drawable.usa_map);
                textView.setText(R.string.usa);
                break;
            case "australia":
                imageView.setImageResource(R.drawable.australia_map);
                textView.setText(R.string.australia);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next_btn_id)
        {
            Intent intent = new Intent(ProfileActivity.this, Page_2.class);
            startActivity(intent);
            finish();
        }
    }
}
