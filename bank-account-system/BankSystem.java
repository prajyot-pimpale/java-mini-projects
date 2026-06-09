import java.util.*;

public class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount alice = new BankAccount("Alice", "SBI001", 10000, "1234");
        BankAccount bob   = new BankAccount("Bob",   "SBI002",  5000, "5678");

        int choice;
        do {
            System.out.println("\n=== Banking System ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Statement");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 : 
                    System.out.printf("Alice: ₹%.2f%n", alice.getBalance());
                    System.out.printf("Bob  : ₹%.2f%n", bob.getBalance());
                    break;
                case 2 :
                    System.out.print("Amount: "); alice.deposit(sc.nextDouble());
                    break;
                case 3 :
                    System.out.print("Amount: "); double amt = sc.nextDouble();
                    System.out.print("PIN: ");    alice.withdraw(amt, sc.next());
                    break;
                case 4 :
                    System.out.print("Amount: "); double amt1 = sc.nextDouble();
                    System.out.print("PIN: ");
                    alice.transfer(bob, amt1, sc.next());
                    break;
                case 5 : 
                    alice.showStatement();
                    break;
                case 0 : 
                    System.out.println("Thank you!");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}