package main.java.com.oop.model;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 30;
    }
}
