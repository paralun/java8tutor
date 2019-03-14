package com.paralun.app.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxOrMinNumber {

    public static void main(String[] args) {
        Integer maxNumber = Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
        Integer minNumber = Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
        
        System.out.println("Max Number : " + maxNumber);
        System.out.println("Min Number : " + minNumber);
        
    }

}
