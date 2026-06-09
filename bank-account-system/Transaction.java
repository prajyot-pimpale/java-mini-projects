import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Transaction {
    String type;
    double amount;
    double balance;
    String date;

    Transaction(String type, double amount, double balance) {
        this.type    = type;
        this.amount  = amount;
        this.balance = balance;
        this.date    = LocalDateTime.now()
                       .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }

    public String toString() {
        return String.format("%-12s %-10s %-12.2f %-12.2f",
                             date, type, amount, balance);
    }
}