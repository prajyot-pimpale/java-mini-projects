class Bank {

    private List<Account> accounts = new ArrayList<>();

    private int nextAccountNo = 1001;

    public void createSavingsAccount(String name, double balance) {
        accounts.add(new SavingsAccount(nextAccountNo++, name, balance));
        System.out.println("Savings Account Created.");
    }

    public void createCurrentAccount(String name,double balance){
        accounts.add(new CurrentAccount(nextAccountNo++, name, balance));
        System.out.println("Current Account Created.");
    }

    public Account findAccount(int accountNumber){
        for(Account acc : accounts) {
            if (acc.getAccountNumber()== accountNumber)
                return acc;
        }
        return null;
    }

    public void displayAccounts() {
        if(accounts.isEmpty()){
            System.out.println("No accounts found.");
            return;
        }
        System.out.println("\n===== Accounts =====");
        accounts.forEach(System.out::println);
    }

    public void deposit(int accountNumber,double amount){
        Account acc =findAccount(accountNumber);
        if(acc != null)
            acc.deposit(amount);
        else
            System.out.println("Account not found.");
    }

    public void withdraw(int accountNumber,double amount){
        Account acc = findAccount(accountNumber);
        if(acc != null) 
            acc.withdraw(amount);
        else
            System.out.println("Account not found.");
    }

    public void transfer(int fromAccount, int toAccount, double amount){
        Account sender = findAccount(fromAccount);
        Account receiver = findAccount(toAccount);
        
        if(sender == null || receiver == null) {
            System.out.println("Invalid account.");
            return;
        }

        double before = sender.getBalance();
        sender.withdraw(amount);

        if(sender.getBalance() < before){
            receiver.deposit(amount);
            sender.transactions.add("Transfer To " + toAccount + " : ₹" + amount);
            receiver.transactions.add("Received From " + fromAccount + " : ₹" + amount);
            System.out.println("Transfer successful.");
        }
    }

    public void transactionHistory(int accountNumber){
        Account acc = findAccount(accountNumber);
        if (acc != null)
            acc.showTransactions();
        else
            System.out.println("Account not found.");
    }

    public void bankReport(){
        System.out.println("\n===== Bank Report =====");
        System.out.println("Total Accounts : " + accounts.size());

        double totalBalance =accounts.stream()
                                    .mapToDouble(Account::getBalance)
                                    .sum();

        System.out.println("Total Bank Balance : ₹" + totalBalance);

        accounts.stream()
                .max(Comparator.comparingDouble(Account::getBalance))
                .ifPresent(acc -> System.out.println("Highest Balance Account : "+ acc.getHolderName()+ " (₹"+ acc.getBalance()+ ")"));
    }
}