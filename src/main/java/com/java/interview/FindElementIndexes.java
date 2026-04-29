package com.java.interview;

import java.util.ArrayList;
import java.util.List;

public class FindElementIndexes {

    public static void main(String[] args) {

        int [] input = {1,3,3,4,5,6,6,7,8,9,9};
        int target = 10;
        List<Integer> elementIndex = findIndexes(input,target);
        if(elementIndex.isEmpty()){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at indices: " + elementIndex);
        }
    }

    private static List<Integer> findIndexes(int []input, int target){

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<input.length;i++){
            if(input[i] == target){
                result.add(i);
            }
        }

        return result;
    }

}
