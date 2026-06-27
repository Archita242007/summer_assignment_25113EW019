import java.util.Scanner;

public class salaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        double[] monthlySalary = new double[n];

        for(int i = 0; i < n; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Monthly Salary: ");
            monthlySalary[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\n----- Salary Report -----");

        for(int i = 0; i < n; i++) {

            double annualSalary = monthlySalary[i] * 12;
            System.out.println("Employee : " + name[i]);
            System.out.println("Monthly Salary : ₹" + monthlySalary[i]);
            System.out.println("Annual Salary  : ₹" + annualSalary);
            System.out.println();
        }

        sc.close();
}
}