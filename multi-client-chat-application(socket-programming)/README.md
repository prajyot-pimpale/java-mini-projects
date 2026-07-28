# Chat Application (Client-Server)

## Overview

The Chat Application is a Java-based console application that enables real-time communication between multiple users using a client-server architecture. The server accepts multiple client connections simultaneously and broadcasts messages to all connected clients.

This project demonstrates Java Networking, Socket Programming, Multithreading, and concurrent communication using TCP/IP.

---

## Features

- Client-Server Architecture
- Multi-Client Support
- Real-Time Messaging
- Broadcast Communication
- Concurrent Client Handling
- Automatic Client Connection Management
- Socket-Based Communication
- Interactive Console Interface

---

## Technologies Used

- Java
- Socket Programming
- TCP/IP Networking
- Multithreading
- Thread Class
- BufferedReader
- PrintWriter
- Java I/O Streams

---

## Project Structure

```text
├── ChatServer.java
├── ClientHandler.java
├── ChatClient.java
└── README.md
```

### Class Description

#### ChatServer

Responsible for:

- Starting the server
- Accepting client connections
- Maintaining connected clients
- Broadcasting messages
- Removing disconnected clients

#### ClientHandler

Handles communication with an individual client.

Responsibilities:

- Receive messages
- Send messages
- Manage client lifecycle
- Handle client disconnections

#### ChatClient

Provides the client-side application.

Responsibilities:

- Connect to server
- Send messages
- Receive messages concurrently
- Display incoming messages

---

## How to Run

### Step 1: Compile

```bash
javac *.java
```

### Step 2: Start the Server

```bash
java ChatServer
```

### Step 3: Start Client(s)

Open one or more terminals and run:

```bash
java ChatClient
```

---

## Working Flow

1. Start the server.
2. Clients connect to the server.
3. Each client can send messages.
4. The server receives the message.
5. The server broadcasts it to all other connected clients.
6. Clients receive and display incoming messages in real time.

---

## Networking Concepts Demonstrated

### Socket Programming

- ServerSocket
- Socket
- TCP Connection
- Client-Server Communication

### Multithreading

Each connected client is handled in a separate thread, allowing multiple users to communicate simultaneously.

### Broadcast Messaging

Messages received from one client are forwarded to all other connected clients.

### Concurrent Client Management

The server maintains a list of active clients and removes clients automatically when they disconnect.

---

## Learning Outcomes

- Java Networking
- Socket Programming
- TCP/IP Communication
- Client-Server Architecture
- Multithreading
- Concurrent Programming
- Broadcast Communication
- Java I/O Streams
- Console Application Development

---

## Future Enhancements

- User Authentication
- Unique Usernames
- Private Messaging
- Chat Rooms
- File Sharing
- Message Encryption
- Database Integration
- GUI using JavaFX or Swing
- Online Deployment

---

## Author

Developed as a Core Java project to practice Socket Programming, Networking, Multithreading, and client-server communication concepts.