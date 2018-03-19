package edu.ctco.school2.week4.inheritance;

public abstract class Vehicle {

    private int color;

    public int getColor() {
        return this.color;
    }

    public void setup(Vehicle vehicle) {
        vehicle.color = 1;
     //   beep();
        shadowedBeep();
    }
    public void shadowedBeep(){
        System.out.println("Base beep!");
    }

    /*public abstract void beep(){
        System.out.println("Base beep!");

    };*/


}
