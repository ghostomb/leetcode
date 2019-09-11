package problems.eleven;

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(11,9,2019));
    }
    public static String dayOfTheWeek(int day, int month, int year) {
        String[] days=new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Long index=(java.time.LocalDate.of(year,month,day).toEpochDay()+4)%7;
        return days[Integer.valueOf(index.toString())];
    }
}
