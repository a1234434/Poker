package com.judy.poker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


    public class Card{
        String[] symbol ={"b","h","f","d"};
        int number;
     public Card(int number){
         this.number=number;
        }
        public String get(){
         return number%13+1+" "+symbol[number/13];
        }
    }
