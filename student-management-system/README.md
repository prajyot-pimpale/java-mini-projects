# Student Management System

## Overview

The Student Management System is a Java-based console application designed to manage student academic records and evaluate performance efficiently. The system automates percentage calculation, grade assignment, ranking generation, topper identification, and class-wide statistical reporting.

This project demonstrates practical implementation of Object-Oriented Programming (OOP), Java Collections Framework, Streams API, Comparator sorting, and data analytics.

---

## Features

- Add Student Records
- Automatic Percentage Calculation
- Automatic Grade Assignment
- Search Student by Name
- Display All Results
- Rank Students by Performance
- Identify Class Topper
- Generate Class Statistics
- Academic Performance Analytics
- Interactive Console Interface

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- Java Streams API
- Comparator API
- DoubleSummaryStatistics
- Scanner Class

---

## Project Structure

```text
├── Student.java
├── StudentManager.java
├── StudentResultSystem.java
└── README.md
```

### Class Description

#### Student

Stores student information:

- Student ID
- Student Name
- Subject Marks
- Percentage Calculation
- Grade Calculation

#### StudentManager

Handles:

- Student Registration
- Search Operations
- Result Processing
- Ranking Generation
- Topper Identification
- Statistical Analysis

#### StudentResultSystem

Provides the menu-driven interface and handles user interaction.

---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java StudentResultSystem
```

---

## Sample Menu

```text
===== STUDENT SYSTEM =====

1. Add Student
2. Display Students
3. Search Student
4. Rank Students
5. Topper
6. Class Statistics
0. Exit
```

---

## Grading System

| Percentage | Grade |
|------------|--------|
| 90+ | A+ |
| 80 - 89 | A |
| 70 - 79 | B |
| 60 - 69 | C |
| 50 - 59 | D |
| Below 50 | F |

---

## Reporting Features

### Student Ranking

Students are ranked based on percentage in descending order.

### Topper Identification

Displays the highest-performing student in the class.

### Class Statistics

Generates:

- Total Students
- Highest Percentage
- Lowest Percentage
- Average Percentage

---

## Learning Outcomes

- Object-Oriented Programming
- Collections Framework
- Java Streams API
- Comparator Sorting
- Statistical Analysis
- Academic Performance Management
- Search and Ranking Algorithms
- Console Application Development

---

## Future Enhancements

- Database Integration (MySQL/PostgreSQL)
- Subject-wise Analysis
- Report Card Generation
- Attendance Management
- File-Based Persistence
- Export Results to PDF/Excel
- GUI using JavaFX or Swing
- Authentication System

---

## Author

Developed as a Core Java project to practice OOP concepts, Collections Framework, Java Streams API, Comparator sorting, and academic result management.