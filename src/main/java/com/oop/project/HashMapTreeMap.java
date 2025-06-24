package main.java.com.oop.project;


import org.w3c.dom.css.CSSStyleRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class HashMapTreeMap {

    public static void main(String[] args) {

        //HashMap
        Map<String, Integer> fruitMap = new java.util.HashMap<>();
        fruitMap.put("Banana", 1);
        fruitMap.put("Apple", 8);
        fruitMap.put("Palm", 3);
        fruitMap.put("Orange", 11);
        System.out.println("The key and value are: " + fruitMap); //The key and value are: {Apple=8, Palm=3, Orange=11, Banana=1}
        if (fruitMap.containsKey("Banana")) {
            System.out.println("Key 'Banana' exists in the map.");
        }
        if (fruitMap.containsValue(11)) {
            System.out.println("Value 7 exists in the map.");
        }
        fruitMap.replace("Apple", 15);
        System.out.println("Updated Apple value: " + fruitMap.get("Apple"));
        System.out.println("Updated Fruit List: " + fruitMap);


        // ✅ Sort by value

        List<Map.Entry<String, Integer>> sortedValue = new ArrayList<>(fruitMap.entrySet());
        sortedValue.sort(Map.Entry.comparingByValue());
        System.out.println("\nSorted by value (ascending): \n " + sortedValue);

        // ✅ Sort by key
        List<Map.Entry<String, Integer>> sortedKey = new ArrayList<>(fruitMap.entrySet());
        sortedKey.sort(Map.Entry.comparingByKey());
        System.out.println("\nSorted by key (ascending): \n " + sortedKey);


        // TreeMap sorted by their "KEY"
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 1);
        treeMap.put("Apple", 8);
        treeMap.put("Palm", 3);
        treeMap.put("Orange", 11);
        System.out.println("\nThe key and value are: " + treeMap); //The key and value are: {Apple=8, Banana=1, Orange=11, Palm=3}
    }
}


