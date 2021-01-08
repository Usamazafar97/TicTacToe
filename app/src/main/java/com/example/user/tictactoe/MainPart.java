package com.example.user.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainPart extends AppCompatActivity {

    boolean forPlayer1 = true;
    int     count = 0;



    boolean row_1_column_1_player_1 = false;
    boolean row_1_column_2_player_1 = false;
    boolean row_1_column_3_player_1 = false;
    boolean row_2_column_1_player_1 = false;
    boolean row_2_column_2_player_1 = false;
    boolean row_2_column_3_player_1 = false;
    boolean row_3_column_1_player_1 = false;
    boolean row_3_column_2_player_1 = false;
    boolean row_3_column_3_player_1 = false;

    boolean row_1_column_1_player_2 = false;
    boolean row_1_column_2_player_2 = false;
    boolean row_1_column_3_player_2 = false;
    boolean row_2_column_1_player_2 = false;
    boolean row_2_column_2_player_2 = false;
    boolean row_2_column_3_player_2 = false;
    boolean row_3_column_1_player_2 = false;
    boolean row_3_column_2_player_2 = false;
    boolean row_3_column_3_player_2 = false;

    boolean row_1_column_1 = false;
    boolean row_1_column_2 = false;
    boolean row_1_column_3 = false;
    boolean row_2_column_1 = false;
    boolean row_2_column_2 = false;
    boolean row_2_column_3 = false;
    boolean row_3_column_1 = false;
    boolean row_3_column_2 = false;
    boolean row_3_column_3 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_part);
    }

    public void Draw() {
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("Match Draw");

        Intent i = new Intent(MainPart.this, Draw.class);
        startActivity(i);

        return;
    }
    public void Start(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.sound_file_1);//For Audio Sound
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }

    public void player_1_Won() {
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("Player 1 Won");
        count = 9;//exit the game

        Intent i = new Intent(MainPart.this, Player_1_End.class);
        startActivity(i);

        return;
    }

    public void player_2_Won() {
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("Player 2 Won");

        Intent i = new Intent(MainPart.this, Player_2_End.class);
        startActivity(i);

        count = 9;//exit the game
        return;
    }

    public boolean chkHorizontallyPlayer1() {
        boolean toReturn = false;
        if ((row_1_column_1_player_1 == true && row_1_column_2_player_1 == true && row_1_column_3_player_1 == true) || (row_2_column_1_player_1 == true && row_2_column_2_player_1 == true && row_2_column_3_player_1 == true) || (row_3_column_1_player_1 == true && row_3_column_2_player_1 == true && row_3_column_3_player_1 == true))
            toReturn = true;
        return toReturn;
    }

    public boolean chkVerticallyPlayer1() {
        boolean toReturn = false;
        if ((row_1_column_1_player_1 == true && row_2_column_1_player_1 == true && row_3_column_1_player_1 == true) || (row_1_column_2_player_1 == true && row_2_column_2_player_1 == true && row_3_column_2_player_1 == true) || (row_1_column_3_player_1 == true && row_2_column_3_player_1 == true && row_3_column_3_player_1 == true))
            toReturn = true;
        return toReturn;
    }

    public boolean chkDiagonallyPlayer1() {
        boolean toReturn = false;
        if ((row_1_column_1_player_1 == true && row_2_column_2_player_1 == true && row_3_column_3_player_1 == true))
            toReturn = true;
        return toReturn;
    }

    public boolean chkSubDiagonallyPlayer1() {
        boolean toReturn = false;
        if ((row_1_column_3_player_1 == true && row_2_column_2_player_1 == true && row_3_column_1_player_1 == true))
            toReturn = true;
        return toReturn;
    }

    public boolean chkHorizontallyPlayer2() {
        boolean toReturn = false;
        if ((row_1_column_1_player_2 == true && row_1_column_2_player_2 == true && row_1_column_3_player_2 == true) || (row_2_column_1_player_2 == true && row_2_column_2_player_2 == true && row_2_column_3_player_2 == true) || (row_3_column_1_player_2 == true && row_3_column_2_player_2 == true && row_3_column_3_player_2 == true))
            toReturn = true;
        return toReturn;
    }

    public boolean chkVerticallyPlayer2() {
        boolean toReturn = false;
        if ((row_1_column_1_player_2 == true && row_2_column_1_player_2 == true && row_3_column_1_player_2 == true) || (row_1_column_2_player_2 == true && row_2_column_2_player_2 == true && row_3_column_2_player_2 == true) || (row_1_column_3_player_2 == true && row_2_column_3_player_2 == true && row_3_column_3_player_2 == true))
            toReturn = true;
        return toReturn;
    }

    public boolean chkDiagonallyPlayer2() {
        boolean toReturn = false;
        if ((row_1_column_1_player_2 == true && row_2_column_2_player_2 == true && row_3_column_3_player_2 == true))
            toReturn = true;
        return toReturn;
    }

    public boolean chkSubDiagonallyPlayer2() {
        boolean toReturn = false;
        if ((row_1_column_3_player_2 == true && row_2_column_2_player_2 == true && row_3_column_1_player_2 == true))
            toReturn = true;
        return toReturn;
    }

    public boolean chk_Player_1() {
        boolean toReturn = false;
        if (chkHorizontallyPlayer1() == true || chkVerticallyPlayer1() == true || chkDiagonallyPlayer1() == true || chkSubDiagonallyPlayer1() == true) {
            player_1_Won();
            toReturn = true;
        }
        return toReturn;
    }

    public boolean chk_Player_2() {
        boolean toReturn = false;
        if (chkHorizontallyPlayer2() == true || chkVerticallyPlayer2() == true || chkDiagonallyPlayer2() == true || chkSubDiagonallyPlayer2() == true) {
            player_2_Won();
            toReturn = true;
        }
        return toReturn;
    }

    public void row_1_column_1_method(View view) {

        if (row_1_column_1 == false && count <= 8) {
            row_1_column_1 = true;

            if (count < 8)
                count++;
            else {
                Draw();
                count = 8;// exit the game
                return;
            }

            if (forPlayer1) {
                //if ((count == 0 || count == 2 || count == 4 || count == 6 || count == 8))
                    row_1_column_1_player_1 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 2 your's turn");
                forPlayer1 = false;

                Button button = (Button) findViewById(R.id.row_1_column_1);
                button.setBackgroundColor(Color.GREEN);
                button.setText("X");

                if (chk_Player_1() == true)
                    count = 9;// exit the game

            } else {

                //if ((count == 1 || count == 3 || count == 5 || count == 7))
                    row_1_column_1_player_2 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 1 your's turn");
                forPlayer1 = true;

                Button button = (Button) findViewById(R.id.row_1_column_1);
                button.setBackgroundColor(Color.YELLOW);
                button.setText("0");

                if (chk_Player_2() == true)
                    count = 9;// exit the game
            }
        }

    }

    public void row_1_column_2_method(View view) {

        if (row_1_column_2 == false && count <= 8) {
            row_1_column_2 = true;

            if (count < 8)
                count++;
            else {
                Draw();
                count = 8;// exit the game
                return;
            }

            if (forPlayer1) {
                //if ((count == 0 || count == 2 || count == 4 || count == 6 || count == 8))
                    row_1_column_2_player_1 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 2 your's turn");
                forPlayer1 = false;

                Button button = (Button) findViewById(R.id.row_1_column_2);
                button.setBackgroundColor(Color.GREEN);
                button.setText("X");

                if (chk_Player_1() == true)
                    count = 9;// exit the game
            } else {

                //if ((count == 1 || count == 3 || count == 5 || count == 7))
                    row_1_column_2_player_2 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 1 your's turn");
                forPlayer1 = true;

                Button button = (Button) findViewById(R.id.row_1_column_2);
                button.setBackgroundColor(Color.YELLOW);
                button.setText("0");

                if (chk_Player_2() == true)
                    count = 9;// exit the game
            }
        }
    }

    public void row_1_column_3_method(View view) {

        if (row_1_column_3 == false && count <= 8) {
            row_1_column_3 = true;

            if (count < 8)
                count++;
            else {
                Draw();
                count = 8;// exit the game
                return;
            }
            if (forPlayer1) {
                //if ((count == 0 || count == 2 || count == 4 || count == 6 || count == 8))
                    row_1_column_3_player_1 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 2 your's turn");
                forPlayer1 = false;

                Button button = (Button) findViewById(R.id.row_1_column_3);
                button.setBackgroundColor(Color.GREEN);
                button.setText("X");

                if (chk_Player_1() == true)
                    count = 9;// exit the game
            } else {
                //if ((count == 1 || count == 3 || count == 5 || count == 7))
                    row_1_column_3_player_2 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 1 your's turn");
                forPlayer1 = true;

                Button button = (Button) findViewById(R.id.row_1_column_3);
                button.setBackgroundColor(Color.YELLOW);
                button.setText("0");

                if (chk_Player_2() == true)
                    count = 9;// exit the game
            }
        }
    }

    public void row_2_column_1_method(View view) {

        if (row_2_column_1 == false && count <= 8) {
            row_2_column_1 = true;

            if (count < 8)
                count++;
            else {
                Draw();
                count = 8;// exit the game
                return;
            }
            if (forPlayer1) {
                //if ((count == 0 || count == 2 || count == 4 || count == 6 || count == 8))
                    row_2_column_1_player_1 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 2 your's turn");
                forPlayer1 = false;

                Button button = (Button) findViewById(R.id.row_2_column_1);
                button.setBackgroundColor(Color.GREEN);
                button.setText("X");

                if (chk_Player_1() == true)
                    count = 9;// exit the game
            } else {
                //if ((count == 1 || count == 3 || count == 5 || count == 7))
                    row_2_column_1_player_2 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 1 your's turn");
                forPlayer1 = true;

                Button button = (Button) findViewById(R.id.row_2_column_1);
                button.setBackgroundColor(Color.YELLOW);
                button.setText("0");

                if (chk_Player_2() == true)
                    count = 9;// exit the game
            }
        }
    }

    public void row_2_column_2_method(View view) {

        if (row_2_column_2 == false && count <= 8) {
            row_2_column_2 = true;

            if (count < 8)
                count++;
            else {
                Draw();
                count = 8;// exit the game
                return;
            }
            if (forPlayer1) {
                //if ((count == 0 || count == 2 || count == 4 || count == 6 || count == 8))
                    row_2_column_2_player_1 = true;
                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 2 your's turn");
                forPlayer1 = false;

                Button button = (Button) findViewById(R.id.row_2_column_2);
                button.setBackgroundColor(Color.GREEN);
                button.setText("X");

                if (chk_Player_1() == true)
                    count = 9;// exit the game
            } else {
                //if ((count == 1 || count == 3 || count == 5 || count == 7))
                    row_2_column_2_player_2 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 1 your's turn");
                forPlayer1 = true;

                Button button = (Button) findViewById(R.id.row_2_column_2);
                button.setBackgroundColor(Color.YELLOW);
                button.setText("0");

                if (chk_Player_2() == true)
                    count = 9;// exit the game
            }
        }
    }

    public void row_2_column_3_method(View view) {

        if (row_2_column_3 == false && count <= 8) {
            row_2_column_3 = true;

            if (count < 8)
                count++;
            else {
                Draw();
                count = 8;// exit the game
                return;
            }
            if (forPlayer1) {
                //if ((count == 0 || count == 2 || count == 4 || count == 6 || count == 8))
                    row_2_column_3_player_1 = true;
                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 2 your's turn");
                forPlayer1 = false;

                Button button = (Button) findViewById(R.id.row_2_column_3);
                button.setBackgroundColor(Color.GREEN);
                button.setText("X");

                if (chk_Player_1() == true)
                    count = 9;// exit the game
            } else {
                //if ((count == 1 || count == 3 || count == 5 || count == 7))
                    row_2_column_3_player_2 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 1 your's turn");
                forPlayer1 = true;

                Button button = (Button) findViewById(R.id.row_2_column_3);
                button.setBackgroundColor(Color.YELLOW);
                button.setText("0");

                if (chk_Player_2() == true)
                    count = 9;// exit the game
            }
        }
    }

    public void row_3_column_1_method(View view) {

        if (row_3_column_1 == false && count <= 8) {
            row_3_column_1 = true;

            if (count < 8)
                count++;
            else {
                Draw();
                count = 8;// exit the game
                return;
            }
            if (forPlayer1) {
                //if ((count == 0 || count == 2 || count == 4 || count == 6 || count == 8))
                    row_3_column_1_player_1 = true;
                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 2 your's turn");
                forPlayer1 = false;

                Button button = (Button) findViewById(R.id.row_3_column_1);
                button.setBackgroundColor(Color.GREEN);
                button.setText("X");

                if (chk_Player_1() == true)
                    count = 9;// exit the game
            } else {
                //if ((count == 1 || count == 3 || count == 5 || count == 7))
                    row_3_column_1_player_2 = true;
                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 1 your's turn");
                forPlayer1 = true;

                Button button = (Button) findViewById(R.id.row_3_column_1);
                button.setBackgroundColor(Color.YELLOW);
                button.setText("0");

                if (chk_Player_2() == true)
                    count = 9;// exit the game
            }
        }


    }

    public void row_3_column_2_method(View view) {

        if (row_3_column_2 == false && count <= 8) {
            row_3_column_2 = true;

            if (count < 8)
                count++;
            else {
                Draw();
                count = 8;// exit the game
                return;
            }
            if (forPlayer1) {
               // if ((count == 0 || count == 2 || count == 4 || count == 6 || count == 8))
                    row_3_column_2_player_1 = true;
                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 2 your's turn");
                forPlayer1 = false;

                Button button = (Button) findViewById(R.id.row_3_column_2);
                button.setBackgroundColor(Color.GREEN);
                button.setText("X");

                if (chk_Player_1() == true)
                    count = 9;// exit the game
            } else {
                //if ((count == 1 || count == 3 || count == 5 || count == 7))
                    row_3_column_2_player_2 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 1 your's turn");
                forPlayer1 = true;

                Button button = (Button) findViewById(R.id.row_3_column_2);
                button.setBackgroundColor(Color.YELLOW);
                button.setText("0");

                if (chk_Player_2() == true)
                    count = 9;// exit the game
            }
        }


    }

    public void row_3_column_3_method(View view) {

        if (row_3_column_3 == false && count <= 8) {
            row_3_column_3 = true;

            if (count < 8)
                count++;
            else {
                Draw();
                count = 8;// exit the game
                return;
            }
            if (forPlayer1) {
                //if ((count == 0 || count == 2 || count == 4 || count == 6 || count == 8))
                    row_3_column_3_player_1 = true;

                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 2 your's turn");
                forPlayer1 = false;

                Button button = (Button) findViewById(R.id.row_3_column_3);
                button.setBackgroundColor(Color.GREEN);
                button.setText("X");

                if (chk_Player_1() == true)
                    count = 9;// exit the game
            } else {
                //if ((count == 1 || count == 3 || count == 5 || count == 7))
                    row_3_column_3_player_2 = true;
                TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
                statusTextView.setText("Player 1 your's turn");
                forPlayer1 = true;

                Button button = (Button) findViewById(R.id.row_3_column_3);
                button.setBackgroundColor(Color.YELLOW);
                button.setText("0");

                if (chk_Player_2() == true)
                    count = 9;// exit the game
            }
        }
    }

    public void Reset(View view) {

        forPlayer1 = true;
        count = 0;

        //All the variables set to 0

        row_1_column_1_player_1 = false;
        row_1_column_2_player_1 = false;
        row_1_column_3_player_1 = false;
        row_2_column_1_player_1 = false;
        row_2_column_2_player_1 = false;
        row_2_column_3_player_1 = false;
        row_3_column_1_player_1 = false;
        row_3_column_2_player_1 = false;
        row_3_column_3_player_1 = false;

        row_1_column_1_player_2 = false;
        row_1_column_2_player_2 = false;
        row_1_column_3_player_2 = false;
        row_2_column_1_player_2 = false;
        row_2_column_2_player_2 = false;
        row_2_column_3_player_2 = false;
        row_3_column_1_player_2 = false;
        row_3_column_2_player_2 = false;
        row_3_column_3_player_2 = false;

        row_1_column_1 = false;
        row_1_column_2 = false;
        row_1_column_3 = false;
        row_2_column_1 = false;
        row_2_column_2 = false;
        row_2_column_3 = false;
        row_3_column_1 = false;
        row_3_column_2 = false;
        row_3_column_3 = false;

        //Turning the text of Edit Text

        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("Player 1 your's turn");

        //Turning the background color of buttons gray

        Button button1 = (Button) findViewById(R.id.row_1_column_1);
        button1.setBackgroundColor(Color.GRAY);
        button1.setText(" ");
        Button button2 = (Button) findViewById(R.id.row_1_column_2);
        button2.setBackgroundColor(Color.GRAY);
        button2.setText(" ");
        Button button3 = (Button) findViewById(R.id.row_1_column_3);
        button3.setBackgroundColor(Color.GRAY);
        button3.setText(" ");
        Button button4 = (Button) findViewById(R.id.row_2_column_1);
        button4.setBackgroundColor(Color.GRAY);
        button4.setText(" ");
        Button button5 = (Button) findViewById(R.id.row_2_column_2);
        button5.setBackgroundColor(Color.GRAY);
        button5.setText(" ");
        Button button6 = (Button) findViewById(R.id.row_2_column_3);
        button6.setBackgroundColor(Color.GRAY);
        button6.setText(" ");
        Button button7 = (Button) findViewById(R.id.row_3_column_1);
        button7.setBackgroundColor(Color.GRAY);
        button7.setText(" ");
        Button button8 = (Button) findViewById(R.id.row_3_column_2);
        button8.setBackgroundColor(Color.GRAY);
        button8.setText(" ");
        Button button9 = (Button) findViewById(R.id.row_3_column_3);
        button9.setBackgroundColor(Color.GRAY);
        button9.setText(" ");
    }
}
