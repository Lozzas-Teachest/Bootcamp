package org.example;

public class Employee {
    private String lastName;
    private int age;

    private String firstName;

    private int retirementAge = 65;

    //can access static through the class you do not need an instance
    public static double employeeTax;

    public Employee(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.age = age;
        this.firstName = firstName;
    }

    public Employee(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {

        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age < retirementAge) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 18");
        }
    }

    public void setRetirementAge(int retirementAge) {
        this.retirementAge = retirementAge;
    }

    public void incAge() {
        if (this.age <= retirementAge) {
            age++;
        }
    }

    // no 11
    public String getDetails() {
        return this.lastName + " " + this.age;
    }

    public int getRetirementAge() {
        return retirementAge;
    }
}

