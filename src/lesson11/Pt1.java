package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pt1 {

    static int squareRectangle(int a, int b) {

        return a * b;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter b ");
        int b = Integer.parseInt(reader.readLine());

        try {
            if (Pt1.squareRectangle(a, b) < 0)
                throw new ArithmeticException("ArithmeticException!!! ");
        } catch (ArithmeticException e) {
            System.out.println("Exception!!! A or B < 0!!");
        }

        try {
            if (a != Integer.parseInt(reader.readLine()))
                throw new NumberFormatException("NumberFormatException!!!");
        } catch (NumberFormatException e) {
            System.out.println("Enter Number!!! ");
        }
        System.out.println("Area of a rectangle " + Pt1.squareRectangle(a, b));

    }
}
