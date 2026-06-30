import java.util.Scanner;

public class StudentManagementProject {

    static String[] names = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    static void addStudent(Scanner sc) {
        System.out.print("Enter Name: ");
        names[count] = sc.next();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;
    }

    static void displayStudents() {

        if(count == 0) {
            System.out.println("No Records");
            return;
        }

        System.out.println("\nStudent Records");

        for(int i = 0; i < count; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Student Management =====");
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Exit");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);

        sc.close();
    }
}