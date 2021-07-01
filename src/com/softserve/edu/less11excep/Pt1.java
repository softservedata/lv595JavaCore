package com.softserve.edu.less11excep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pt1 {
    static int squareRectangle(int a, int b) throws Exception {
        if (a < 0 || b < 0)
            throw new SquareRectangleException("Negative value");
        return a * b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer a, b, res;
        try {
            System.out.print("1st side : ");
            a = Integer.parseInt(br.readLine());
            System.out.print("2nd side : ");
            b = Integer.parseInt(br.readLine());
            res = squareRectangle(a, b);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Error input Founded = " + e);;
        } catch (SquareRectangleException e) {
            System.out.println("Wrong input Founded = " + e);;

            //            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
