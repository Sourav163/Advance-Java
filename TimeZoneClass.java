package Advance_Java;

import java.util.TimeZone;

public class TimeZoneClass {
    public static void main(String[] args) {
        TimeZone tz = TimeZone.getTimeZone("Asia/Calcutta");

//        int c = 0;
//        for(int i = 0; i < TimeZone.getAvailableIDs().length; i++) {
//            System.out.println(TimeZone.getAvailableIDs()[i]);
//            c++;
//        }
//        System.out.println(c);

        System.out.println(TimeZone.getAvailableIDs()[252]);
        System.out.println(TimeZone.getAvailableIDs()[620]);

        System.out.println(TimeZone.getDefault());
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getDSTSavings());
        System.out.println(tz.getID());
        System.out.println(tz.getRawOffset());
        System.out.println(tz.observesDaylightTime());
        System.out.println(tz.useDaylightTime());
    }
}
