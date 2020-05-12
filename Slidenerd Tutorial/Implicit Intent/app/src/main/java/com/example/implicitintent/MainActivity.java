package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mMapLaunchButton, mPlaystoreLaunchButton, mSendEmailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMapLaunchButton = findViewById(R.id.mapButtonId);
        mPlaystoreLaunchButton = findViewById(R.id.playStoreButtonId);
        mSendEmailButton = findViewById(R.id.emailSendButtonId);
    }

    public void buttonClickMethod(View view) {
        switch (view.getId())
        {

            //Launching Google map
            case R.id.mapButtonId:
                Intent mObjIntent = new Intent(Intent.ACTION_VIEW);
                mObjIntent.setData(Uri.parse("geo:19.076,72.8777"));
/*                Intent chooser = Intent.createChooser(mObjIntent, "Launching Map");   //To choose alternate apps
                startActivity(chooser);*/
                startActivity(mObjIntent);
                break;
            //Find app from PlayStore
            case R.id.playStoreButtonId:
                mObjIntent = new Intent(Intent.ACTION_VIEW);
                mObjIntent.setData(Uri.parse("market://details?id=com.pixelbite.mutant"));      //details?id=com.pixelbite.mutant  this is address of apps from playstore
                Intent chooser = Intent.createChooser(mObjIntent, "Choose store");       //To choose alternate apps
                startActivity(chooser);
                break;
            //Send Email
            case R.id.emailSendButtonId:
                mObjIntent = new Intent(Intent.ACTION_SEND);
                mObjIntent.setData(Uri.parse("mailto:"));       //"mailto:" is changeable
                String[] emailId = {"kashem.tipo1@gmail.com", "marufa1870@gmail.com", "habibulbasar951@gmail.com", "murshida02018@gmail.com", "shahriar.hasan.1523@gmail.com"};

                mObjIntent.putExtra(Intent.EXTRA_EMAIL, emailId);
                mObjIntent.putExtra(Intent.EXTRA_SUBJECT, "Hey, this was sent from my app");
                mObjIntent.putExtra(Intent.EXTRA_TEXT, "What's up yaar!, Its my first message from my Email-app");
                mObjIntent.setType("message/rfc822");

                chooser = Intent.createChooser(mObjIntent, "Send Email");
                startActivity(chooser);


        }
    }
}
