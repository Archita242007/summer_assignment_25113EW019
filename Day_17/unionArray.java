
import java.util.HashSet;
import java.util.Scanner;

public class unionArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr1)
            set.add(x);

        for(int x : arr2)
            set.add(x);

        System.out.println("Union:");

        for(int x : set){
              System.out.print(x + " ");

       
        } sc.close();
}
}