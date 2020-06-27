package Calendar类;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Calendar类是一个抽象类
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH);
        System.out.println("月份为" + month);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int day1 = calendar.get(Calendar.DATE);
        System.out.println(day + "  " + day1);

        int house = calendar.get(Calendar.HOUR);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(house + " " + hour);
        Date time = calendar.getTime();
        System.out.println(time);
    }

}
