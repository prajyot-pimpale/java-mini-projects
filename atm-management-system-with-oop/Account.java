abstract class Account{
    protected int accountNumber;
    protected Strig holderName;
    protected double balance;
    protected List<String> transactions = new ArrayList<>();

    public Acccount(int accountNumber , Strig holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount){
        balance += amount;
        transactions.add("Deposit : ₹" + amount);
        System.out.println("Amount deposited successfully.");
    }

    public abstract void withdraw(double amount);

    public void showTransactions(){
        if(transactions.isEmpty()){
            System.out.println("No transactions found.");
            return;
        }
        System.out.println("\n===== Transaction History =====");
        transactions.forEach(System.out::println);
    }

    public String toString() {
        return String.format("%-6d %-15s ₹%.2f", accountNumber, holderName, balance);
    }
}