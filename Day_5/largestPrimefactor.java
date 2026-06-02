
import java.util.Scanner;

public class largestPrimefactor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long largestPrime = -1;

        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n /= i;
            }
        }

        if (n > 2) {
            largestPrime = n;
        }

        System.out.println("Largest Prime Factor = " + largestPrime);

        sc.close();
    }
}
