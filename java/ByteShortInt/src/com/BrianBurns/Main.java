package com.BrianBurns;

public class Main {

    public static void main(String[] args) {
        //Int has width of 32
        int myMinValue = -2147483648;  //smallest possible int value
        int myMinValueUnderscore = -2_147_483_648;  //same as above, underscores for readability
        int myMaxValue = 2147483647;  //largest possible int value

        System.out.println(myMaxValue + myMaxValue + myMinValueUnderscore);

        //Byte has width of 8
        byte myMinByteValue = -128; //smallest byte value
        byte myMaxByte = 127; //largest byte value

        byte myNewByteValue = (byte) (myMinByteValue / 2);  //requires casting, as java defaults to 'int' on new variables

        //Short has width of 16
        short myShortValue = -32768; //smallest short value
        short myMaxShortValue = 32767; //largest short value

        //Long has a width of 64
        long myLongValue = -9_223_372_036_854_775_808L; //smallest long value, denote with 'L' at end
        long myMaxLongValue = 9_223_372_036_854_775_807L; //largest long value

    }
}
