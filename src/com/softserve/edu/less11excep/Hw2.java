package com.softserve.edu.less11excep;

import org.omg.CORBA.portable.InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Hw2 {
    public static void main(String[] args) {
        ReadNumber rn = new ReadNumber();
        int value = 1, lowEdge = 1, topEdge = 100, numberTry=5;
        for (int count = 0; count < numberTry; count++){
            System.out.println("Itteration " + count + " of " + numberTry);
            try {
                value = rn.readNumber(value, topEdge - numberTry + count);
            } catch (NumberFormatException e) {
//                throw new NumberFormatException();
                  System.out.println("Error input Founded = " + e);;
            } catch (InputMismatchException e) {
//                throw new NumberFormatException();
                  System.out.println("Missmatch input Founded = " + e);;
            } finally {
                System.out.println("Current value = " + value);
            }

        }


    }
}

class ReadNumber{
    public ReadNumber(){}
    public int readNumber(int start, int end){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value;
        System.out.print("Enter integer beetwen " + start + " and " + end + " : ");
        try {
            value = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            throw new NumberFormatException();
 //           System.out.println("Error input Founded = " + e);;
        }
        if (value < start) {
            throw new InputMismatchException("data less minimum");
            //return 0;
        } else if (value > end) {
            throw new InputMismatchException("data over maximum");
            //return 0;
        }
return value;
    }
}