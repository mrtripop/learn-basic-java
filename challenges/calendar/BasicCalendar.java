package challenges.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class BasicCalendar {

    // public String findDay(int month, int day, int year) {
    // Calendar calendar = Calendar.getInstance();
    // calendar.set(year, month - 1, day);
    // String date = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,
    // Locale.getDefault());
    // return date.toUpperCase();
    // }

    /**
     * Read more about Calendar & GregorianCalendar at
     * https://docs.oracle.com/javase/6/docs/api/java/util/Calendar.html#MONTH:~:text=The-,Calendar,-class%20is%20an
     * <br>
     * Read more about SimpleDateFormat(pattern) at
     * https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html#:~:text=%2D08%3A00-,Pattern%20letters%20are%20usually%20repeated,-%2C%20as%20their%20number
     * <br>
     * - 'E' mean 'Day name in week'.<br>
     * - If sequence of 'E' is more than 4 character, it mean use the full form;
     * otherwise a short form.
     * - Define month with minus 1 because of order of month in computer is start
     * from 0 - 11 (Jan - Dec).
     * 
     * @param month
     * @param day
     * @param year
     * @return Day string uppercase
     */
    public String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month - 1, day);
        SimpleDateFormat format = new SimpleDateFormat("EEEE");
        return format.format(calendar.getTime()).toUpperCase();
    }
}
