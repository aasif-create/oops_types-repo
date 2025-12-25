class Vehicle {
    String color="BLUE";
    void start() {
        System.out.println("starting the VEHICLE");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("driving the CAR");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("COLOR OF THE CAR IS :"+c.color);
        c.start();
        c.drive();
    }}







/*
EXPLANATION :

1. Vehicle is the parent class.
2. Car is the child class that extends Vehicle.
3. Car inherits the color variable and start() method.
4. Car adds its own behavior using drive().
5. One parent and one child form single-level inheritance.
*/