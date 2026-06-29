import java.util.Scanner;

public class ArrayOperations {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int choice;

        do {

            System.out.println("\n1.Display");
            System.out.println("2.Maximum");
            System.out.println("3.Minimum");
            System.out.println("4.Sum");
            System.out.println("5.Exit");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    for(int x : arr)
                        System.out.print(x + " ");
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for(int x : arr)
                        if(x > max)
                            max = x;
                    System.out.println("Maximum = " + max);
                    break;

                case 3:
                    int min = arr[0];
                    for(int x : arr)
                        if(x < min)
                            min = x;
                    System.out.println("Minimum = " + min);
                    break;

                case 4:
                    int sum = 0;
                    for(int x : arr)
                        sum += x;
                    System.out.println("Sum = " + sum);
                    break;
                     }

        } while(choice != 5);

        sc.close();
    }
}
