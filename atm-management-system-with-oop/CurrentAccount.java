class CurrentAccount extends Account{
    private final double overdraftLimit = 5000;

    public CurrentAccount(int accountNumber,String holderName, double balance){
        super(accountNumber, holderName, balance);
    }

    public void withdraw(double amount){
        if(balance + overdraftLimit  <= amount)
            System.out.println("Insufficient balance.");
        else{
            balance -= amount;
            transactions.add("Withdraw : ₹" + amount);
            System.out.println("Withdraw successfully.");
        }
    }
}