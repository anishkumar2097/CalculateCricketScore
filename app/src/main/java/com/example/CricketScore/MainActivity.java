package com.example.CricketScore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = 0;
            int y = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //  public
    public void displayA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.text1);
        scoreView.setText(String.valueOf(score));
    }

    public void button1(View v) {
        x = x + 1;
        displayA(x);
    }

    public void button2(View d) {
        x = x + 2;
        displayA(x);
    }

    public void button3(View d) {
        x = x + 3;
        displayA(x);

    }
      public void button4(View d){
        x=x+4;
        displayA(x);
      }
    public void button5(View d){
        x=x+5;
        displayA(x);
    }

    public void button6(View d){
        x=x+6;
        displayA(x);
    }
    public void displayB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.text2);
        scoreView.setText(String.valueOf(score));
    }

    public void button7(View v) {
        y= y + 1;
        displayB(y);
    }

    public void button8(View d) {
        y = y+ 2;
        displayB(y);
    }

    public void button9(View d) {
        y= y + 3;
        displayB(y);

    }
    public void button10(View d){
        y=y+4;
        displayB(y);
    }
    public void button11(View d){
        y=y+5;
        displayB(y);
    }

    public void button12(View d){
        y=y+6;
        displayB(y);
    }

    public void Reset(View v){
        x=0;y=0;
        displayA(x);
        displayB(y);
    }
}
