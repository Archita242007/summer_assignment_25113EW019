import java.util.*;
public class StringOperations {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int choice;

        do {

            System.out.println("\n1.Length");
            System.out.println("2.Reverse");
            System.out.println("3.Uppercase");
            System.out.println("4.Palindrome");
            System.out.println("5.Exit");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    for(int i = str.length()-1; i >= 0; i--) 
                         System.out.print(str.charAt(i));
                    System.out.println();
                    break;

                case 3:
                    System.out.println(str.toUpperCase());
                    break;

                case 4:
                    String rev = "";

                    for(int i = str.length()-1; i >= 0; i--)
                        rev += str.charAt(i);

                    if(str.equals(rev))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");

            }

        } while(choice != 5);

        sc.close();
      }
}
