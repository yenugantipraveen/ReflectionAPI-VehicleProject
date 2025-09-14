# Reflection API - Vehicle Management System
This project demonstrates the use of Java Reflection API and OOP concepts (inheritance, abstraction, and polymorphism).

## Features
- Vehicle classes can be loaded dynamically at runtime with Class.forName().
- Sample vehicle types: RedBus, Express, Orange, Volvo
- The driver class calls the vehicle's drive method.
- Invalid input and class-not-found exception handling

## How To Run
1. Compile all Java files.
2. Run Bus_Depo_With_ReflectionAPI
3. Type the complete class name (e.g., com.nit.hk.vehicle.RedBus).


com.nit.hk.vehicle
├── Vehicle.java                   # Abstract base class
├── Bus.java                       # Intermediate abstract class implements Vehicle
├── RedBus.java                    # Concrete class extending Bus
├── Express.java                   # Concrete class extending Bus
├── Orange.java                    # Concrete class extending Bus
├── Volvo.java                     # Concrete class extending Bus
├── Driver.java                    # Optional driver logic
├── Bus_Depo.java                  # Traditional object creation
└── Bus_Depo_With_ReflectionAPI.java  # Uses Reflection API to create objects at runtime
