package com.java.interview;

import java.util.HashMap;
import java.util.Map;

public class HackathonCompetition {

    public static void main(String[] args) {

        String erica = "EMH";
        String bob = "HME";

        Map<Character,Integer> scoreCard =  new HashMap<>();
        scoreCard.put('E', 1);
        scoreCard.put('M', 3);
        scoreCard.put('H', 5);

        int ericaFinalScore = 0;
        int bobFinalScore = 0;

        for(int i=0;i<erica.length();i++){
            char ericaPoint = erica.charAt(i);
            char bobPoint = bob.charAt(i);
            ericaFinalScore += scoreCard.get(ericaPoint);
            bobFinalScore += scoreCard.get(bobPoint);
        }
        if(ericaFinalScore > bobFinalScore){
            System.out.println("Winner is Erica = "+ ericaFinalScore);
        }
        else if(bobFinalScore > ericaFinalScore){
            System.out.println("Winner is Bob = "+ bobFinalScore);
        }
        else {
            System.out.println("Tie");
        }
    }
}
