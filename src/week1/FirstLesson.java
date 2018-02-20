package week1;

import java.util.Scanner;

public class FirstLesson {

    private int myVar = 100;

    public static void main(String[] args) {
        FirstLesson lesson = new FirstLesson();
        FirstLesson lesson2 = new FirstLesson();
        FirstLesson lesson3 = new FirstLesson();

        lesson.setMyVar(99);
        lesson2.setMyVar(88);

        lesson.printMyVar();
        lesson2.printMyVar();
        lesson3.printMyVar();
    }

    private void setMyVar(int i) {
        myVar = i;
    }

    private void printMyVar() {
        System.out.println(myVar);
    }

    public void getNewNumber(int d) throws NegativeNumberException {
        if (d < 0) {
            throw new NegativeNumberException("Negative numbers are restricted!");
        }
    }

    public class NegativeNumberException extends Exception {
        public NegativeNumberException() {
        }

        ;

        public NegativeNumberException(String message) {
            super(message);
        }
    }
}
//esli mesto int ispolzujut Integer, to result budet 'null', tak kak ispolzuetsja vesj integer class
//constanti klassa - te peremennie, kotorie nelzja menatj
//final - znachet cto nelzja menjatj
//esli class 'public', to class viden vo vseh packages, esli prosto class, to ego vidno toljko v konkretnom package - schitaetsja kak private dlja konkretnogo package




/*     System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i <= 100) {
            if (i == 5) {
            } else {
                if (i > 10) {
                    break;
                }
                System.out.println(i);
            }
            i++;
        }
    }

    public static void getNewNumber(int d) // extends RuntimeException extends Exception
    {
        if (d < 0) {
            throw new IllegalArgumentException("Negative numbers are restricted!");
        }

        new NegativeNumberException("Negative numbers are restricted!");
        // how to print exception and do not stop program: DKA

    }

    public static class NegativeNumberException extends Exception {
        public NegativeNumberException(){};

        public NegativeNumberException(String message) {
            super(message);
        }
    }
}*/

// v java 2 tipa exceptionav: runtime exceptions - nemozhno prodolzhatj ispolnenie programmi, ih mozhno ne ukazivatj;
/*


            FirstLesson lesson = new FirstLesson();

            try {
                lesson.getNewNumber(-10);
            } catch (NegativeNumberException e) {
                e.printStackTrace();
            }
        }*/

