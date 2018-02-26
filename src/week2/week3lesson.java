package week2;

public class week3lesson {
    public static void main(String args[]) {
        //  WeekDay sunday = new WeekDay(7, false);
        //  System.out.println(WeekDay.SUNDAY);
        String dayName = "Monday";
        switch (dayName) {
            case "Monday":
                System.out.println("on monday step");
                break;
            case "Tuesday":
            case "Friday":
                System.out.println("Working");
                break;
           // case "Friday":
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;

        }
    }
}
