package challenges.calendar;

public class BasicCalendarTest {

    private BasicCalendar calendar = new BasicCalendar();

    public BasicCalendarTest() {
        System.out.println("======= Basic Calendar Test ======");
    }

    public void testFindDay_month8_day5_year2015_expectWEDNESDAY() {
        // action
        String day = calendar.findDay(8, 5, 2015);
        // assert
        System.out.printf("%b: %s = %s%n", "WEDNESDAY".equals(day), "WEDNESDAY", day);
    }

    public void testFindDay_month8_day14_year2017_expectMONDAY() {
        // action
        String day = calendar.findDay(8, 14, 2017);
        // assert
        System.out.printf("%b: %s = %s%n", "MONDAY".equals(day), "MONDAY", day);
    }

}
