
import java.util.Scanner;

public class wordCount {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        int count = 1;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of Words = " + count);

        sc.close();
    }
}
