package edu.ctco.school2.week4.inheritance;

public class Bicycle extends Vehicle implements HumanPowered{

    public void beep(){
        System.out.println("Beeeep!");
    };

    public void run(){
        System.out.println("Running with average speed: " + AVERAGE_SPEED_KM_H);
    };
}
