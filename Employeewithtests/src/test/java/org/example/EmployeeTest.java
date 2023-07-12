package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee e;

    @BeforeEach
    public void setUp() {
        e = new Employee("Brown", "Ginnie", 28);
    }

    @Test
    public void setAgeBelow18Test() {
        //arrange
        int age = 15;
        //act
        //set age and check
        e.setAge(age);
        int setAgeResult = e.getAge();

        //assert
        assertEquals(28, setAgeResult);
    }

    @Test
    public void setAgeAbove18Test() {
        //arrange
        int age = 45;
        //act
        e.setAge(age);
        int setAgeResult = e.getAge();
        //assert
        assertEquals(45, setAgeResult);
    }

    @Test
    public void incAgeTest() {
        //arrange
        e.incAge();
        //act
        int setAgeResult = e.getAge();
        //assert
        assertEquals(29, setAgeResult);
    }



}