package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(0, 5);
        if(centimeters < 0.0d) {
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeters(100);
        int largNum = largest(1,2,2,4,2,4);
        System.out.println(largNum);
    }

    private static int largest(int... numbers) {
        int currentLargest = numbers[0];
        for (int number: numbers) {
            if (number > currentLargest){
                currentLargest = number;
            }
        }
        return currentLargest;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        //validates that there are no negative inputs,
        //and that inches are not above 12 (it would need to be feet
        //at that point)
        if((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = ((feet * 12) * 2.54);
        centimeters += inches * 2.54;
        System.out.println(feet + "Feet, " + inches + "inches = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to " + feet + "feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    }
