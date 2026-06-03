
import java.util.Scanner;

public class decimal2binary {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}
