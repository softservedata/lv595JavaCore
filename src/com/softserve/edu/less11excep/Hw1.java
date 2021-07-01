package com.softserve.edu.less11excep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw1 {
    static double div(double a, double b){
    double res;
        if ( b == 0.0) {
            throw new ArithmeticException("div by zero");
    //        return 0.0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double a, b, res;// = 0.0;
        try {
            System.out.print("Devided value : ");
            a = Double.parseDouble(br.readLine());
            System.out.print("Devider value : ");
            b = Double.parseDouble(br.readLine());
            res = div(a, b);
            System.out.println("Result = " + res);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Error input Founded = " + e);;
        } catch (ArithmeticException e) {
            System.out.println("Deviding error = " + e);
        } finally {
            System.out.println("Done");
        }
    }
}
