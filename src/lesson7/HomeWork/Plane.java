package lesson7.HomeWork;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance=" + maxDistance +
                '}';
    }
}
