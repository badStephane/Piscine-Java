import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        // your code here
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        // your code here
        return LocalDate.parse(stringDate);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        // your code here
        return LocalTime.parse(stringDate);
    }

}