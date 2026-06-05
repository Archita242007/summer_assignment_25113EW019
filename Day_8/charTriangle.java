import java.util.Scanner;

public class charTriangle {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     char ch = sc.next().charAt(0);
    for(char c='A';c<=ch;c++){
        for(char c1='A';c1<=c;c1++){
            System.out.print(c1);
        }System.out.println();
    } sc.close();
}
}
