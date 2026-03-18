import java.util.Scanner;

class ATM {

    private int pin;
    private double balance;
    private String transaction = "";

    Scanner sc = new Scanner(System.in);

    public void startATM() {

        System.out.println("----- ATM Account Setup -----");

        System.out.print("Create your PIN: ");
        pin = sc.nextInt();

        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();

        System.out.println("\nAccount created successfully!");

        System.out.println("\n----- Welcome to ATM -----");
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {

            while (true) {

                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Change PIN");
                System.out.println("5. Transaction History");
                System.out.println("6. Exit");

                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        checkBalance();
                        break;

                    case 2:
                        deposit();
                        break;

                    case 3:
                        withdraw();
                        break;

                    case 4:
                        changePin();
                        break;

                    case 5:
                        showTransaction();
                        break;

                    case 6:
                        System.out.println("Thank you for using ATM.");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice!");
                }
            }

        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void deposit() {

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        balance = balance + amount;

        transaction = transaction + "\nDeposited: " + amount;

        System.out.println("Amount Deposited Successfully.");
    }

    public void withdraw() {

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {

            balance = balance - amount;

            transaction = transaction + "\nWithdrawn: " + amount;

            System.out.println("Please collect your cash.");

        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void changePin() {

        System.out.print("Enter new PIN: ");
        int newPin = sc.nextInt();

        pin = newPin;

        System.out.println("PIN changed successfully.");
    }

    public void showTransaction() {

        if (transaction.equals("")) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            System.out.println(transaction);
        }
    }
}

public class ATMApplication {

    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.startATM();

    }
}