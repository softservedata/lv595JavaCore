package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pt1 {

    static int squareRectangle(int a, int b) {

        return a * b;

    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        try {
            System.out.println("Enter a ");
            a = Integer.parseInt(reader.readLine());
            System.out.println("Enter b ");
            b = Integer.parseInt(reader.readLine());
            if (Pt1.squareRectangle(a, b) < 0)
                throw new ArithmeticException("ArithmeticException!!! ");
            System.out.println("Area of a rectangle " + Pt1.squareRectangle(a, b));
        } catch (NumberFormatException | IOException e) {
            System.out.println("Enter integer numbers!");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Exception!!! A or B < 0!!");
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}