package main.java.com.oop.project;


public class AverageOfArrayElements {

    public static void main(String[] args) {

        int[] array = {8, 4, 2, -5, 3};
        int sum = 0;

        for (int number : array) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);

        int arrayLength = array.length;
        double average = (double) sum / arrayLength;

        System.out.println("Average of array elements: " + average);
    }
}


