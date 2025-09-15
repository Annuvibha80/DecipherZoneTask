package com.week3_d5.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> salary = new ArrayList<>();
        salary.add(1000);
        salary.add(2000);
        salary.add(1200);
        salary.add(3000);
        salary.add(1400);


        List<Integer> salary1 = salary.stream()
                .filter(emp -> emp> 1200)
                .toList();
        System.out.println(salary1);
        List<Double> IncreasedSalary = salary.stream()
                .map(emp -> (emp*0.15)+emp)
                .sorted()
                .toList();
        System.out.println(IncreasedSalary);
    }
}
