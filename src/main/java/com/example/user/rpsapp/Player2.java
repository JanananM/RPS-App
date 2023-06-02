package com.example.user.rpsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Player2 extends AppCompatActivity {

    Button rock, paper, scissor;
    TextView one, player2;
    int playernum, playernum1 = 0, com, com1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player2);

        rock = (Button) findViewById(R.id.rock);
        paper = (Button) findViewById(R.id.paper);
        scissor = (Button) findViewById(R.id.scissor);
        one = (TextView) findViewById(R.id.one);
        player2 = (TextView) findViewById(R.id.player2);

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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



        if (player2 == 1){
            player2.setText("The AI picked Rock");
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

}
