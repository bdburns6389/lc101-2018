package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int largNum = largest(1,4,8,0,3,8);
        System.out.println("The Largest number is: " + largNum);
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
}
