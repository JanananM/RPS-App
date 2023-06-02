package com.example.user.rpsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class RockPaperScissors extends AppCompatActivity {

    //random
    Random rand = new Random();

    Button b_rock, b_paper, b_scissors, button;
    TextView t_rock, t_cout, h_score, c_score, choice;

    int playernum, com;
    int playernum1 = 0, com1 = 0;

    //user interface
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);

        //buttons
        b_rock = (Button) findViewById(R.id.button4);
        b_paper = (Button) findViewById(R.id.button5);
        b_scissors = (Button) findViewById(R.id.button6);
        button = (Button) findViewById(R.id.button);

        //text
        t_rock = (TextView) findViewById(R.id.t_rock);
        t_cout = (TextView) findViewById(R.id.t_cout);
        h_score = (TextView) findViewById(R.id.h_score);
        c_score = (TextView) findViewById(R.id.c_score);
        choice = (TextView) findViewById(R.id.choice);

        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t_rock.setText("You picked Rock");
                playernum = 1;
               //again();
                computer();
                h_score.setText(Integer.toString(playernum1));
                c_score.setText(Integer.toString(com1));

            }
        });

        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t_rock.setText("You picked Paper");
                playernum = 2;
                //again();
                computer();
                h_score.setText(Integer.toString(playernum1));
                c_score.setText(Integer.toString(com1));
            }
        });

        b_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t_rock.setText("You picked Scissor");
                playernum = 3;
                //again();
                computer();
                h_score.setText(Integer.toString(playernum1));
                c_score.setText(Integer.toString(com1));
            }
        });

        //delete quit, going back
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RockPaperScissors.this, First.class);
                startActivity(intent);
            }
        });

    }

public void computer(){

    com = rand.nextInt(3) + 1;

    if (com == 1){
        t_cout.setText("The AI picked Rock");
    }else if (com == 2){
        t_cout.setText("The AI picked Paper");
    }else if (com == 3){
        t_cout.setText("The AI picked Scissor");
    }else{
        t_cout.setText("Error");
    }

    //game algoritm
    if (playernum == com) {
       choice.setText ("It's a tie");
    } else if (playernum == 1 && com == 2) {
        choice.setText ("The AI won this round.");
        com1 = com1 + 1;
    } else if (playernum == 2 && com == 3) {
        choice.setText ("The AI won this round.");
        com1 = com1 + 1;
    } else if (playernum == 3 && com == 1) {
        choice.setText ("The AI won this round.");
        com1 = com1 + 1;
    } else if (com == 1 && playernum == 2) {
        choice.setText ("You won this round.");
        playernum1 = playernum1 + 1;
    } else if (com == 2 && playernum == 3) {
        choice.setText ("You won this round.");
        playernum1 = playernum1 + 1;
    } else if (com == 3 && playernum == 1) {
        choice.setText ("You won this round.");
        playernum1 = playernum1 + 1;
    } else {
        choice.setText ("Error.");
    }
}
    //game loop control; games wanted
    /*public void again(){
        Scanner scan = new Scanner(System.in); //scanner not; use button; c_game
        int games;
        games = scan.nextInt();

        for (int i = 1; i <= games; i++){
            computer();

        }


    }*/
}
