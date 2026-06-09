import java.util.*;

class BankAccount {
    private String owner;
    private String accNo;
    private double balance;
    private String pin;
    private List<Transaction> history = new ArrayList<>();

    BankAccount(String owner, String accNo, double balance, String pin) {
        this.owner   = owner;
        this.accNo   = accNo;
        this.balance = balance;
        this.pin     = pin;
        history.add(new Transaction("OPEN", balance, balance));
    }

    boolean verifyPin(String inputPin) { return pin.equals(inputPin); }

    void deposit(double amount) {
        if (amount <= 0) { System.out.println("Invalid amount"); return; }
        balance += amount;
        history.add(new Transaction("DEPOSIT", amount, balance));
        System.out.printf("Deposited ₹%.2f | Balance: ₹%.2f%n", amount, balance);
    }

    void withdraw(double amount, String pin) {
        if (!verifyPin(pin)) { System.out.println("Wrong PIN"); return; }
        if (amount <= 0)     { System.out.println("Invalid amount"); return; }
        if (amount > balance){ System.out.println("Insufficient balance"); return; }
        balance -= amount;
        history.add(new Transaction("WITHDRAW", amount, balance));
        System.out.printf("Withdrawn ₹%.2f | Balance: ₹%.2f%n", amount, balance);
    }

    void transfer(BankAccount target, double amount, String pin) {
        if (!verifyPin(pin)) { System.out.println("Wrong PIN"); return; }
        if (amount > balance){ System.out.println("Insufficient balance"); return; }
        balance -= amount;
        target.balance += amount;
        history.add(new Transaction("TRANSFER", amount, balance));
        target.history.add(new Transaction("RECEIVED", amount, target.balance));
        System.out.printf("Transferred ₹%.2f to %s%n", amount, target.owner);
    }

    void showStatement() {
        System.out.println("\n===== Account Statement =====");
        System.out.println("Name  : " + owner);
        System.out.println("Acc No: " + accNo);
        System.out.printf("Balance: ₹%.2f%n", balance);
        System.out.println("-".repeat(55));
        System.out.printf("%-12s %-10s %-12s %-12s%n",
                          "Date", "Type", "Amount", "Balance");
        System.out.println("-".repeat(55));
        history.forEach(System.out::println);
        System.out.println("=".repeat(55));
    }

    double getBalance() { return balance; }
    String getOwner()   { return owner; }
}