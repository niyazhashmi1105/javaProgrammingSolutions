package com.java.interview;

import java.util.*;
import java.util.stream.Collectors;

public class NumberToWords {

    static String[] ones = {
            "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
            "","", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int num) {
        if (num == 0) return "Zero";

        if (num < 20)
            return ones[num];

        if (num < 100)
            return tens[num / 10] + " " + ones[num % 10];

        if (num < 1000)
            return ones[num / 100] + " Hundred " + convert(num % 100);

        return "Number too large";
    }

    public static void main(String[] args) {
        int num = 786;
        //System.out.println(convert(num));
        System.out.println(convertUsingMap(num));
    }


    private static Map<Integer,String> map = new HashMap<>();

    static{

        map.put(0, "Zero");map.put(1, "One");map.put(2, "Two");map.put(3, "Three");map.put(4, "Four");map.put(5, "Five");
        map.put(6, "Six");map.put(7, "Seven");map.put(8, "Eight");map.put(9, "Nine");map.put(10, "Ten");map.put(11, "Eleven");
        map.put(12, "Twelve");map.put(13, "Thirteen");map.put(14, "Fourteen");map.put(15, "Fifteen");map.put(16, "Sixteen");
        map.put(17, "Seventeen");map.put(18, "Eighteen");map.put(19, "Nineteen");map.put(20, "Twenty");map.put(30, "Thirty");
        map.put(40, "Forty");map.put(50, "Fifty");map.put(60, "Sixty");map.put(70, "Seventy");map.put(80, "Eighty");
        map.put(90, "Ninety");
    }

    private static String convertUsingMap(int num){

        if (num == 0) return map.get(0);

        List<String> result = new ArrayList<>();

        if (num >= 100) {
            result.add(map.get(num / 100) + " Hundred");
            num %= 100;
        }

        if (num >= 20) {
            result.add(map.get((num / 10) * 10));
            num %= 10;
        }

        if (num > 0) {
            result.add(map.get(num));
        }

        return result.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.joining(" "));
    }
}
