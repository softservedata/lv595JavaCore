package lesson7.Person;

public class Teachers extends Staff {
   private final String TYPE_PERSON = "Teachers";

    public Teachers(String name) {
        super(name);
    }

    @Override
    public String print() {
        return "My name is " + getName() + " I am a " + TYPE_PERSON;
    }

    @Override
    public double salary() {
        return 25518.62;
    }
}
