package programmer.zaman.now.classes;

import java.util.Calendar;

public class CalendarApp {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2010);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DATE, 24);

        System.out.println(calendar.getTime());

    }
}
