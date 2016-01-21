package com.paralun.app;

import java.util.Arrays;

/**
 * @author James Kusmambang
 * @Since 21/01/2016
 */
public class Part1 {

    public static void main(String[] args) {
        
        Arrays.asList("a","b","c").forEach(e -> System.out.println(e));
        
        Arrays.asList("d","e","f").forEach((String e) -> System.out.println(e));
        
        Arrays.asList("g","h","i").forEach(e -> {
            System.out.print(e);
            System.out.print(e);
        });
        
        String seprator = ",";
        Arrays.asList("j","k","l").forEach((String e) -> System.out.print(e + seprator));
        
        final String seprator1 = ",";
        Arrays.asList("j","k","l").forEach((String e) -> System.out.print(e + seprator1));
        
    }

}
