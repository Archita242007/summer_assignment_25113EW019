

import java.util.Scanner;

public class columnWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int j = 0; j < c; j++) {

            int sum = 0;

            for(int i = 0; i < r; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + " Sum = " + sum);
        }sc.close();
    }
}
