package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
        //assign value to method to be able to print out the return statement
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    //Second method with same name as above, but is valid as long as the parameters are different
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }
    //Number of parameters MUST BE CHANGED, for example,
    //changing return type to void would not work.
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }




}
