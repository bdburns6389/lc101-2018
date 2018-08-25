package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int highScore = calculateScore(true,
                100,
                3,
                100);
        System.out.println(highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }
}
