package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Manager m;

    @BeforeEach
    public void setUp() {
        Employee[] employees = {(new Employee("Brown", "Ginnie", 28)), (new Employee("Stanhope", "Laura", 50)), (new Employee("Harris", "Xander", 29))};
        m = new Manager("Brown", "Ginnie", 28, employees);
    }

    @Test
    public void addEmployeeTest() {
        //arrange
        Employee emp = new Employee("Joan", "Kay", 22);

        //act
        m.g
        //set age and check
        m.addEmployee(emp);


        //assert
        assertEquals();
    }



}