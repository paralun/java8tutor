package com.paralun.app.stream;

import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(p -> System.out.println(p));
        System.err.println("--------------------");
        Stream<Integer> stream1 = Stream.of(new Integer[]{6,7,8,9,0});
        stream1.forEach(p -> System.out.println(p));
    }

}
