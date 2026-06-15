import java.util.Scanner;

public class mergeArrays {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        int k = 0;

        for(int i = 0; i < n1; i++) {
            merged[k++] = arr1[i];
             }

        for(int i = 0; i < n2; i++) {
            merged[k++] = arr2[i];
        }

        System.out.println("Merged Array:");

        for(int num : merged) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
