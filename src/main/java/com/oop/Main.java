package main.java.com.oop;

import main.java.com.oop.model.*;

import java.util.Scanner;

import static main.java.com.oop.project.Calculator.*;


public class Main {

    public static void main(String[] args) {

        //Object
        System.out.println("The data has been fetched by creating Object.");
        Student student = new Student("Kareem Rahman", "ABC College");
        System.out.println("Name: " + student.getName());
        System.out.println("College: " + student.getCollege());

        System.out.println("---------------------------------");


        //Abstraction

        Employee contrator = new Contrator("Nazneen", 10, 9);
        Employee contratorBubu = new Contrator("Bubu", 899, 999);
        Employee permanentEmployee = new PermanentEmployee("Nazneen", 50);
        System.out.println("The Abstraction feature has been implemented.");
        System.out.println("Contrator's Salary: " + contrator.calculateSalary());
        System.out.println("Contrator's Name: " + contrator.getName());
        System.out.println("ContratorBubu's Salary: " + contratorBubu.calculateSalary());
        System.out.println("Permanent Employee's Salary: " + permanentEmployee.calculateSalary());
        System.out.println("---------------------------------");

        //Encapsulation

        Person person = new Person();
        System.out.println("The Encapsulation feature has been implemented.");
        person.setName("Nazneen Rahman");
        System.out.println("Person 1 - " + person.getId() + " : " + person.getName());
        System.out.println("---------------------------------");


        //Inheritance
        Programmer p = new Programmer("Nazneen", "FinTech Unit", 20, 88);
        System.out.println("The Inheritance feature has been implemented.");
        p.displayStudentDetail();
        System.out.println("---------------------------------");

        //Implemented the calculator project
        System.out.println("The calculator project has been implemented.");
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
        //problem solve of the digit count
        System.out.println(sum("123"));
        System.out.println(sum("123abc"));
        System.out.println(sum("456"));
        System.out.println(sum("4a5b6c"));
    }

    private static int sum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return 0;
            } else {
                sum += c - '0';
            }
        }
        return sum;
    }
}
