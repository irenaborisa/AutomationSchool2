package week2;

public enum  WeekDay {

    MONDAY(1,false),
    SUNDAY(7, true);

    //definirujut peremennie klassa int i boolean - oni ne statichnie, po etomu prenadlezhat ekzempljaru klassa toljko
    private int seq;
    private boolean isWeekend;
//konstruktar kuda vsegda peredajut parametri v ekzempljar klassa
    WeekDay(int seq, boolean isWeekend){
        // s etogo konstruktara ludshe srazu generitj set i get methodi
        //this - obrashaetsja k sozdannomu ekzempljaru; inkapsuljacija - zakritie ot vseh, radi 'bezopasnosti'
        this.seq = seq;
        this.isWeekend = isWeekend;
    }

    boolean getWeekend(){
        return isWeekend;
    }

    void setWeekend (boolean isWeekend){
        //vizivaet metod ekzempljara
        this.isWeekend = isWeekend;
    }
    public String toString(){
        return "seq = " + seq + " isWeekend = " + isWeekend;

    }
}
/**
 * enums dajut vozmozhnostj delatj incapsuljaciju
 */

