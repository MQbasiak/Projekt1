package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4,2));
        System.out.println(calculator.sub(4,5.5));
        System.out.println(calculator.mul(4, 5));
        System.out.println(calculator.div(10, 2));


    }
}