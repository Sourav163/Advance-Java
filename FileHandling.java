package Advance_Java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        // File Declaration :
        File newFile = new File("D:\\Sourav\\IdeaProjects\\Java\\src\\Advance_Java\\newFile.txt");

        // File Creation :
//        System.out.println(newFile.createNewFile());

        // File Write :
//        FileWriter fw = new FileWriter("D:\\Sourav\\IdeaProjects\\Java\\src\\Advance_Java\\newFile.txt");
//        fw.write("Hello World\nWelcome to My Virtuality\n\t-UnKnown :)");
//        fw.close();

        // File Read :
//        Scanner sc = new Scanner(newFile);
//        while(sc.hasNextLine()) {
//            String line = sc.nextLine();
//            System.out.println(line);
//        }
//        sc.close();

        // File Deletion :
//        if(newFile.delete())
//            System.out.println(newFile + " Deleted Successfully.");
//        else
//            System.out.println("Something is Wrong while deleting " + newFile);
    }
}
