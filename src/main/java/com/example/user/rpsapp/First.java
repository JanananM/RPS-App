package com.example.user.rpsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First extends AppCompatActivity {

    Button to_main, c_shop, c_players;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        to_main = (Button) findViewById(R.id.to_main);
        c_shop = (Button) findViewById(R.id.c_shop);
        c_players = (Button) findViewById(R.id.c_players);


        to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(First.this, RockPaperScissors.class);
                startActivity(intent);

            }
        });

        c_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First.this, CoinFlip.class);
                startActivity(intent);


            }
        });

        c_players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First.this, Player2.class);
                startActivity(Intent.createChooser(intent, "Not Available"));

            }
        });
    }
}



