package main.java.com.oop;

import main.java.com.oop.model.*;

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
        ;
        System.out.println("Person 1 - " + person.getId() + " : " + person.getName());

        //Inheritance
        Programmer p = new Programmer("Nazneen", "FinTech Unit", 20, 88);
        p.displayStudentDetail();

    }

}
