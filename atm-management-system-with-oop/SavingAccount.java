class SavingAccount extends Account{
    public SavingAccount(int accountNumber,String holderName, double balance){
        super(accountNumber, holderName, balance);
    }

    public void withdraw(double amount){
        if(balance <= amount)
            System.out.println("Insufficient balance.");
        else{
            balance -= amount;
            transactions.add("Withdraw : ₹" + amount);
            System.out.println("Withdraw successfully.");
        }
    }
}