package Advance_Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PracticeSet_15 {
    public static void main(String[] args) {
//        // 1. Store 10 students in an ArrayList and display is using for-each loop :
        System.out.println();
        ArrayList<String> students = new ArrayList<>();
        students.add("Trupti");
        students.add("Sourav");
        students.add("Sandhan");
        students.add("Shruti");
        students.add("Sasi");
        students.add("Samikhya");
        students.add("Pikul");
        students.add("Sidharth");
        students.add("Twinkle");
        students.add("Uday");

        int i = 1;
        for(String student : students) {
            System.out.println(i + ". " + student);
            i++;
        }

        // 2. Print time in the format of hh:mm:ss using Date class :
        System.out.println();
        System.out.println("Time in the format of Hours:Minutes:Seconds");
        Date d = new Date();
        System.out.println("Using Date class - " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // 3. Repeat Q2 using Calendar class :
        Calendar c = Calendar.getInstance();
        System.out.println("Using Calendar class - " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        // 4. Repeat Q2 using java.time API :
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
        String myTime = dt.format(df);
        System.out.println("Using java.time API - " + myTime);

        // 5. Verify - Set stores only one element even after adding duplicate elements :
        System.out.println();
        System.out.println("Set<Integer> s = new HashSet<>()");
        Set<Integer> s = new HashSet<>();
        System.out.println("s.add(10)");
        s.add(10);
        System.out.println("s.add(20)");
        s.add(20);
        System.out.println("s.add(50)");
        s.add(50);
        System.out.println("s.add(30)");
        s.add(30);
        System.out.println("s.add(20)");
        s.add(20);
        System.out.println(s);
    }
}
