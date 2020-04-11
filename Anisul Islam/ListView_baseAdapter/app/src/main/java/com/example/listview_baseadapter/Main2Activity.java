package com.example.listview_baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageViewId);
        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String value = bundle.getString("key");
        assert value != null;
        method(value);
    }

   public void method(String value)
   {

      switch (value){
          case "Bangladesh":
              imageView.setImageResource(R.drawable.bangladesh_map);
              textView.setText(R.string.bangladesh);
              break;
          case "Australia":
              imageView.setImageResource(R.drawable.australia_map);
              textView.setText(R.string.australia);
              break;
          case "Brazil":
              imageView.setImageResource(R.drawable.brazil_map);
              textView.setText(R.string.brazil);
              break;
          case "China":
              imageView.setImageResource(R.drawable.china_map);
              textView.setText(R.string.china);
              break;
          case "Canada":
              imageView.setImageResource(R.drawable.canada_map);
              textView.setText(R.string.canada);
              break;
          case "Germany":
              imageView.setImageResource(R.drawable.germany_map);
              textView.setText(R.string.germany);
              break;
          case "India":
              imageView.setImageResource(R.drawable.india_map);
              textView.setText(R.string.india);
              break;
          case "South Korea":
              imageView.setImageResource(R.drawable.korea_map);
              textView.setText(R.string.south_korea);
              break;
          case "United States":
              imageView.setImageResource(R.drawable.usa_map);
              textView.setText(R.string.united_states);
              break;
      }
   }
}
