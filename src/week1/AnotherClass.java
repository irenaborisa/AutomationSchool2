package week1;

class AnotherClass extends FirstLesson {
    public void anotherMethod() {
        FirstLesson firstLesson = new FirstLesson();
        System.out.println(FirstLesson.PACKAGE_PRIVATE_CONST);

        System.out.println(PACKAGE_PRIVATE_CONST);

    }

}


    //esli class 'package private', to v drugom package nelzja budet sozdatj dazhe ekzempljar classa- budet ne viden
    // protected - ispolzuetsja dlja nasledovanija
//variables - vsegda final static constant
//ploho ispolzovatj static methodi - ih tjazhelo testirovatj

    // private method - viden toljko v nutri klassa

/*
* Local variables -
* proinicilizirovatj == prisvoitj znachenie(int myVar = 100)
*
* local constant - mozhet ispolzovatjs toljko v nutri metoda (final double fixed = 100.0
* final inicilizirujut do ispolzovanija)
* */

