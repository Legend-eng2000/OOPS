package Program12;

import java.util.Scanner;

public class Publisher {
    String publisherName;
    void getPublisher(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        publisherName = sc.nextLine();
    }
    void showPublisher() {
        System.out.println("Publisher: " + publisherName);
    }
}
