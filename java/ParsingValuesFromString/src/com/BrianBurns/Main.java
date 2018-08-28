package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.134";
        System.out.println("numberAsString = " + numberAsString);
        //Calls class of Integer, which has parseInt method,
        //which, if able, will convert String type into int type
        //There are also ones for Double, Float, so on...
        double number  = Double.parseDouble(numberAsString);
        System.out.println("Number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(number);
        System.out.println(numberAsString);
    }
}
