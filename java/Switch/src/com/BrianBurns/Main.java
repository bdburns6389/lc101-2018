package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }
        String switchValue = "bread";
        switch (switchValue) {
            case "bread":
                System.out.println("Value was bread");
                break;
            case "cat": case "dog": case "horse":
                System.out.println("Value was cat, dog, or horse");
                break;
            default:
                System.out.println("Value not valid");
                break;
        }
    }
}
