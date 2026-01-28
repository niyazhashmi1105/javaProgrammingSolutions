package com.java.interview;

import java.util.HashMap;
import java.util.Map;

public class FindMaxQuantity {

    public static void main(String[] args) {

        String []a = {"xyz 9","abc 20","xyz 21","pqr 50", "xyz 29"};
        Map<String, Integer> hmap = new HashMap<>();
        int maxQuantity = 0;
        String product = "";

        for(String s: a){
            String [] data = s.split(" ");
            String name = data[0];
            int quantity = Integer.parseInt(data[1]);
            hmap.put(name, hmap.getOrDefault(name,0)+quantity);
        }

        for(Map.Entry<String,Integer> entrySet: hmap.entrySet()){
            if(entrySet.getValue() > maxQuantity){
                maxQuantity = entrySet.getValue();
                product = entrySet.getKey();
            }
        }
        System.out.println(product+" "+maxQuantity);

    }
}
