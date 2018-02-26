package week1;

import java.util.Scanner;

/**
 * Prepare a programming task, where a user needs to input some value, the program is performing some calculations and printing out results in the console (example: inch to cm converter or vice versa),
 */

public class CalculationExercise1 {

    public static void main(String[] args) {
        float temperatureF;
        float temperatureC;
        Scanner in = new Scanner(System.in);
        //get F
        System.out.println("Enter temperatue in Fahrenheit:");

        temperatureF = in.nextInt();
        //calculate (°F − 32) / 1.8 = °C
        temperatureC = ((temperatureF - 32) * 5) / 9;
        //prinbt result
        System.out.println(temperatureF + " Farenheits =" + temperatureC + " Celsius");
    }
}

