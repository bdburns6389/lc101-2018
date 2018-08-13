package com.BrianBurns;


public class Main {

    public static void main(String[] args) {
        //width of int is 32 (4 bytes)
        int myIntValue = 5; //int variable will not handle decimal points in calculations
        //width of float is 32 (4 bytes)
        float myFloatValue = 5f; //float will have 7 points of decimal precision
        //width of 64 (8 bytes)
        double myDoubleValue = 5d; //double will have 16 points of decimal precision
        //almost always better to use double, as modern computers calculate it faster, and most functions use doubles
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        //Practice
        double myPounds = 200d;
        double myKilos = (myPounds * 0.45359237d);
        System.out.println(myKilos);
    }
}
