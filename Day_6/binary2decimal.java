
import java.util.Scanner;

public class binary2decimal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * (1 << power);
            power++;
            binary /= 10;
        }

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}
