import java.util.Scanner;

public class studentManagement{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] roll = new int[n];
        double[] marks = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Roll No: ");
            roll[i] = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("\n----- Student Records -----");

        for(int i = 0; i < n; i++) {
            System.out.println("Name : " + name[i]);
            System.out.println("Roll : " + roll[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println();
        }

        sc.close();
    }}