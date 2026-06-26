
import java.util.Scanner;

public class votingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println(name + " is Eligible to Vote.");
        else
            System.out.println(name + " is Not Eligible to Vote.");

        sc.close();
    }
}

