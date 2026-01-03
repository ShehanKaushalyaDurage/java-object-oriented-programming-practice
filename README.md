
# Object-Oriented Programming (OOP) – Java Practical Guide

![Java](https://img.shields.io/badge/Java-17+-red?logo=java)
![OOP](https://img.shields.io/badge/OOP-Core%20Concepts-blue)
![Status](https://img.shields.io/badge/Status-Active-success)
![License](https://img.shields.io/badge/License-MIT-green)
![Level](https://img.shields.io/badge/Level-Associate%20→%20Senior-purple)

A **hands-on Java repository** demonstrating the **four core Object-Oriented Programming (OOP) concepts** using **real-world examples** and **interview-focused explanations**.

---

## 📌 Table of Contents

* [What is Object-Oriented Programming (OOP)?](#what-is-object-oriented-programming-oop)
* [The Four Core OOP Concepts](#the-four-core-oop-concepts)

  * [Encapsulation](#1-encapsulation--data-protection--control)
  * [Abstraction](#2-abstraction--focus-on-what-not-how)
  * [Inheritance](#3-inheritance--code-reuse-with-an-is-a-relationship)
  * [Polymorphism](#4-polymorphism--one-interface-many-behaviors)
* [Additional Concepts Demonstrated](#additional-concepts-demonstrated)
* [Why This Repository?](#why-this-repository)
* [Recommended Learning Order](#recommended-learning-order)
* [Final Summary](#final-interview-summary)
* [Author](#author)

---

## What is Object-Oriented Programming (OOP)?

**Object-Oriented Programming (OOP)** is a programming paradigm that models software using **objects** that represent real-world entities.

Each object:

* Contains **data** (fields / variables)
* Contains **behavior** (methods)
* Manages its own **state and rules**

### Why OOP?

OOP helps build software that is:

* Modular
* Reusable
* Maintainable
* Easy to extend
* Easy to test

Java is a **pure object-oriented language**, and OOP is fundamental for building clean, scalable, and maintainable applications.

---

## The Four Core OOP Concepts

---

## 1. Encapsulation – Data Protection & Control

**Encapsulation** means:

> Hiding internal data and allowing access only through controlled methods.

### Key Ideas

* Objects control how their data is accessed and modified
* Internal state is protected from invalid changes
* Business rules live inside the object

### What This Achieves

* Data cannot be modified directly
* Validation logic is centralized
* Objects always remain in a valid state

### 💡 Tip

Encapsulation is not just hiding fields — it is about **enforcing business rules inside the object**.

---

## 2. Abstraction – Focus on *What*, Not *How*

**Abstraction** means:

> Exposing only essential behavior while hiding implementation details.

### Key Ideas

* Program to **interfaces**, not implementations
* Client code depends on behavior, not concrete classes

### Example

```java
public interface PaymentService {
    void pay(double amount);
}

PaymentService service = new PaypalPayment();
service.pay(1000);
```

### What This Achieves

* Easy to add new implementations
* Loose coupling
* High flexibility and testability

### 💡 Tip

Abstraction allows implementations to change **without modifying client code**.

---

## 3. Inheritance – Code Reuse with an *IS-A* Relationship

**Inheritance** means:

> A child class automatically inherits properties and behavior from a parent class.

### Key Ideas

* Represents an **IS-A** relationship
* Enables code reuse
* Uses the `extends` keyword

### Example

```java
public class BoxWeight extends Box {
    double weight;
}

public class BoxPrice extends BoxWeight {
    double cost;
}
```

### Important Rules Demonstrated

* Parent constructors are called using `super()`
* Child classes can access parent methods
* Reference type determines accessible members

### 💡 Tip

Inheritance should be used carefully — **composition is often preferred** for flexibility.

---

## 4. Polymorphism – One Interface, Many Behaviors

**Polymorphism** means:

> The same method call behaves differently based on the object type.

### Key Ideas

* Achieved through **method overriding**
* Happens at **runtime** (dynamic binding)

### Example

```java
Shapes shape = new Circle();
shape.area(); // Calls Circle's implementation
```

### How It Works

* **Compile time**: checks reference type
* **Runtime**: calls the overridden method of the actual object

### Special Case: `final` Methods

```java
final void area() { }
```

* Cannot be overridden
* Uses compile-time binding (early binding)

### 💡 Tip

Polymorphism allows systems to be **extended without modifying existing code**.

---

## Additional Concepts Demonstrated

### Static Methods

* Belong to the class, not the object
* Cannot be overridden (method hiding only)

```java
BoxWeight.greeting();
```

### Constructor Chaining

* `super()` ensures parent state is initialized first

### Dependency Inversion (SOLID)

* High-level modules depend on abstractions
* Improves flexibility and testability

---

## Why This Repository?

This repository is designed to:

* Teach OOP from fundamentals to interview level
* Show how OOP concepts work together
* Demonstrate **real Java behavior**, not just theory
* Help prepare for Java interviews (Associate → Senior)

---

## Recommended Learning Order

1. Encapsulation
2. Abstraction
3. Inheritance
4. Polymorphism

### Why This Order?

* Encapsulation protects state
* Abstraction defines behavior
* Inheritance reuses structure
* Polymorphism enables flexibility

---

## Final Summary

Object-Oriented Programming is about modeling real-world behavior using objects that:

* Protect their internal state
* Expose meaningful behavior
* Reuse code safely
* Enable flexible runtime behavior

---

## Author
[Shehan Kaushalya](https://www.linkedin.com/in/shehan-kaushalya-998655265/)

Software Engineer | Java & Spring Boot Developer | Backend Development & DevOps
