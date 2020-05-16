package com.example.intenttotakeapicture;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private File mImageFile;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //solved Uri Exposure Error
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        //end

        button = findViewById(R.id.camButtonId);
        button.setOnClickListener(this);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 0)
        {
            switch (resultCode)
            {
                case MainActivity.RESULT_OK:
                    if (mImageFile.exists())
                        Toast.makeText(getApplicationContext(), "This picture save in :" + mImageFile.getAbsolutePath(), Toast.LENGTH_LONG).show();

                    else
                        Toast.makeText(getApplicationContext(), "There is problem in capturing picture", Toast.LENGTH_SHORT).show();
                    break;

                case MainActivity.RESULT_CANCELED:
                    break;
                default:
                        break;
            }
        }
    }

    @Override
    public void onClick(View v) {

            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

            mImageFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "picture.jpg");
            Uri imageUri =  Uri.fromFile(mImageFile);
//        Uri outputFileUri = FileProvider.getUriForFile(MainActivity.this, BuildConfig.APPLICATION_ID, mImageFile);

            intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
            intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);

            startActivityForResult(intent, 0);

    }
}
