# Employee Management System

## Overview

The Employee Management System is a Java-based console application designed to manage employee records efficiently. It provides functionality for adding, updating, searching, deleting, and displaying employee information while offering advanced reporting features such as salary statistics, department reports, and top earners analysis.

The project demonstrates practical implementation of Object-Oriented Programming (OOP), Java Collections Framework, Streams API, Serialization, and File Handling.

---

## Features

* Add Employee Records
* Display Employee Details
* Search Employees by Name
* Update Employee Salary
* Delete Employee Records
* Generate Salary Statistics
* Department-wise Employee Reports
* Display Top N Earners
* Persistent Data Storage using Serialization
* User-Friendly Console Interface

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework
* Java Streams API
* Serialization
* File Handling
* Scanner Class

---

## Project Structure

```text
├── Employee.java
├── EmployeeManager.java
├── EmployeeSystem.java
├── employees.dat
└── README.md
```

### Class Description

#### Employee

Stores employee information:

* Employee ID
* Name
* Department
* Salary

#### EmployeeManager

Handles business logic:

* CRUD Operations
* Employee Search
* Salary Updates
* Salary Statistics
* Department Reports
* Top Earners Analysis
* Data Persistence

#### EmployeeSystem

Provides the menu-driven user interface and manages user interactions.

---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java EmployeeSystem
```

---

## Sample Menu

```text
===== EMPLOYEE MANAGEMENT SYSTEM =====

1. Add Employee
2. Display Employees
3. Search Employee
4. Update Salary
5. Delete Employee
6. Salary Statistics
7. Department Report
8. Top Earners
0. Exit
```

---

## Reporting Features

### Salary Statistics

* Highest Salary
* Lowest Salary
* Average Salary
* Total Salary Expense
* Total Employee Count

### Department Report

Displays employee count grouped by department.

### Top Earners

Shows the highest-paid employees based on user-defined limits.

---

## Learning Outcomes

* Object-Oriented Programming
* Java Streams API
* Collections Framework
* Serialization and Object Persistence
* File Handling
* Functional Programming Concepts
* Data Processing and Analytics
* CRUD Operations

---

## Future Enhancements

* Database Integration (MySQL/PostgreSQL)
* Employee Attendance Tracking
* Role-Based Authentication
* Salary Increment Management
* CSV/Excel Export
* REST API Integration
* GUI using JavaFX or Swing

---

## Author

Developed as a Core Java project to practice OOP concepts, Streams API, Serialization, Collections Framework, and employee data management.
