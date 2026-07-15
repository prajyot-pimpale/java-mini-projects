# Java Quiz Application

## Overview

The Java Quiz Application is a console-based program designed to test users' knowledge through multiple-choice questions. The application presents questions in random order, evaluates responses, calculates scores, assigns grades, and provides a review of incorrect answers.

This project demonstrates Object-Oriented Programming (OOP), Java Collections Framework, user interaction, and assessment system development.

---

## Features

* Multiple-Choice Questions
* Randomized Question Order
* Instant Answer Validation
* Automatic Score Calculation
* Percentage-Based Evaluation
* Grade Assignment
* Pass/Fail Status
* Wrong Answer Review
* Interactive Console Interface

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework
* Arrays
* Scanner Class
* Collections Utility Class

---

## Project Structure

```text
├── Question.java
├── QuizApp.java
└── README.md
```

### Class Description

#### Question

Represents an individual quiz question containing:

* Question Text
* Multiple Choice Options
* Correct Answer
* Answer Validation Logic

#### QuizApp

Handles:

* Quiz Execution
* User Interaction
* Question Randomization
* Score Calculation
* Grade Evaluation
* Result Generation

---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java QuizApp
```

---

## Sample Quiz Flow

```text
Enter your name: John

Q1. Which keyword is used to inherit a class in Java?
1. implements
2. extends
3. inherits
4. super

Your answer: 2
✅ Correct!
```

---

## Result Evaluation

The application generates:

* Total Score
* Percentage
* Grade
* Pass/Fail Status
* Review of Incorrect Answers

### Grading System

| Percentage    | Grade |
| ------------- | ----- |
| 80% and Above | A     |
| 60% - 79%     | B     |
| 40% - 59%     | C     |
| Below 40%     | F     |

---

## Learning Outcomes

* Object-Oriented Programming
* Collections Framework
* Randomization Techniques
* User Input Handling
* Assessment System Development
* Data Processing
* Conditional Logic
* Console Application Development

---

## Future Enhancements

* Question Categories
* Difficulty Levels
* Timer-Based Quiz
* High Score Tracking
* Database Integration
* Question Import from Files
* GUI using JavaFX or Swing
* Multiplayer Quiz Mode

---

## Author

Developed as a Core Java project to practice OOP concepts, Collections Framework, user interaction, and quiz management system development.
