package org.example;

public class Task1 {
    public static void main(String[] args) {
        String cardNumber1 = "1234 5678 9012 3456";

        String subString1 = cardNumber1.replace(" ", "").substring(12,16);
        System.out.println("Карта 1: **** **** **** " + subString1);


        String cardNumber2 = "1234567890129999";
        String subString2 = cardNumber2.replace(" ", "").substring(12,16);
        System.out.println("Карта 2: **** **** **** " + subString2);
    }
}
