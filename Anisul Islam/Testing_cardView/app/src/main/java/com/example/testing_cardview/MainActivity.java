package com.example.testing_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CardView groupsCard, addMembersCard, postsCard, notificationCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupsCard = findViewById(R.id.cardview_1_1);
        addMembersCard = findViewById(R.id.cardview_1_2);
        postsCard = findViewById(R.id.cardview_2_1);
        notificationCard = findViewById(R.id.cardview_2_2);
    }
}
