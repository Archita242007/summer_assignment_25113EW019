import java.util.Scanner;

public class MiniLibrary {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "DBMS", "C++"};

        System.out.println("Available Books");

        for(String b : books)
            System.out.println(b);

        sc.close();
    }
}
