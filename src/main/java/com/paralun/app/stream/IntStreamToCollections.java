package com.paralun.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamToCollections {

    public static void main(String[] args) {
        List<Integer> list = IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());
        System.out.println(list);
        
        List<Integer> list1 = IntStream.of(1,2,3,4,5).mapToObj(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list1);
        
        int[] intArray = IntStream.of(1,2,3,4,5).toArray();
        System.out.println(Arrays.toString(intArray));
    }

}
