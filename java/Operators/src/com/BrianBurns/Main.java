package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;  // result is equal to 3
        System.out.println("1 + 2 is " + result);

        int previousResult = result;
        result = result - 1;  //result now equals 2, previousResult is still 3
        System.out.println("result = " + result);

        previousResult = result;
        result = result * 10;
        // * is multiplication
        System.out.println(previousResult + " * 10 = " + result);

        result = result / 5;
        // "/" is division

        previousResult = result;
        result = result % 3;
        // % is modulo or remainder

        result++;
        // ++ increments variable by one, -- will decrease by one
        result += 2;
        // same as result = result + 2
        result *= 10;
        result /= 20;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an alien");
        } else {
            System.out.println("It is an alien");
        }

        int topScore = 100;
        if (topScore >= 100) //Java requires () around if statements
            System.out.println("You got the high score");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            // && is same as 'and' in python, || is same as 'or'
            System.out.println("Greater than top score and less than 100");



    }
}
