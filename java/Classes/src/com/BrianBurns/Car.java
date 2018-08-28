package com.BrianBurns;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        //if statements makes any created instance lowercase,
        //then tests if the input was carrera or commodore.
        //If so, it will allow creation of the instance.
        //If not, it automatically says it is "Unknown"
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }


}
