package main.java.com.oop.project;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveElementFromArraylist {

    public static void main(String[] args) {

        Integer[] array = {8, 4, 2, -5, 3};

        List<Integer> numbers = new ArrayList<>(Arrays.asList(array));
        int accessedValue = numbers.get(2);
        System.out.println("Accessed Value: " + accessedValue);
        int removedValue = numbers.remove(3);
        System.out.println("Removed Value: " + removedValue);
        Collections.sort(numbers);
        System.out.println("Remaining Sorted Value: " + numbers);


    }
}


