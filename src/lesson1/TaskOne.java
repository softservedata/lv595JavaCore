package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Define integer variables a and b. Read values a and b from Console and calculate:
        a + b
        a - b
        a * b
        a / b
        Output obtained results
*/
public class TaskOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть число А");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введіть число B");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        reader.close();
    }

}
