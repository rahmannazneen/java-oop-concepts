package main.java.com.oop.project;


import java.util.ArrayList;


public class AddElementsToArraylist {

    public static void main(String[] args) {

        //Add element into Array List
        ArrayList<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Maths");
        languages.add("C++");
        languages.add("Javascript");
        languages.add("Spanish");
        System.out.println("Languages: " + languages);

        //Get Index of the Array List
        String index = languages.get(2);
        System.out.println("Element at Index: "+index);

        //Update the elements from the array list
        languages.set(3,"LOLO");
        System.out.println("Modified ArrayList: " +languages);




    }
}


