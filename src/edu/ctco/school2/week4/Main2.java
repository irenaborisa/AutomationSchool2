package edu.ctco.school2.week4;

public class Main2 {
    public static void main(String[] args) {

        RegistrationForm r1 = new RegistrationForm("John", "Smith");

        /*r1.firstName = "John";
        r1.lastName = "Smith";*/

        System.out.println(r1);

        RegistrationForm r2 = new RegistrationForm("John");
        System.out.println(r2);

        RegistrationForm r3 = new RegistrationForm();
        System.out.println(r3.getFirstName());
    }

    //encapsulation - skritie nenuzhnih metodov
}
