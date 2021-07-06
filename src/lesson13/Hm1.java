package lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hm1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        Collections.addAll(list1, "Java", "Hello", "Computer", "Mouse", "phone", "abc", "qwerty", "aaaa");
        List<String> list2 = list1.stream()
                .filter(s -> s.length() < 5)
                .collect(Collectors.toList());
        list2.stream().forEach(x -> System.out.println(x));

    }
}
