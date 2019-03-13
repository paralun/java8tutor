package com.paralun.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollections {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream = list.stream();
        
        List<Integer> genap = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(genap);
    }

}
