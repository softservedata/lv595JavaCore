package lesson6Birds;

public abstract class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Not Flied");
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }
}
