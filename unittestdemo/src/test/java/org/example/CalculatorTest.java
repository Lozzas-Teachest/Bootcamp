package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;

    @BeforeEach
    public void setUp() {
        c = new Calculator();
    }

    @Test
    public void additionTest() {
        //arrange
        double a = 5.0;
        double b = 7.0;

        //act
        double actualResult = c.addition(a, b);

        //assert
        assertEquals(12.0, actualResult);
    }

    @Test
    public void dividionByZeroShouldReturnZeroTest() {
        //arrange
        double a = 5.0;
        double b = 0.0;

        //act
        double actualResult = c.division(a, b);

        //assert
        assertEquals(0.0, actualResult);

    }

}