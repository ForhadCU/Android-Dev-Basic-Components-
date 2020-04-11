package com.example.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private Button buttonBangladesh, buttonChina, buttonCanada, buttonUnitedStates, buttonAustralia, buttonExit;
//    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt_id_1);
        buttonBangladesh = findViewById(R.id.btn_id_1);
        buttonChina = findViewById(R.id.btn_id_2);
        buttonCanada = findViewById(R.id.btn_id_3);
        buttonUnitedStates = findViewById(R.id.btn_id_4);
        buttonAustralia = findViewById(R.id.btn_id_5);
        buttonExit = findViewById(R.id.exit_btn_id);

        buttonBangladesh.setOnClickListener(this);
        buttonChina.setOnClickListener(this);
        buttonCanada.setOnClickListener(this);
        buttonUnitedStates.setOnClickListener(this);
        buttonAustralia.setOnClickListener(this);
        buttonExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_id_1)
        {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("key", "bangladesh");
            startActivity(intent);
            finish();
        }
        if (v.getId() == R.id.btn_id_2)
        {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("key", "china");
            startActivity(intent);
            finish();
        }
        if (v.getId() == R.id.btn_id_3)
        {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("key", "canada");
            startActivity(intent);
            finish();
        }
        if (v.getId() == R.id.btn_id_4)
        {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("key", "usa");
            startActivity(intent);
            finish();
        }
        if (v.getId() == R.id.btn_id_5)
        {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("key", "australia");
            startActivity(intent);
            finish();
        }

        //Alert Dialogue
        if (v.getId() == R.id.exit_btn_id)
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

            alertDialogBuilder.setTitle(R.string.alert_title);
            alertDialogBuilder.setMessage(R.string.alert_msg);
            alertDialogBuilder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alertDialogBuilder.setNeutralButton(R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            alertDialogBuilder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            alertDialogBuilder.setCancelable(false);

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
}
