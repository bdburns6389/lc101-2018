package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest" + calculateInterest(10000.0, 2.0));

        for (int i = 0; i < 2; i++){
            //String.format("%.2f") allows answers to be cut off after 2 decimal points.
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(100000.0, i)));
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
