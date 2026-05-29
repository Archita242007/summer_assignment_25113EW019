
import java.util.Scanner;

public class sumOfdigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int s=0;
while(n > 0){
    int r = n % 10;
    s += r;
    n = n / 10;
}
System.out.println(s);
sc.close();
    }
}
