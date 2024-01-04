package Advance_Java;

import java.util.GregorianCalendar;

public class GregorianCalendarClass {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.getTime());
        System.out.println(gc.getCalendarType());
        System.out.println(gc.isLeapYear(2024));
    }
}
