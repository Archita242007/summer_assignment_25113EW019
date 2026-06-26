
import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Java is developed by?");
        System.out.println("1. Microsoft");
        System.out.println("2. Sun Microsystems");
        System.out.println("3. Google");
        System.out.println("4. Apple");

        int ans = sc.nextInt();

        if (ans == 2)
            score++;

        System.out.println("\nQ2. Which keyword is used to create an object?");
        System.out.println("1. new");
        System.out.println("2. create");
        System.out.println("3. object");
        System.out.println("4. class");

        ans = sc.nextInt();

        if (ans == 1)
            score++;

        System.out.println("\nQ3. Size of int in Java?");
        System.out.println("1. 2 Bytes");
        System.out.println("2. 4 Bytes");
        System.out.println("3. 8 Bytes");
        System.out.println("4. Depends on OS");

        ans = sc.nextInt();

        if (ans == 2)
            score++;

        System.out.println("\nYour Score = " + score + "/3");

        sc.close();
    }
}
