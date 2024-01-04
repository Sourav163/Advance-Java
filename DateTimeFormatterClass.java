package Advance_Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy @ H:m:s / h:m:s a");
        DateTimeFormatter df0 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df);
        String myDate0 = dt.format(df0);

        System.out.println(myDate);
        System.out.println(myDate0);
    }
}
