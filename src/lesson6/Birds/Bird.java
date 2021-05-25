package lesson6.Birds;

import java.util.Objects;

public abstract class Bird {
    protected String feathers;
    protected String layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return feathers.equals(bird.feathers) && layEggs.equals(bird.layEggs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feathers, layEggs);
    }
}
