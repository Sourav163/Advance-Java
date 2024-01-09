package Advance_Java;

/*
    Create a library management system which is capable of issuing books to the students.
    Book should have info like:
    1. Book name
    2. Book Author
    3. Issued to
    4. Issued on
    User should be able to add books, return issued books, issue books
    Assume that all the users are registered with their names in the central database
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Exercise_07 {
    public static ArrayList<String> booksName = new ArrayList<>();
    public static ArrayList<Integer> booksID = new ArrayList<>();
    public static ArrayList<String> issuedBooksName = new ArrayList<>();
    public static ArrayList<Integer> issuedBooksID = new ArrayList<>();

    public static ArrayList<Integer> returnIssuedBookID = new ArrayList<>();
    public static ArrayList<String> returnIssuedBookName = new ArrayList<>();

    public static int totalNumberOfBooks = 0;

    public static void showBooks(Statement statement) throws Exception {
        System.out.println("\nSl_no. - Book_Name (Book_ID)\n");
        for(int index = 0; index < booksID.size(); index++)
            System.out.println((index+1) + " - " + booksName.get(index) + " (" + booksID.get(index) + ")");
    }

    public static void addIssuedBooksToTable(Statement statement) throws Exception {
        for(int i = 0; i < issuedBooksID.size(); i++)
            statement.executeUpdate("insert into issuedbooks values (" + issuedBooksID.get(i) + ", '" + issuedBooksName.get(i) + "');");
    }

    public static void removeIssuedBooksFromTable(Statement statement) throws Exception {
        for(int i = 0; i < issuedBooksID.size(); i++) {
            for(int j = 0; j < returnIssuedBookID.size(); j++) {
                if (issuedBooksID.get(i).equals(returnIssuedBookID.get(j))) {
                    if (returnIssuedBookName.get(j).equalsIgnoreCase(issuedBooksName.get(i))) {
                        statement.executeUpdate("DELETE FROM issuedbooks WHERE Book_ID = " + returnIssuedBookID);
                        issuedBooksID.remove(i);
                        issuedBooksName.remove(i);
                    } else {
                        System.out.println("You have entered wrong issued book name for BookID - " + issuedBooksID.get(i));
                    }
                    break;
                }
            }
        }
    }

    public static void addBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to add :  ");
        int numberOfBooksToAdd = sc.nextInt();
        for(int i = 1; i <= numberOfBooksToAdd; i++) {
            if (numberOfBooksToAdd == 1)
                System.out.print("Enter the book name :  ");
            else
                System.out.print("Enter the book-" + i + " name :  ");
            String book = sc.nextLine();
            booksName.add(book);
            System.out.println("\"" + book + "\" Added.");
            booksID.add(booksID.size() + 1);
//            totalNumberOfBooks += 1;
        }
    }

    public static void issueBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to issue (max. 3 nos.) :  ");
        int numberOfBooksToIssue = sc.nextInt();
        if(numberOfBooksToIssue > 3)
            System.out.println("Sorry, You can't issue more than 3 books.");
        else {
            for(int i = 1; i <= numberOfBooksToIssue; i++) {
                if (numberOfBooksToIssue == 1) {
                    System.out.print("Enter the book ID :  ");
                    issuedBooksID.add(sc.nextInt());
                    System.out.print("Enter the book name :  ");
                    issuedBooksName.add(sc.nextLine());
                }
                else {
                    System.out.print("Enter the book-" + i + " ID :  ");
                    issuedBooksID.add(sc.nextInt());
                    System.out.print("Enter the book-" + i + " name :  ");
                    issuedBooksName.add(sc.nextLine());
                }
                booksName.remove(sc.nextLine());
            }
        }
    }

    public static void returnIssuedBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to return (max. 3 nos.) :  ");
        int numberOfBooksToReturn = sc.nextInt();
        if(numberOfBooksToReturn > 3)
            System.out.println("Sorry, You can't return more than 3 books.");
        else {
            if (numberOfBooksToReturn == 1) {
                System.out.print("Enter the book ID :  ");
                returnIssuedBookID.add(sc.nextInt());
                System.out.print("Enter the book name :  ");
                returnIssuedBookName.add(sc.nextLine());
            }
            for(int i = 1; i <= numberOfBooksToReturn; i++) {
                System.out.print("Enter the ID of Book-" + i + " :  ");
                returnIssuedBookID.add(sc.nextInt());
                System.out.print("Enter the Name of Book-" + i + " :  ");
                returnIssuedBookName.add(sc.nextLine());
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String username = "root";
        String password = "My#SQL@1812";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sourav", username, password
        );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from books order by Book_name asc");

        while (resultSet.next()) {
            booksID.add(resultSet.getInt(1));
            booksName.add(resultSet.getString(2));
            totalNumberOfBooks += 1;
        }


        System.out.println("\t: CHOICES :\nChoose 1 to see books\nChoose 2 to add books\nChoose 3 to issue books\nChoose 4 to return issued books\nChoose 5 to Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your choice :  ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                showBooks(statement);
                break;
            case 2:
                addBooks();
                if(totalNumberOfBooks < booksID.size()) {
                    for(int i = totalNumberOfBooks-1; i < booksID.size(); i++) {
                        statement.executeUpdate("insert into books (Book_ID, Book_Name) values (" + booksID.get(i) + ", '" + booksName.get(i) + "');");
                    }
                }
        }


//        issuedBooksID.add(1);
//        issuedBooksID.add(2);
//        issuedBooksID.add(3);
//        issuedBooksID.add(4);
//        issuedBooksID.add(5);
//        issuedBooksName.add("ABC1");
//        issuedBooksName.add("ABC2");
//        issuedBooksName.add("ABC3");
//        issuedBooksName.add("ABC4");
//        issuedBooksName.add("ABC5");

//        issuedBooksName.remove(0);
//        issuedBooksName.remove(1);
//        issuedBooksName.remove(2);
//        issuedBooksName.remove(3);
//        issuedBooksName.remove(4);
//        issuedBooksID.remove(0);
//        issuedBooksID.remove(1);
//        issuedBooksID.remove(2);
//        issuedBooksID.remove(3);
//        issuedBooksID.remove(4);

//        System.out.println(issuedBooksID);
//        System.out.println(issuedBooksName);

        connection.close();
    }
}
