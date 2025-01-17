package main.java.com.oop.model;

//Inheritance
public class Programmer extends GraduateEmployee {

    int programmerID;

    public Programmer(String name, String department, int age, int programmerID) {
        super(name, department, age);
        this.programmerID = programmerID;
    }

    public void displayStudentDetail() {
        displayDetails();
        System.out.println("Student Details: " + programmerID);
    }


}
