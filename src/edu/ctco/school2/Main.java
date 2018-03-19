package edu.ctco.school2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double enteredValue = scanner.nextDouble();
            System.out.println("Entered value is double" + enteredValue);
       } catch (InputMismatchException e) {
            System.out.println("InputMismatchException happened!");
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException happened!");
        }
        finally {
            System.out.println("Finally executed!");
        }

        System.out.println("End!");
    }
}
