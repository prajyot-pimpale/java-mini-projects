# Banking System Management Application

## Overview

The Banking System Management Application is a Java-based console application that simulates essential banking operations. It enables users to manage bank accounts, perform transactions, and view account statements through a simple menu-driven interface.

The project is designed to demonstrate Object-Oriented Programming (OOP) principles and Java Collections Framework concepts while providing a practical example of a banking system.

---

## Features

* Check account balance
* Deposit funds
* Withdraw funds with PIN verification
* Transfer money between accounts
* View detailed account statements
* Maintain transaction history
* Secure transactions using PIN authentication
* User-friendly console menu

---

## Project Structure

```text
├── BankSystem.java
├── BankAccount.java
├── Transaction.java
└── README.md
```

### Classes

#### BankAccount

Handles all account-related operations:

* Deposit
* Withdraw
* Transfer
* Balance Management
* Statement Generation

#### Transaction

Stores transaction details:

* Transaction Type
* Transaction Amount
* Remaining Balance
* Transaction Date

#### BankSystem

Main class responsible for:

* User interaction
* Menu-driven interface
* Account management

---

## Technologies Used

* Java
* Java Collections Framework (ArrayList)
* Scanner Class
* Object-Oriented Programming (OOP)

---

## OOP Concepts Implemented

### Encapsulation

Account details such as balance and PIN are kept private and accessed through methods.

### Abstraction

Complex banking operations are simplified through dedicated methods.

### Objects and Classes

Each bank account is represented as an object of the `BankAccount` class.

### Data Management

Transaction history is maintained using an `ArrayList`.

---

## How to Run

### Prerequisites

* Java JDK 8 or higher
* Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

### Compile

```bash
javac *.java
```

### Run

```bash
java BankSystem
```

---

## Sample Menu

```text
=== Banking System ===
1. Check Balance
2. Deposit
3. Withdraw
4. Transfer
5. Statement
0. Exit
```

---

## Sample Operations

### Deposit

```text
Amount: 2000
Deposited ₹2000.00 | Balance: ₹12000.00
```

### Withdraw

```text
Amount: 1000
PIN: 1234
Withdrawn ₹1000.00 | Balance: ₹11000.00
```

### Transfer

```text
Amount: 500
PIN: 1234
Transferred ₹500.00 to Bob
```

---

## Future Enhancements

* Multiple user accounts
* Database integration (MySQL)
* Login system
* Interest calculation
* ATM simulation
* GUI using Java Swing or JavaFX
* Transaction search and filtering
* Exception handling and logging

---

## Learning Outcomes

This project helps in understanding:

* Java Programming Fundamentals
* Object-Oriented Programming
* Collections Framework
* Console-Based Application Development
* Banking Transaction Logic
* Secure PIN Authentication

---

## Author

Developed as a Java OOP and Banking Management System project for learning and academic purposes.
