package com.kodilla;

public class Kalkulator {
    public static double addNumbers(double a, double b) {
        return a + b;
    }

    public static double subtractNumbers(double a, double b) {
        return a - b;
    }

    public static void main(String[] args){
        System.out.print("Add numbers: ");
        System.out.println(Kalkulator.addNumbers(12.45,50.11));
        System.out.print("Subtract numbers: ");
        System.out.println(Kalkulator.subtractNumbers(200,32.80));
    }

}