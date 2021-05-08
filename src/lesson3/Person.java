package lesson3;

import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birdhYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirdhYear() {
        return birdhYear;
    }

    public void setBirdhYear(int birdhYear) {
        this.birdhYear = birdhYear;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(int birdhYear) {
        return 2021 - birdhYear;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть ім'я : ");
        this.firstName = scan.nextLine();
        System.out.println("Введіть прізвище : ");
        this.lastName = scan.nextLine();
        System.out.println("Введіть рік народження : ");
        this.birdhYear = scan.nextInt();
    }

    public void output() {
        System.out.println("Людину звуть : " + this.firstName + " " + this.lastName + ", їй зараз " + getAge(this.birdhYear) + " років .");
    }

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", "Branov");
        Person vasyl = new Person("Vasyl", "Pip");
        Person olena = new Person("Olena", "Yanchuk");
        Person mark = new Person("Mark", "Chuchuk");
        Person vika = new Person("Viktoriya", "Rivna");
        ivan.input();
        ivan.output();
        vasyl.input();
        vasyl.output();
        olena.input();
        olena.output();
        mark.input();
        mark.output();
        vika.input();
        vika.output();
    }
}
