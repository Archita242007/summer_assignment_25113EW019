import java.util.Scanner;

public class libraryManagement {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bookName = new String[n];
        String[] author = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1));

            System.out.print("Enter Book Name: ");
            bookName[i] = sc.nextLine();

            System.out.print("Enter Author Name: ");
            author[i] = sc.nextLine();
        }

        System.out.println("\n===== Library Books =====");

        for(int i = 0; i < n; i++) {
            System.out.println("Book   : " + bookName[i]);
            System.out.println("Author : " + author[i]);
            System.out.println();
        }
         sc.close();
    }
}
