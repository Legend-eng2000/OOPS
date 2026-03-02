package Program12;

import java.util.Scanner;

public class Book extends Publisher{
    String title;
    double price;
    void getBook(Scanner sc) {
        getPublisher(sc);
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.nextLine();
    }
    void showBook() {
        showPublisher();
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
