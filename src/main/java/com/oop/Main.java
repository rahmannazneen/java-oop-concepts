package main.java.com.oop;

import main.java.com.oop.model.*;

import java.util.Scanner;

import static main.java.com.oop.project.Calculator.*;


public class Main {

    public static void main(String[] args) {
        //Object

        Student student = new Student("kareem", "ABC");
//        System.out.println(student.getName());
//        System.out.println(student.getCollege());
        student.setName("bareem");
        //Abstraction

        Employee contrator = new Contrator("Nazneen", 10, 9);
        Employee contratorBubu = new Contrator("Bubu", 899, 999);
        Employee permanentEmployee = new PermanentEmployee("Nazneen", 50);
//        System.out.println("Contrator's Salary: " +contrator.calculateSalary());
//        System.out.println("Contrator's Name: " +contrator.getName());
//        System.out.println("ContratorBubu's Salary: " +contratorBubu.calculateSalary());
//        System.out.println("Permanent Employee's Salary: " +permanentEmployee.calculateSalary());

        //Encapsulation
        Person person = new Person();
        person.setName("Nazneen Rahman");

//        System.out.println("Person 1 - " + person.getId() + " : " + person.getName());
//        //Inheritance
//        Programmer p = new Programmer("Nazneen", "FinTech Unit", 20, 88);
//        p.displayStudentDetail();

        //        Implemented the calculator project
        Scanner scanner = new Scanner(System.in);
        // Step 2: Display menu to the user
        System.out.println("Welcome to the java concept! ");
        System.out.println("Select an operation. ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Please Enter Your Choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= 4) {
            System.out.println("Enter your first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int num2 = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The result after addition: " + addition(num1, num2));
                    break;
                case 2:
                    System.out.println("The result after subtraction: " + subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("The result after multipy: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("The result is after division:" + division(num1, num2));
                    break;
            }
        } else {
            System.out.println("Invalid Choice, Please Try Again");
        }
        scanner.close();
    }

}
