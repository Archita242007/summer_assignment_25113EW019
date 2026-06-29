import java.util.Scanner;

public class inventoryManagement {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] product = new String[n];
        int[] quantity = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Product Name: ");
            product[i] = sc.nextLine();

            System.out.print("Quantity: ");
            quantity[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nInventory");

        for(int i = 0; i < n; i++) {
            System.out.println(product[i] + " : " + quantity[i]);
        }

        sc.close();
}}
