package com.judy.poker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

//public class PokerActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_poker);
//
//    }
    public class PokerActivity {
        Card[] cards = new Card[52];

        public PokerActivity() {
            for (int i = 0; i < 52; i++) {
                cards[i] = new Card(i);
            }
        }
//    }
    public void shuffle(){
        for(int i=0;i<52;i++){
          int r =new Random().nextInt(52);
          Card temp = cards[i];
          cards[i]=cards[r];
          cards[r]= temp;

        }
    }
}
