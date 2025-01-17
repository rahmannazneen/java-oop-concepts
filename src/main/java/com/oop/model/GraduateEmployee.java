package main.java.com.oop.model;

//Inheritance
public class GraduateEmployee {
    String name;
    String department;
    int age;


    public GraduateEmployee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }
    void displayDetails(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Department: " +department);
    }
}
