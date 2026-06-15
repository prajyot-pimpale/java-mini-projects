# Library Management System

## Overview

The Library Management System is a Java-based console application designed to manage library operations efficiently. It allows users to maintain a collection of books, search books by title or author, issue and return books, track availability, and generate useful library statistics.

This project demonstrates practical implementation of Object-Oriented Programming (OOP), Java Collections Framework, Streams API, and inventory management concepts.

---

## Features

* Add New Books
* View All Books
* Search Books by Title
* Search Books by Author
* Issue Books to Members
* Return Issued Books
* Track Book Availability
* Library Statistics Dashboard
* Genre-wise Book Reports
* User-Friendly Console Interface

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework
* Java Streams API
* HashMap
* ArrayList
* Scanner Class

---

## Project Structure

```text
├── Book.java
├── Library.java
├── LibrarySystem.java
└── README.md
```

### Class Description

#### Book

Represents a book entity containing:

* Book ID
* Title
* Author
* Genre
* Availability Status

#### Library

Handles library operations:

* Book Management
* Search Operations
* Issue/Return Management
* Availability Tracking
* Statistics Generation

#### LibrarySystem

Provides the menu-driven user interface and handles user interactions.

---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java LibrarySystem
```

---

## Sample Menu

```text
=== Library System ===
1. All Books
2. Available Books
3. Search by Title
4. Search by Author
5. Issue Book
6. Return Book
7. Statistics
0. Exit
```

---

## Statistics Features

### Library Summary

* Total Books
* Available Books
* Issued Books

### Genre Report

Displays the number of books available in each genre using Java Streams API and Collectors.

---

## Learning Outcomes

* Object-Oriented Programming
* Collections Framework
* Java Streams API
* Functional Programming Concepts
* Searching and Filtering Techniques
* Inventory Management Systems
* Data Aggregation and Reporting
* Console Application Development

---

## Future Enhancements

* Database Integration (MySQL/PostgreSQL)
* Member Management System
* Due Date Tracking
* Fine Calculation
* Book Reservation System
* File-Based Persistence
* GUI using JavaFX or Swing
* Barcode Integration

---

## Author

Developed as a Core Java project to practice OOP concepts, Collections Framework, Java Streams API, and Library Inventory Management.
