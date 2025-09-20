package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateStringOccurrencesWithCount {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("niyaz","hashmi","niyaz","testing","hashmi");

        Map<String,Long> map = words.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        map.entrySet().stream().filter(m->m.getValue()>1).forEach(m->System.out.println(m.getKey()+" : "+m.getValue()));
    }
}
