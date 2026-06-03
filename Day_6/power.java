import java.util.Scanner;

public class power {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long result = 1;

        for(int i = 1; i <= n; i++){
            result *= x;
        }

        System.out.println(x + "^" + n + " = " + result);
        sc.close();
    }
}
