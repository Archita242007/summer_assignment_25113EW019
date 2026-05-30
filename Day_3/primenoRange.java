import java.util.*;;
public class primenoRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range :");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            int c=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==0){
                System.out.println(i);
            }
        }
    }
}
