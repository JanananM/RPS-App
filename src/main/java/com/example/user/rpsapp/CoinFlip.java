package com.example.user.rpsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class CoinFlip extends AppCompatActivity {

    Button c_coin,c_r;
    TextView c_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_flip);


        c_coin = (Button) findViewById(R.id.c_coin);
        c_r = (Button) findViewById(R.id.c_r);
        c_d = (TextView) findViewById(R.id.c_d);

        c_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flip();
            }
        });

        c_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoinFlip.this, First.class);
                startActivity(intent);
            }
        });
    }

    public void flip(){

        Random rand = new Random();
        int x;
        x = rand.nextInt(2) + 1;

        if (x == 1){
            c_d.setText("Tails");
        }else{
            c_d.setText("Heads");
        }
    }
}
