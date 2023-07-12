package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //number 4
        //Manager person3 = new Manager("Bosch", "Xelda", 30);
        //System.out.println(person3.getLastName() + person3.getAge());

        //number 5
        Employee[] myEmployees = {new Employee("Stanhope", "Jake", 34), new Employee("Brown", "Karen", 40) };

        //number 6
        for (Employee person : myEmployees) {
            System.out.println(person.getDetails());
        }

        Manager Jenny = new Manager("Bosch", "Jenny", 30, myEmployees);
        Manager Alex = new Manager("Summers", "Alex", 47, myEmployees);
        System.out.println(Jenny.getEmployeeNames());
        System.out.println(Alex.getDetails());
        System.out.println(Jenny.getDetails());

        System.out.println(myEmployees[0].getDetails());
        System.out.println(myEmployees[1].getDetails());
    }
}