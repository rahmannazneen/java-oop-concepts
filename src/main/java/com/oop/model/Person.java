package main.java.com.oop.model;

public class Person {
    private String name;
    private double id;

    public Person() {
        id = Math.random();
        sayHello();
    }

    private void sayHello() {
        System.out.println("Hello " + getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}
