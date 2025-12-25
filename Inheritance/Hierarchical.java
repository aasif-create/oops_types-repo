class Vehicle {
    String brand = "BMW";
    void start() {
        System.out.println("starting the VEHICLE");
    }
}
class Car extends Vehicle
{
    void drive() {
        System.out.println("driving the CAR");
    }
}
class Bike extends Vehicle
{
    void ride() {
        System.out.println("riding the BIKE");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("BRAND OF THE CAR IS : " + c.brand);
        c.start();
        c.drive();
        Bike b = new Bike();
        System.out.println("BRAND OF THE BIKE IS : " + b.brand);
        b.start();
        b.ride();
    }
}
/*1. Vehicle is the parent class that contains common properties and methods.
2. Car and Bike are child classes that extend the same Vehicle class.
3. Both Car and Bike inherit the brand variable and start() method.
4. Each child class has its own specific behavior (drive and ride).
5. One parent class with multiple child classes is called
hierarchical inheritance.
*/
