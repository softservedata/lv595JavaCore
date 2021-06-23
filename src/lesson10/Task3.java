package lesson10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        Matcher matcher;
        Pattern pattern = Pattern.compile("[A-Z]\\w{2,14}");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name : ");
            name = scanner.nextLine();
            matcher = pattern.matcher(name);
            if (matcher.matches())
                System.out.println("Good name ");
            else
                System.out.println("Invalid name ");
        }
    }
}
