package Lesson6Cars;

public class Truck extends Car {
    public Truck(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("Truck Run ");
    }

    @Override
    public void stop() {
        System.out.println("Truck Stop ");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
