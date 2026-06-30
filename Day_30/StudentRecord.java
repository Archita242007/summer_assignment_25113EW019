import java.util.Scanner;

public class StudentRecord {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] marks = new int[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nStudent Records");

        for(int i = 0; i < n; i++)
            System.out.println(name[i] + " : " + marks[i]);

        sc.close();
}
}