import java.util.*;
public class sumOfNnums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++){
       s+=i;
        }System.out.println(s);
        sc.close();
    }
}