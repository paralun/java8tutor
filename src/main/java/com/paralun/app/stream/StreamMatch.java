package com.paralun.app.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMatch {

    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        
        boolean result;
        
        result = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
        System.out.println(result);
        
        result = memberNames.stream().allMatch((s) -> s.startsWith("A"));
        System.out.println(result);
        
        result = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
        System.out.println(result);
        
        long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
        System.out.println(totalMatched);
        
        String findFirst = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();
        System.out.println(findFirst);
        
        
    }

}
