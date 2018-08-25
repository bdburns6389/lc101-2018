package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score is 5000");
        }
        // if statement doesn't need {} if there is only one line after the statement
        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else if (score < 4000) {
            System.out.println("Your score was less than 4000");
        } else {
            System.out.println("You had a score");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
    
}
