import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        // your code here
        if (dateTime == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.FRENCH);
        String dateForm = dateTime.format(formatter);
        return String.format("Le %s %s de l'an %s à %dh%dm et %ds",
                dateTime.getDayOfMonth(),
                dateTime.getMonth().getDisplayName(TextStyle.SHORT, Locale.FRENCH),
                dateForm.split(" ")[2],
                dateTime.getHour(),
                dateTime.getMinute(),
                dateTime.getSecond());
    }

    

    public static String formatSimple(LocalDate date) {
        // your code here
        if (date == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        // your code here
        if (time == null) {
            return null;
        }
        return time.toString();
    }

}