package edu.ctco.school2.school.exercise6.pack2;

import edu.ctco.school2.school.exercise4.pack1.A;

/**
 * Why we can't instantiate class A, even it has public constructor ?
 *
 * How to fix it ?
 *
 * Ans.: add import of A
 */
class B
{
    A a = new A();       //Compile Time Error
}
