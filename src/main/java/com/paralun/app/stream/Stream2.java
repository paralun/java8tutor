package com.paralun.app.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {

    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        for(int i=1; i < 10; i++) {
            list.add(i);
        }
        
        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }

}
