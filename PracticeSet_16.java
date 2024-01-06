package Advance_Java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@Deprecated
class DeprecatedClass {
    public void msg() {
        System.out.println("I am a Deprecated Class");
    }
}

interface Interface3 {
    public void greet();
}

public class PracticeSet_16 {
    public static void main(String[] args) {
        // 1. Create a class and a method with deprecated annotation. What is its effect on program execution?
//        DeprecatedClass dc = new DeprecatedClass();
//        dc.msg();

        // 2. Suppress the warning generated in Q1.
//        @SuppressWarnings("deprecation")
//        DeprecatedClass dc0 = new DeprecatedClass();
//        dc0.msg();

        // 3. Create an interface and generate an instance from it.
//        Interface3 obj = () -> {
//            System.out.println("Hello World");
//        };
//        obj.greet();

        // 4.  Write a Java program to generate a multiplication table of a given number and write it to a file.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :  ");
//        int n = sc.nextInt();
//        File f = new File("D:\\Sourav\\IdeaProjects\\Java\\src\\Advance_Java\\Multiplication Table File.txt");
//        try {
//            if(f.createNewFile())
//                System.out.println(f + " Created Successfully.");
//            FileWriter fw = new FileWriter("D:\\Sourav\\IdeaProjects\\Java\\src\\Advance_Java\\Multiplication Table File.txt");
//            for(int i = 1; i <= 10; i++)
//                fw.write(n + " * " + i + " = " + n*i + "\n");
//            fw.close();
//            Scanner sc0 = new Scanner(f);
//            while(sc0.hasNextLine()) {
//                String line = sc0.nextLine();
//                System.out.println(line);
//            }
//            sc0.close();
//        }
//        catch(IOException e) {
//            System.out.println("Something is Wrong while creating " + f);
//        }
//        sc.close();

        // 5. Repeat Q4 with numbers from 2 to 9 and save all these multiplication tables to a file.
        File mtf = new File("D:\\Sourav\\IdeaProjects\\Java\\src\\Advance_Java\\Multiplication Table File (2-9).txt");
        try {
            if(mtf.createNewFile())
                System.out.println(mtf + " Created Successfully.");
            FileWriter mfw = new FileWriter("D:\\Sourav\\IdeaProjects\\Java\\src\\Advance_Java\\Multiplication Table File (2-9).txt");
            for(int num = 2; num < 10; num++) {
                mfw.write("Multiplication Table - " + num + "\n");
                for(int i = 1; i <= 10; i++)
                    mfw.write(num + " * " + i + " = " + num*i + "\n");
                mfw.write("\n");
            }
            mfw.close();
            Scanner sc1 = new Scanner(mtf);
            while(sc1.hasNextLine()) {
                String line = sc1.nextLine();
                System.out.println(line);
            }
            sc1.close();
        }
        catch(IOException e) {
            System.out.println("Something is Wrong while creating " + mtf);
        }
    }
}
