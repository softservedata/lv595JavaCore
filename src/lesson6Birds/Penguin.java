package lesson6Birds;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
    }
}
