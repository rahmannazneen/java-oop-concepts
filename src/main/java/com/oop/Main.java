package main.java.com.oop;

import main.java.com.oop.model.Contrator;
import main.java.com.oop.model.Employee;
import main.java.com.oop.model.PermanentEmployee;
import main.java.com.oop.model.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("kareem", "ABC");
//        System.out.println(student.getName());
//        System.out.println(student.getCollege());
        student.setName("bareem");

        Employee contrator = new Contrator("Nazneen", 10, 9);
        Employee contratorBubu = new Contrator("Bubu", 899, 999);
        Employee permanentEmployee = new PermanentEmployee("Nazneen", 50);
        System.out.println("main.java.com.oop.model.Contrator's Salary: " +contrator.calculateSalary());
        System.out.println(contrator.getName());
        System.out.println(contratorBubu.calculateSalary());
        System.out.println(permanentEmployee.calculateSalary());
    }

}
