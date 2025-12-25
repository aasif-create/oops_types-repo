class Vehicle {
    String brand="BMW";
    void start() {
        System.out.println("starting the VEHICLE");
    }
}
class Car extends Vehicle {
    String tyres="MRF";
    void drive() {
        System.out.println("driving the CAR");
    }
}
class SportsCar extends Car{
    void mode()
    {
        System.out.println("TURBO MODE ACTIVATED");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        SportsCar c = new SportsCar();
        System.out.println("BRAND OF THE SPORTSCAR IS :"+c.brand);
        System.out.println("TYRES OF THE SPORTSCAR IS :"+c.tyres);
        c.start();
        c.drive();
        c.mode();
    }}
/*1. Vehicle is the base class that contains common properties and methods.
2. Car extends Vehicle and inherits its features.
3. SportsCar extends Car and becomes a child of both Car and Vehicle.
4. SportsCar can access properties and methods from both parent classes.
5. When a class inherits another child class, it is called
multi-level inheritance. */
