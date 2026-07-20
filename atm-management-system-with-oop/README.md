# ATM / Banking Management System

A menu-driven Banking Management System developed in Java using Object-Oriented Programming (OOP) concepts. This project simulates basic banking operations such as account creation, deposits, withdrawals, fund transfers, transaction tracking, and bank reporting.

## Features

### Account Management

* Create Savings Account
* Create Current Account
* View All Accounts

### Banking Operations

* Deposit Money
* Withdraw Money
* Transfer Funds Between Accounts
* Check Account Balance

### Transaction Management

* Maintain Transaction History
* View Mini Statement

### Reports

* Total Number of Accounts
* Total Bank Balance
* Highest Balance Account

## Technologies Used

* Java
* OOP Principles
* Collections Framework (ArrayList)
* Stream API
* Exception Handling
* Menu-Driven Console Application

## Project Structure

```text
ATMSystem
│
├── Account (Abstract Class)
├── SavingsAccount
├── CurrentAccount
├── Bank
└── ATMSystem (Main Class)
```

## OOP Concepts Implemented

### Abstraction

Implemented using the abstract `Account` class.

### Inheritance

* SavingsAccount extends Account
* CurrentAccount extends Account

### Polymorphism

The `withdraw()` method is overridden in different account types.

### Encapsulation

Account details are protected and accessed through methods.

## Menu Options

```text
===== ATM / BANKING SYSTEM =====

1. Create Savings Account
2. Create Current Account
3. Display Accounts
4. Deposit
5. Withdraw
6. Transfer Money
7. Transaction History
8. Bank Report
0. Exit
```

## Sample Output

```text
===== ATM / BANKING SYSTEM =====

1. Create Savings Account
2. Create Current Account
3. Display Accounts
4. Deposit
5. Withdraw
6. Transfer Money
7. Transaction History
8. Bank Report
0. Exit

Enter Choice : 1

Holder Name : Prajyot
Initial Balance : 10000

Savings Account Created.
```

## Key Learnings

* Abstract Classes
* Inheritance
* Polymorphism
* Method Overriding
* Collections Framework
* Business Logic Implementation
* Stream API Usage
* Transaction Tracking

## Future Enhancements

* Serialization Support
* PIN Authentication
* Account Lock Mechanism
* Interest Calculation
* JDBC Integration
* MySQL Database Support
* Spring Boot REST API

## Resume Description

Developed an ATM/Banking Management System using Core Java and Object-Oriented Programming principles. Implemented account creation, deposits, withdrawals, fund transfers, transaction history tracking, and banking reports using abstraction, inheritance, polymorphism, collections, and Stream API.

## Author

Prajyot Pimpale
