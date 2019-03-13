package com.paralun.app.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        Consumer<Map.Entry<String, Integer>> action = System.out::println;
        map.entrySet().forEach(action);
        System.out.println("------------------");
        
        Consumer<String> actionOnKey = System.out::println;
        map.keySet().forEach(actionOnKey);
        System.out.println("------------------");
        
        Consumer<Integer> actionOnValue = System.out::println;
        map.values().forEach(actionOnValue);
        System.out.println("------------------");
        
        Consumer<Map.Entry<String, Integer>> actionCustome = enrty -> {
            System.out.println("Key is : " + enrty.getKey());  
            System.out.println("Value is : " + enrty.getValue());  
        };
        map.entrySet().forEach(actionCustome);
        
    }

}
