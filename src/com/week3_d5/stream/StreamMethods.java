package com.week3_d5.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> salary = List.of(1000, 2000, 3000);
        List<Integer> salary2 = List.of(4000, 6000, 3000);

        List<List<Integer>> AllSalary = List.of(salary, salary2);

        List<Integer> salaryStream = AllSalary.stream()
                .flatMap(list -> list.stream())
                .toList();
        System.out.println(salaryStream);

        List<Integer> salaryStream2 = salaryStream.stream()
                .distinct()
                .toList();
        System.out.println(salaryStream2);
    }
}
