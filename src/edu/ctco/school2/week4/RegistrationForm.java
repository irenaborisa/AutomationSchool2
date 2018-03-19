package edu.ctco.school2.week4;

public class RegistrationForm {
    private String firstName;
    private String lastName;


    public String toString(){
        return firstName + " " + lastName;
    }

    public RegistrationForm(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public RegistrationForm(String firstName){
        //v etom sluchee vizovetsja konstruktor s dvumja peremennimi
        this(firstName,"NA");
       /*
       mozhno sokratitj kak this (fisrName,"NA"), no togda vizovetsja konsytruktor s 2 poeremennimi;
       esli ostavitj tak, to vtoroj konstruktor ne budet vizivatsja
       this.firstName = firstName;
        this.lastName ="Unknown";*/
    }

    public RegistrationForm(){
       // this(firstName,"NA");
        this("NA");
      //  this.lastName ="Unknown";
    }

    public String getFirstName() {
        return this.firstName;
    }
}

