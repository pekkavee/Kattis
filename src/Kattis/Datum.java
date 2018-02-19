package Done;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y =2009;
        sc.close();
        Date date = new Date();
//        String[] weekdays = new DateFormatSymbols().getWeekdays();
        String [] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday"};
        Calendar calendar = new GregorianCalendar(y,m-1,d);
        System.out.println(weekdays[calendar.get(Calendar.DAY_OF_WEEK)-1]);

    }
}
