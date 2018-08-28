package com.BrianBurns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Takes in 10 numbers from user, then prints back the sum of numbers
        //tells user if is an invalid input, deletes from memory,
        //and continues to ask for numbers until 10 have been reached.
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                    //This if will cause the while loop to cease.
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}
