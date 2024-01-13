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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Exercise_07 {
    public static ArrayList<Integer> booksID = new ArrayList<>();
    public static ArrayList<String> booksName = new ArrayList<>();
    public static ArrayList<String> booksAuthor = new ArrayList<>();
    public static ArrayList<String> issuedBooksName = new ArrayList<>();
    public static ArrayList<Integer> issuedBooksID = new ArrayList<>();

    public static ArrayList<Integer> returnIssuedBookID = new ArrayList<>();
    public static ArrayList<String> returnIssuedBooksName = new ArrayList<>();

    public static int totalNumberOfBooks = 0;

    public static void showBooks() {
        System.out.println("\nSl_no. - Book_Name (Book_ID)\n");
        for(int index = 0; index < booksID.size(); index++)
            System.out.println((index+1) + " - " + booksName.get(index) + " (" + booksID.get(index) + ")");
    }

    public static void addIssuedBooksToTable(Statement statement) throws Exception {
        for(int i = 0; i < issuedBooksID.size(); i++) {
            statement.executeUpdate("insert into issuedbooks values (" + issuedBooksID.get(i) + ", '" + issuedBooksName.get(i) + "');");
//            statement.executeUpdate("insert into books (Issued_To, Issued_On) values ('" + ", '" + "')");
        }
    }

    public static void removeIssuedBooksFromTable(Statement statement) throws Exception {
        for(int i = 0; i < issuedBooksID.size(); i++) {
            for(int j = 0; j < returnIssuedBookID.size(); j++) {
                if(issuedBooksID.get(i).equals(returnIssuedBookID.get(j))) {
                    if(returnIssuedBooksName.get(j).equalsIgnoreCase(issuedBooksName.get(i))) {
                        statement.executeUpdate("delete from issuedbooks where Book_ID = " + returnIssuedBookID.get(j));
                        issuedBooksID.remove(i);
                        issuedBooksName.remove(i);
//                        for(int k = 0; k < booksID.size(); k++) {
//                            if(returnIssuedBookID.get(j).equals(booksID.get(k))) {
//                                statement.executeUpdate("update books set Issued_On = NULL where Book_ID = " + booksID.get(k) + ";");
//                                statement.executeUpdate("update books set Issued_To = NULL where Book_ID = " + booksID.get(k) + ";");
//                                break;
//                            }
//                        }
                    }
                    else {
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
            if (numberOfBooksToAdd == 1) {
                System.out.print("Enter the book name :  ");
            }
            else
                System.out.print("Enter the book-" + i + " name :  ");
            if(i == 1)
                sc.nextLine();
            String book = sc.nextLine();
            booksName.add(book);
            System.out.print("Enter the author name :  ");
            String author = sc.nextLine();
            booksAuthor.add(author);
            System.out.println("\"" + book + "\" by '" + author + "' Book Added.");
            booksID.add(booksID.size() + 1);
//            totalNumberOfBooks += 1;
        }
    }

    public static void issueBooks(Statement statement) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to issue (max. 3 nos.) :  ");
        int numberOfBooksToIssue = sc.nextInt();
        if(numberOfBooksToIssue > 3)
            System.out.println("Sorry, You can't issue more than 3 books.");
        else {
            for(int i = 1; i <= numberOfBooksToIssue; i++) {
                int issuedBookID;
                if (numberOfBooksToIssue == 1) {
                    System.out.print("Enter the book ID :  ");
                    issuedBookID = sc.nextInt();
                    issuedBooksID.add(issuedBookID);
                    System.out.print("Enter the book name :  ");
                }
                else {
                    System.out.print("Enter the book-" + i + " ID :  ");
                    issuedBookID = sc.nextInt();
                    issuedBooksID.add(issuedBookID);
                    System.out.print("Enter the book-" + i + " name :  ");
                }
                if(i == 1)
                    sc.nextLine();
                String issuedBookName = sc.nextLine();
                issuedBooksName.add(issuedBookName);
                statement.executeUpdate("update books" + " set Issued_On = '" + LocalDateTime.now() + "' where Book_ID = " + issuedBookID + ";");
                System.out.println(issuedBookName + " Book Issued.");
            }
        }
    }

    public static void returnIssuedBooks(Statement statement) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to return (max. 3 nos.) :  ");
        int numberOfBooksToReturn = sc.nextInt();
        if(numberOfBooksToReturn > 3)
            System.out.println("Sorry, You can't return more than 3 books.");
        else {
            for(int i = 1; i <= numberOfBooksToReturn; i++) {
                int issuedBookID;
                if (numberOfBooksToReturn == 1) {
                    System.out.print("Enter the book ID :  ");
                    issuedBookID = sc.nextInt();
                    returnIssuedBookID.add(issuedBookID);
                    System.out.print("Enter the book name :  ");
                }
                else {
                    System.out.print("Enter the ID of Book-" + i + " :  ");
                    issuedBookID = sc.nextInt();
                    returnIssuedBookID.add(issuedBookID);
                    System.out.print("Enter the Name of Book-" + i + " :  ");
                }
                if(i == 1)
                    sc.nextLine();
                String returnIssuedBookName = sc.nextLine();
                returnIssuedBooksName.add(returnIssuedBookName);
                statement.executeUpdate("update books" + " set Issued_On = NULL where Book_ID = " + issuedBookID + ";");
                System.out.println(returnIssuedBookName + " Book Returned.");
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
            booksAuthor.add(resultSet.getString(3));
            totalNumberOfBooks += 1;
        }

        resultSet = statement.executeQuery("select * from books where Issued_On is not null order by Book_name asc");

        while (resultSet.next()) {
            issuedBooksID.add(resultSet.getInt(1));
            issuedBooksName.add(resultSet.getString(2));
        }


        System.out.println("\t: CHOICES :\nChoose 1 to See Books\nChoose 2 to Add Books\nChoose 3 to Issue Books\nChoose 4 to Return Issued Books\nChoose 5 to Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your choice :  ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                showBooks();
                break;
            case 2:
                addBooks();
                for (int i = totalNumberOfBooks; i < booksID.size(); i++) {
                    if (totalNumberOfBooks < booksID.size()) {
                        statement.executeUpdate("insert into books (Book_ID, Book_Name, Book_Author) values (" + booksID.get(i) + ", '" + booksName.get(i) + "', '" + booksAuthor.get(i) +"');");
                        totalNumberOfBooks += 1;
                    }
                    else {
                        break;
                    }
                }
                break;
            case 3:
                issueBooks(statement);
                addIssuedBooksToTable(statement);
                break;
            case 4:
                returnIssuedBooks(statement);
                removeIssuedBooksFromTable(statement);
                break;
            case 5:
                break;
            default:
                System.out.println("INVALID CHOICE");
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
