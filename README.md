# Object-Oriented Programming (OOP) – Java Practical Guide

This repository contains **practical Java examples** demonstrating the **four core Object-Oriented Programming (OOP) concepts**:

1. Encapsulation  
2. Abstraction  
3. Inheritance  
4. Polymorphism  

Each concept is explained using **real code**, **clear comments**, and **interview-focused explanations**.

---

## What is Object-Oriented Programming (OOP)?

**Object-Oriented Programming (OOP)** is a programming paradigm that models software using **objects** that represent real-world entities.

Each object:
- Contains **data** (fields / variables)
- Contains **behavior** (methods)
- Manages its own **state and rules**

### Why OOP?
OOP helps to build software that is:
- Modular
- Reusable
- Maintainable
- Easy to extend
- Easy to test

Java is a **pure object-oriented language**, and OOP is fundamental for writing clean and scalable Java applications.

---

## The Four Core OOP Concepts

---

## 1. Encapsulation – Data Protection & Control

**Encapsulation** means:
> Hiding internal data and allowing access only through controlled methods.

### Key Idea
- Objects control **how their data is accessed and modified**
- Prevents invalid or inconsistent states

### What this achieves

Data cannot be modified directly

Validation rules live inside the object

Object always stays in a valid state

### Interview Tip

Encapsulation is not just hiding fields — it is about enforcing business rules inside the object.

2. Abstraction – Focus on What, Not How

Abstraction means:

Exposing only essential behavior and hiding implementation details.

### Key Idea

Program to interfaces, not implementations

Client code depends on behavior, not concrete classes

Example (from this repo)
public interface PaymentService {
    void pay(double amount);
}

PaymentService service = new PaypalPayment();
service.pay(1000);

### What this achieves

Easy to add new implementations

Loose coupling

High flexibility and testability

### Interview Tip

Abstraction allows us to change implementations without modifying client code.

3. Inheritance – Code Reuse with IS-A Relationship

Inheritance means:

A child class automatically gets properties and behavior from a parent class.

### Key Idea

Represents an IS-A relationship

Enables code reuse

Uses the extends keyword

Example (from this repo)
public class BoxWeight extends Box {
    double weight;
}

public class BoxPrice extends BoxWeight {
    double cost;
}

 ### Important Rules Demonstrated

Parent constructors are called using super()

Child classes can access parent methods

Reference type decides accessible members

### Interview Tip

Inheritance should be used carefully; composition is often preferred for flexibility.

4. Polymorphism – One Interface, Many Behaviors

Polymorphism means:

The same method call behaves differently based on the object type.

### Key Idea

Achieved through method overriding

Happens at runtime (dynamic binding)

Example (from this repo)
Shapes shape = new Circle();
shape.area(); // Calls Circle's implementation

### How It Works

Compile time: checks reference type

Runtime: calls overridden method of actual object

Special Case: final methods
final void area() { }


Cannot be overridden

Uses compile-time binding (early binding)

Interview Tip

Polymorphism allows systems to be extended without changing existing code.

Additional Concepts Demonstrated
Static Methods

Belong to the class, not the object

Cannot be overridden (method hiding only)

BoxWeight.greeting();

Constructor Chaining

super() ensures parent state is initialized first

Dependency Inversion (SOLID)

High-level modules depend on abstractions

Improves testability and flexibility

Why This Repository?

This repository is designed to:

Learn OOP from fundamentals to interview level

Understand how concepts work together

See real Java behavior, not just definitions

Prepare for Java interviews (Associate → Senior)

Recommended Learning Order

Encapsulation

Abstraction

Inheritance

Polymorphism

Because:

Encapsulation protects state

Abstraction defines behavior

Inheritance reuses structure

Polymorphism enables flexibility

Final Interview Summary

Object-Oriented Programming is about modeling real-world behavior using objects that protect their state, expose meaningful behavior, reuse code safely, and allow flexible runtime behavior.

Author

Shehan Kaushalya
Java | OOP | Backend Fundamentals
