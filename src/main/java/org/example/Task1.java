package org.example;

public class Task1 {
    public static void main(String[] args) {
        String cardNumber1 = "1234 5678 9012 3456";

        for (char i = '0'; i <= '9'; i++) {
            cardNumber1 = cardNumber1.replace(i, '*');
        }
        System.out.println("Карта 1: " + cardNumber1);


        String cardNumber2 = "1234567890123456";
        for (char i = '0'; i <= '9'; i++) {
            cardNumber2 = cardNumber2.replace(i, '*');
        }
        System.out.println("Карта 2: " + cardNumber2);
    }
}
