# Ticket Booking System

## Overview

The Ticket Booking System is a Java-based console application that simulates a real-world ticket reservation system where multiple users attempt to book seats simultaneously.

The project focuses on demonstrating Java Multithreading concepts, thread synchronization, shared resource management, and concurrency control.

---

## Features

- Multiple User Booking Simulation
- Concurrent Ticket Requests
- Thread-Safe Seat Allocation
- Booking Success/Failure Validation
- Seat Availability Tracking
- Synchronized Resource Access
- Race Condition Prevention
- Runnable Interface Implementation

---

## Technologies Used

- Java
- Multithreading
- Thread Class
- Runnable Interface
- Synchronization
- Object-Oriented Programming (OOP)

---

## Project Structure

```text
├── TicketCounter.java
├── BookingThread.java
├── TicketBookingSystem.java
└── README.md
```

### Class Description

#### TicketCounter

Manages ticket inventory and booking operations.

Responsibilities:

- Track available seats
- Process booking requests
- Synchronize access to shared resources
- Prevent overbooking

#### BookingThread

Implements the Runnable interface and represents an individual user booking request.

Responsibilities:

- Store booking details
- Execute booking operations

#### TicketBookingSystem

Main driver class that:

- Creates ticket counter
- Creates booking threads
- Starts concurrent booking operations

---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java TicketBookingSystem
```

---

## Sample Output

```text
User-1 trying to book 4 seats
Booking successful for User-1
Remaining Seats : 6

User-2 trying to book 5 seats
Booking successful for User-2
Remaining Seats : 1

User-3 trying to book 3 seats
Booking failed for User-3
Available Seats : 1
```

---

## Multithreading Concepts Demonstrated

### Thread Creation

- Creating multiple threads
- Independent execution

### Runnable Interface

- Encapsulating booking tasks
- Flexible thread implementation

### Synchronization

```java
public synchronized void bookTicket(int seats)
```

Ensures:

- Only one thread accesses booking logic at a time
- Prevents inconsistent seat allocation
- Eliminates race conditions

### Shared Resource Management

- Multiple threads share the same TicketCounter object
- Controlled access through synchronization

---

## Learning Outcomes

- Java Multithreading
- Thread Synchronization
- Runnable Interface
- Shared Resource Handling
- Race Condition Prevention
- Concurrency Control
- Thread Lifecycle Management
- Real-World Booking System Design

---

## Future Enhancements

- Dynamic User Input
- Multiple Events Management
- Booking Cancellation
- Waiting List System
- Database Integration
- File-Based Booking Records
- GUI using JavaFX or Swing
- Online Reservation Simulation

---

## Author

Developed as a Core Java project to practice Multithreading, Synchronization, Concurrency Management, and real-world booking system implementation.