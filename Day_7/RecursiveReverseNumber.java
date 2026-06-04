
public class RecursiveReverseNumber {
      static int reverse = 0;

    static void reverseNumber(int n) {
        if (n == 0)
            return;

        reverse = reverse * 10 + (n % 10);
        reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;

        reverseNumber(n);

        System.out.println("Reversed Number = " + reverse);
    }
}
