package com.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RodCuttingSolution {

    public static void main(String[] args) {

        int [] rods = {1,1,3,4};
        Arrays.sort(rods);

        List<Integer> rodList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int rod : rods){
            rodList.add(rod);
        }

        while(!rodList.isEmpty()){
            result.add(rodList.size());
            int shortest = rodList.get(0);
            List<Integer> next = new ArrayList<>();
            for(int rod:rodList){
                if(rod == shortest){}
                else{
                    next.add(rod-shortest);
                }
            }
            rodList = next;
        }
        System.out.println(result);
    }
}
