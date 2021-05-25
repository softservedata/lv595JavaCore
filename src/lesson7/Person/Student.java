package lesson7.Person;

public class Student extends Person {
    final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public String print() {
        return "My name is " + getName() + " I am a " + TYPE_PERSON;
    }
}
