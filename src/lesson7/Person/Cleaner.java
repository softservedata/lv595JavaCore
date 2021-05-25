package lesson7.Person;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";
    public Cleaner(String name) {
        super(name);
    }

    @Override
    public String print() {
        return "My name is " + getName() + " I am a " + TYPE_PERSON;
    }

    @Override
    public double salary() {
        return 15936.84;
    }
}
