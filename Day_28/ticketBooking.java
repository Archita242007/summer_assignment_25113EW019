

import java.util.Scanner;

public class ticketBooking {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        System.out.println("\n===== TICKET =====");

        System.out.println("Passenger   : " + name);
        System.out.println("From        : " + source);
        System.out.println("To          : " + destination);
        System.out.println("Price       : ₹" + price);

        sc.close();
    }
}
