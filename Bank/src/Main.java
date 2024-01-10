import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                // Create an instance of the BankAccount class
                BankAccount bankAccount = new BankAccount("123456789", "John Doe", 1000.0);

                // Display initial account details
                bankAccount.displayAccountDetails();

                // Menu-based system
                Scanner scanner = new Scanner(System.in);
                int choice;

                do {
                    System.out.println("\nMenu:");
                    System.out.println("1. Deposit Funds");
                    System.out.println("2. Withdraw Funds");
                    System.out.println("3. View Account Details");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");

                    // Validate user input
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();
                    }
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter the amount to deposit: $");
                            double depositAmount = scanner.nextDouble();
                            bankAccount.depositFunds(depositAmount);
                            break;
                        case 2:
                            System.out.print("Enter the amount to withdraw: $");
                            double withdrawAmount = scanner.nextDouble();
                            bankAccount.withdrawFunds(withdrawAmount);
                            break;
                        case 3:
                            bankAccount.displayAccountDetails();
                            break;
                        case 4:
                            System.out.println("Exiting Bank Account Management System. Thank you!");
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                    }

                } while (choice != 4);

                // Close the scanner
                scanner.close();
    }
}