package com.paralun.app.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxOrMinChar {

    public static void main(String[] args) {
        String maxChar = Stream.of("A", "B", "C", "D", "E").max(Comparator.comparing(String::valueOf)).get();
        String minChar = Stream.of("A", "B", "C", "D", "E").min(Comparator.comparing(String::valueOf)).get();
        
        System.out.println("Max Char : " + maxChar);
        System.out.println("Min Char : " + minChar);
    }

}
