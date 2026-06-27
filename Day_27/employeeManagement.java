import java.util.Scanner;

public class employeeManagement {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] id = new int[n];
        String[] name = new String[n];
        double[] salary = new double[n];

        for(int i = 0; i < n; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }

        System.out.println("\n----- Employee Records -----");
           for(int i = 0; i < n; i++) {
            System.out.println("ID     : " + id[i]);
            System.out.println("Name   : " + name[i]);
            System.out.println("Salary : ₹" + salary[i]);
            System.out.println();
        }

        sc.close();
}
}
