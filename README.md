ADVANCED OOPS CONCEPTS (JAVA)
POLYMORPHISM : Polymorphism means the same method name can behave differently.

Types of Polymorphism:

1. Compile-Time Polymorphism (Method Overloading):Same method name with different parameters, decided at compile time.
                                                  Example: add(int a, int b) and add(int a, int b, int c)

2. Run-Time Polymorphism (Method Overriding)     :Child class changes parent class method behavior, decided at runtime.
                                                  Example: Child class overrides start() method.

INHERITANCE : Inheritance allows one class to acquire the properties and methods of another class.

Types of Inheritance

1. Single-Level Inheritance              :One child class inherits from one parent class.
                                          Example: Car extends Vehicle

2. Multi-Level Inheritance               :A class inherits from a child class of another class.
                                          Example: SportsCar extends Car extends Vehicle

3. Hierarchical Inheritance              :Multiple child classes inherit from the same parent class.
                                          Example: Car extends Vehicle and Bike extends Vehicle

4. Multiple Inheritance(Using Interfaces):A class inherits features from multiple interfaces.
                                          Example: GPay implements ScanQr, BankTransfer

5. Hybrid Inheritance (Using Interfaces) :Combination of more than one type of inheritance.
                                          Example: Class inheritance + multiple interfaces together.

ABSTRACTION :Abstraction means hiding implementation details and showing only essential features.

Ways of Achieving Abstraction

1. Abstract Class:Provides partial abstraction by allowing both abstract and concrete methods.
                  Example: An abstract Vehicle class with an abstract start() method.

2. Interface     :Provides complete abstraction by defining only method declarations.
                  Example: A Payment interface implemented by different payment apps.