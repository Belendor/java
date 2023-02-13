// Implement a class Car 
public class Car {
    // with the following properties.
    private int fuelEfficiency; //A car has a certain fuel efficiency (measured in km/litre) 
    private double fuelLevel; //and a certain amount of fuel in the fuel tank.

    public Car(int fuelEfficiency) { // The efficiency is specified in the constructor,
        this.fuelEfficiency = fuelEfficiency;
        this.fuelLevel = 0; // and the initial fuel level is 0.
    }
    // Supply a method drive that simulates driving the car for a certain distance
    public void drive(int distance) {
        fuelLevel -= (double) distance / fuelEfficiency; // reducing the fuel level in the tank
    }

    public void addFuel(double fuel) {
        fuelLevel += fuel;
    }
    //and methods getFuelLevel,
    public double getFuelLevel() {
        return fuelLevel; //to return the current fuel level, and addFuel, to tank up.
    }

    public static void main(String[] args) {
        Car myHybrid = new Car(30);
        myHybrid.addFuel(20);
        myHybrid.drive(100);
        System.out.println(myHybrid.getFuelLevel());
        System.out.println("Fuel used: " + (20 - myHybrid.getFuelLevel()));
        System.out.println("Fuel efficiency: " + myHybrid.fuelEfficiency);
    }
}
