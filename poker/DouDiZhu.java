package edu.gatech.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {

        // prepare 54 cards
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = new String[]{"♣", "♠", "♥","♦"};
        String[] numbers = {"2", "A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("DaWang");
        poker.add("XiaoWang");
        for(String i: colors){
            for (String j:numbers){
                poker.add(i+j);
            }
        }
        System.out.println(poker);

        // shuffle poker
        Collections.shuffle(poker);
//        System.out.println(poker);

        //Allocate poker to 3 players and 3 base card
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> base = new ArrayList<>();

        int n = poker.size();
        for (int i = 0; i<=n-1; i++){
            if(i>= n-3) base.add(poker.get(i));
            else if (i%3 == 0) player01.add(poker.get(i));
            else if (i%3 == 1) player02.add(poker.get(i));
            else   player03.add(poker.get(i));
        }
        System.out.println("Tom "+player01);
        System.out.println("Mike "+player02);
        System.out.println("Kate " + player03);
        System.out.println("base " +base);

    }//main end
}
