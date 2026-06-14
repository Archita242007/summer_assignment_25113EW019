

import java.util.Scanner;

public class missingNum {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (n-1): ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        int sum = 0;

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int n = size + 1;

        int expectedSum = n * (n + 1) / 2;

        System.out.println("Missing Number = " + (expectedSum - sum));

        sc.close();
    }
}
