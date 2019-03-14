package com.paralun.app.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxOrMinObject {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Bambang", 40));
        employees.add(new Employee(2, "Nurdin", 32));
        employees.add(new Employee(3, "Mahmud", 23));
        
        Employee maxAge = employees.stream().max(Comparator.comparing(Employee::getAge)).get();
        Employee minAge = employees.stream().min(Comparator.comparing(Employee::getAge)).get();
        
        System.out.println("Max : " + maxAge);
        System.out.println("Min : " + minAge);
    }

}
