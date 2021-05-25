package lesson6.Birds;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
    }
}
