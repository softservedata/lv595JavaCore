package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practic2 {

    public static void main(String[] args) throws Exception {

        System.out.println("Enter week's day number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dayNumber  = Integer.parseInt(br.readLine());

        switch (dayNumber) {
            case 0:
                System.out.println("Неділя - Sunday - 1stDay");
                break;
            case 1:
                System.out.println("Неділя - Sunday - 1stDay");
                break;
            case 2:
                System.out.println("Понеділок - Monday - 2ndDay");
                break;
            case 3:
                System.out.println("Вівторок - Tusday - 3rdDay");
                break;
            case 4:
                System.out.println("Середа - Wedneday - 4thDay");
                break;
            case 5:
                System.out.println("Четевер - Thersday - 5thDay");
                break;
            case 6:
                System.out.println("Пятниця - Friday - 6thDay");
                break;
            case 7:
                System.out.println("Субота - Saturday - 7thDay");
                break;
            default:
                System.out.println("Wrong in[ut");
        }
    }
}