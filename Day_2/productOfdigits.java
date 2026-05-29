import java.util.Scanner;

public class productOfdigits {
     public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int p=1;
while(n > 0){
    int r = n % 10;
    p *= r;
    n = n / 10;
}
System.out.println(p);
sc.close();
    }
}
