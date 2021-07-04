package lesson13;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(10).sorted().forEach(System.out::println);
    }
}
