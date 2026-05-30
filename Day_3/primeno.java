import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c>0)System.out.println("not a prime number ");
        else System.out.println("prime number");
        sc.close();
    }
}
