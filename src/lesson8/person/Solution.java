package lesson8.person;

public class Solution {
    public static void main(String[] args) {
        Student p1 = new Student(new FullName("John","Smith"),25,2);
        Person p2 = new Person(new FullName("Max","Rouse"),28) {
            @Override
            public String activity() {
                return "Person";
            }
        };
        System.out.println("Person 1 " + p1.info() + " Course " + p1.getCourse());
        System.out.println("Person 2 " + p2.info());
    }

}
