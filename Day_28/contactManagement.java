
import java.util.Scanner;

public class contactManagement {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        String[] phone = new String[n];

        for(int i = 0; i < n; i++) {

            System.out.println("\nContact " + (i + 1));

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            phone[i] = sc.nextLine();
        }

        System.out.println("\n===== CONTACT LIST =====");

        for(int i = 0; i < n; i++) {

            System.out.println("Name  : " + name[i]);
            System.out.println("Phone : " + phone[i]);
            System.out.println();
        }

        sc.close();
    }
}
