package main.java.com.oop.project;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        //Remove duplicate values and sort the array

        int[] n = {5, 4, 5, 2, 2, 4, 9};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : n) {
            set.add(num);
        }
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        System.out.println("Sorted Array Without any Duplicates: " + sortedList);
    }
}


