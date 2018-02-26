package edu.ctco.school2.school.exercise5;

/**
 * Why we are able to see protected variable i from class X ?
 *
 * What will be printed out, then fixed ?
 *
 * X class is package private, we instantiate new X class - x instance with all class fields and methods
 *
 * methodOfX is private in class X, private methods can only be accessed from within the same class
 * method 'methodOfx' should be either public or protected
 */
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new X();
        System.out.println(x.i);

        x.methodOfX();
    }
}