abstract class Vehicle {
    private String vehicleName;
    private double speed;

    public Vehicle (String vehicleName, double speed) {
        this.vehicleName = vehicleName;
        this.speed = speed;
    }
    public String getName() {
        return vehicleName;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    abstract void start();
}
class Car extends Vehicle {
    public Car(String name, double speed){
        super(name, speed);
    }
    public void start(){
        System.out.println("Car Starts with key...");
    }
}
class Bike extends Vehicle {
    public Bike(String name, double speed) {
        super(name, speed);
    }
    public void start() {
        System.out.println("Bike start with self...");
    }
}
public class VehicleSystem {
    public static void main(String[] arsg) {
        Vehicle v1 = new Car("Honda", 100);
        Vehicle v2 = new Bike("TVS", 80);
        v1.start();
        System.out.println("Car speed is : "+ v1.getSpeed());
        v2.start();
        v2.setSpeed(150);
        System.out.println("Bike speed is : "+v2.getSpeed());

    }
}