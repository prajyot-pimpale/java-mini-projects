# Contact Management System

## Overview

The Contact Management System is a Java-based console application designed to manage contact information efficiently. Users can add, search, update, delete, and sort contacts while maintaining persistent storage through file handling.

This project demonstrates the practical implementation of Object-Oriented Programming (OOP), Java Collections Framework, CRUD operations, and file management.

---

## Features

* Add new contacts
* Display all contacts
* Search contacts by name
* Update contact details
* Delete contacts
* Sort contacts alphabetically
* View total number of contacts
* Save contacts to file
* Load contacts automatically from file

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework
* File Handling
* Scanner Class
* BufferedReader & BufferedWriter

---

## Project Structure

```text
├── Contact.java
├── ContactManager.java
├── ContactSystem.java
├── contacts.txt
└── README.md
```

### Class Description

#### Contact

Stores contact information:

* ID
* Name
* Phone Number
* Email Address

#### ContactManager

Handles all business logic:

* Add Contact
* Search Contact
* Update Contact
* Delete Contact
* Sort Contacts
* Save & Load Contacts

#### ContactSystem

Provides the menu-driven user interface and handles user interaction.

---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java ContactSystem
```

---

## Sample Menu

```text
===== CONTACT MANAGEMENT SYSTEM =====
1. Add Contact
2. Display Contacts
3. Search Contact
4. Update Contact
5. Delete Contact
6. Sort Contacts
7. Total Contacts
0. Exit
```

---

## Learning Outcomes

* Java Programming Fundamentals
* Object-Oriented Programming
* Collections Framework
* CRUD Operations
* File Handling and Data Persistence
* Searching and Sorting Techniques
* Console-Based Application Development

---

## Future Enhancements

* Database Integration (MySQL)
* Contact Groups and Categories
* Duplicate Contact Detection
* Export to CSV/Excel
* Advanced Search Filters
* GUI using Java Swing or JavaFX
* Contact Import/Export Functionality

---

## Author

Developed as a Core Java project to practice OOP concepts, file handling, collections framework, and CRUD operations.
