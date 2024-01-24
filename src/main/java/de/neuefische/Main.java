package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int calculateProduct(int a, int b){
        return a * b;
    }

    public static String convertToUpperCase(String s){
        return s.toUpperCase();
    }

    public static boolean isPositiveNumber(int number){
        return number > 0;
    }
}