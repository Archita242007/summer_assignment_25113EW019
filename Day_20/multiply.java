import java.util.*;

public class multiply {
    

    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
        int[][] a = {
                {1, 2},
                {3, 4}
        };

        int[][] b = {
                {5, 6},
                {7, 8}
        };

        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int[] row : c) {
            System.out.println(Arrays.toString(row));
        }
        sc.close();
    }
}