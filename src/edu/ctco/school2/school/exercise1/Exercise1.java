package edu.ctco.school2.school.exercise1;

/**
 * Can you find out the error in the below code?
 *
 * How to fix it? What are the options?
 *
 * Ans.: top-level class can't be 'private'
 * A top-level class as private would be completely useless because nothing would have access to it
 */
//private class Exercise1
class Exercise1
{
    private class SubExercise1
    {
        //Inner class
    }
}