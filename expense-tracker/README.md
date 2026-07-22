# 💰 Expense Tracker System

A console-based **Expense Tracker System** developed using **Core Java** to help users record, organize, analyze, and manage daily expenses. The application provides features like expense management, category-wise and monthly reports, budgeting, CSV export, file serialization, and statistical analysis through a simple menu-driven interface.

---

# 📖 Description

The Expense Tracker System is a Core Java application that enables users to efficiently manage their personal expenses through a command-line interface.

The project allows users to add, update, delete, search, and organize expenses while maintaining persistent data storage using Java Serialization. It also provides detailed reports, expense statistics, budget tracking, CSV export functionality, and date-based filtering for better financial management.

This project demonstrates practical implementation of Java Collections, File Handling, Serialization, Java Time API, Stream API, and Object-Oriented Programming concepts.

---

# ✨ Features

- ➕ Add New Expense
- 📋 Display All Expenses
- 🔍 Search Expense by Title
- 🗂 Search Expenses by Category
- ✏️ Update Existing Expense
- ❌ Delete Expense
- 📊 Category-wise Expense Report
- 📅 Monthly Expense Report
- 📈 Expense Statistics
- 💸 Highest Expense
- 💰 Lowest Expense
- 🔢 Sort Expenses by Amount
- 📆 Sort Expenses by Date
- 📄 Export Expenses to CSV
- 💼 Set Monthly Budget
- ⚠️ Budget Monitoring
- 📌 Search Expenses Between Two Dates
- 💾 Save Data using Serialization
- 📂 Load Saved Expenses Automatically

---

# 🛠 Tech Stack

### Language
- Java

### Core Java Concepts
- Object-Oriented Programming (OOP)
- Encapsulation
- Classes & Objects
- Method Overriding
- Collections Framework

### Java APIs
- Java Collections Framework
- Java Stream API
- Java Time API (`LocalDate`)
- Java Serialization
- Java File Handling
- Java I/O Streams
- Exception Handling

### Data Structures
- ArrayList
- List
- Iterator
- Map
- HashMap

### File Storage
- Binary File (`expenses.dat`)
- CSV Export (`expenses.csv`)

### Development Tools
- JDK 17+
- IntelliJ IDEA / Eclipse / VS Code

---

# 📂 Project Structure

```
Expense Tracker/
│
├── Expense.java
├── ExpenseManager.java
├── ExpenseTracker.java
├── expenses.dat
├── expenses.csv
└── README.md
```

---

# 📚 Project Modules

### Expense.java
Represents an expense with details such as:
- Expense ID
- Title
- Category
- Amount
- Date

---

### ExpenseManager.java

Handles all business logic including:

- Expense Management
- Search Operations
- Update/Delete
- Reports
- Statistics
- Budget Tracking
- CSV Export
- Serialization
- Date Filtering
- Sorting

---

### ExpenseTracker.java

Provides the menu-driven console interface for interacting with the Expense Manager.

---

# 📊 Reports Available

- Category Report
- Monthly Expense Report
- Expense Statistics
- Highest Expense
- Lowest Expense
- Budget Report
- Date Range Search

---

# 💾 Data Persistence

The application stores expense records using Java Serialization.

```
expenses.dat
```

Features include:

- Save all expenses
- Load previously saved expenses
- Maintain unique expense IDs

---

# 📄 CSV Export

Expenses can be exported into:

```
expenses.csv
```

The exported file contains:

- ID
- Title
- Category
- Amount
- Date

This file can be opened in Microsoft Excel, Google Sheets, or any spreadsheet application.

---

# 🎯 Concepts Demonstrated

- Object-Oriented Programming
- Java Collections Framework
- File Handling
- Serialization
- Stream API
- Lambda-ready Stream Operations
- LocalDate API
- Sorting & Searching
- Data Persistence
- Statistics using Streams
- Report Generation
- Console-Based Menu Design

---

# ▶️ How to Run

1. Clone the repository

```bash
git clone https://github.com/your-username/Expense-Tracker.git
```

2. Open the project in your preferred Java IDE.

3. Compile the Java files.

```bash
javac *.java
```

4. Run the application.

```bash
java ExpenseTracker
```

---

# 🚀 Future Enhancements

- User Login System
- Multiple User Support
- Expense Charts & Graphs
- Database Integration (MySQL)
- JDBC Support
- JavaFX/Swing GUI
- PDF Report Generation
- Monthly Notifications
- Budget Alerts
- Spring Boot REST API

---

# 👨‍💻 Author

**Prajyot Pimpale**

Java Developer passionate about building real-world applications using Core Java while exploring backend development, multithreading, networking, and software engineering concepts.

---

⭐ If you found this project useful, consider giving it a star!