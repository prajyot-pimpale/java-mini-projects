public class ATMSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;
        
        do{
            System.out.println("\n===== ATM / BANKING SYSTEM =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Display Accounts");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Transfer Money");
            System.out.println("7. Transaction History");
            System.out.println("8. Bank Report");
            System.out.println("0. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Holder Name : ");
                    String name =sc.nextLine();

                    System.out.print("Initial Balance : ");
                    double balance =sc.nextDouble();

                    bank.createSavingsAccount(name,balance);
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.print("Holder Name : ");
                    String name =sc.nextLine();

                    System.out.print("Initial Balance : ");
                    double balance = sc.nextDouble();

                    bank.createCurrentAccount(name,balance);
                }
                case 3 -> bank.displayAccounts();
                case 4 -> {
                    System.out.print("Account Number : ");
                    int accNo = sc.nextInt();

                    System.out.print("Amount : ");
                    double amount = sc.nextDouble();

                    bank.deposit(accNo, amount);
                }
                case 5 -> {
                    System.out.print("Account Number : ");
                    int accNo = sc.nextInt();

                    System.out.print("Amount : ");
                    double amount =sc.nextDouble();

                    bank.withdraw(accNo,amount);
                }
                case 6 -> {
                    System.out.print("From Account : ");
                    int from =sc.nextInt();

                    System.out.print("To Account : ");
                    int to = sc.nextInt();

                    System.out.print("Amount : ");
                    double amount =sc.nextDouble();

                    bank.transfer(from, to, amount);
                }
                case 7 -> {
                    System.out.print("Account Number : ");
                    int accNo =sc.nextInt();
                
                    bank.transactionHistory(accNo);
                }
                case 8 -> bank.bankReport();
                case 0 -> System.out.println("Thank You!");
                default -> System.out.println("Invalid Choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}