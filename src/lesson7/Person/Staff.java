package lesson7.Person;

public abstract class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    @Override
    public String print() {
        return "I am a ";
    }
    public abstract double salary();
}
