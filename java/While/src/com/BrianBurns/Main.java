package com.BrianBurns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count !=6);

        //Do everything below the while(true) line until while is no longer true
        count = 1;
        while(true) {
            if(count == 5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // create an array, then a for loop that executes through each value within array
        String[] names = new String[10];
        for(int i = 0; i < names.length; i++ ){
            System.out.println(i);
        }

  
    }
}
