package com.example.picassolibrary;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
        imageView = (ImageView)findViewById(R.id.img);
        Picasso.get().load("url").into(imageView);
    }
}
