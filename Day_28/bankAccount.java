import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    balance += sc.nextDouble();
                    break;
                    case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double amount = sc.nextDouble();

                    if(amount <= balance)
                        balance -= amount;
                    else
                        System.out.println("Insufficient Balance");

                    break;

                case 3:
                    System.out.println("Account Holder : " + name);
                    System.out.println("Balance : ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);

        sc.close();
    }
}
