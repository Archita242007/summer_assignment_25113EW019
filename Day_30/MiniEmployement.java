

import java.util.Scanner;

public class MiniEmployement {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        double[] salary = new double[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nEmployee Details");

        for(int i = 0; i < n; i++)
            System.out.println(name[i] + " ₹" + salary[i]);

        sc.close();
}
}
