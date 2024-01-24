package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add_when1Plus1_thenReturn2() {
        // GIVEN
        int a = 1;
        int b = 1;
        int expected = a + b;
        // WHEN
        int actual = Main.add(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isEven_whenNumberIsEven_thenReturnTrue(){
        // GIVEN
        int number = 4;
        // WHEN
        boolean actual = Main.isEven(number);
        // THEN
        assertTrue(actual);
    }

    @Test
    void isEven_whenNumberIsNotEven_thenReturnFalse(){
        // GIVEN
        int number = 3;
        // WHEN
        boolean actual = Main.isEven(number);
        // THEN
        assertFalse(actual);
    }

    @Test
    void calculateProduct_when3Times4_thenReturn12() {
        // GIVEN
        int a = 3;
        int b = 4;
        int expected = a * b;
        // WHEN
        int actual = Main.calculateProduct(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void convertToUpperCase_whenStringIncludesLowerCaseCharacters_thenReturnStringAsUppercase(){
        // GIVEN
        String s = "Hello World";
        String expected = s.toUpperCase();
        // WHEN
        String actual = Main.convertToUpperCase(s);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isPositiveNumber_whenNumberIsPositive_thenReturnTrue(){
        // GIVEN
        int number = 1;
        // WHEN
        boolean actual = Main.isPositiveNumber(number);
        // THEN
        assertTrue(actual);
    }

    @Test
    void isPositiveNumber_whenNumberIsZero_thenReturnFalse(){
        // GIVEN
        int number = 0;
        // WHEN
        boolean actual = Main.isPositiveNumber(number);
        // THEN
        assertFalse(actual);
    }

    @Test
    void isPositiveNumber_whenNumberIsNegative_thenReturnFalse(){
        // GIVEN
        int number = -1;
        // WHEN
        boolean actual = Main.isPositiveNumber(number);
        // THEN
        assertFalse(actual);
    }
}