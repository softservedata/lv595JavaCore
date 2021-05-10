package lesson4;

public class Dog {
    private String name, breed;
    private int age;

    private enum Breed {Taxa, Mops, Pitbull, Labrador, Senbernar, Doberman}

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog tax = new Dog("Jack", "Taxa", 3);
        Dog mop = new Dog("Rex", "Mops", 9);
        Dog dob = new Dog("Fur", "Doberman", 6);
    }
}
