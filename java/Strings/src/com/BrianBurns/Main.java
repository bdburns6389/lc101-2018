package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        //creates a string.  In java, string is not a primitive type, but an array of chars.
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this more";
        //strings can be added to other strings
        System.out.println("MyString is equal to: " + myString);
        myString = myString + " \u00A9";
        //can also add chars, such as the above copyright unicode
        System.out.println(myString );

        String numberString = "245.44";
        //strings of numbers will be concatenated, no arithmetic will take place
        numberString = numberString + "49.95";
        String lastString = "18";
        int myInt = 50;
        lastString = lastString + myInt;
        //this will concatenate as well, int's and String's will not calculate
        //integer will be converted into a String, but the opposite will not happen
        System.out.println(lastString);

    }
}
