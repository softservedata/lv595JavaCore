package com.softserve.edu.las3les4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practic2 {

    public static void main(String[] args) throws Exception {

        System.out.println("Enter week's day number [0 - 6] : ");
        dayOfWeek weeksDay = dayOfWeek.d0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dayNumber  = Integer.parseInt(br.readLine());

        switch (dayNumber) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(weeksDay.valueOf("d"+dayNumber));
                break;
            default:
                System.out.println("Wrong in[ut");
        }

    }

    enum dayOfWeek{
            d0("Неділя","Sunday","1stDay"),
            d1("Понеділок","Monday","2ndDay"),
            d2("Вівторок","Tusday","3rdDay"),
            d3("Середа","Wedneday","4thDay"),
            d4("Четевер","Thersday","5thDay"),
            d5("Пятниця","Friday","6thDay"),
            d6("Субота","Saturday","7thDay");
            private String ua;
            private String en;
            private String numDay;


        dayOfWeek(String ua, String en, String numDay) {
            this.ua = ua;
            this.en = en;
            this.numDay = numDay;
        }


        @Override
        public String toString() {
            return "dayOfWeek{" +
                    "ua='" + ua + '\'' +
                    ", en='" + en + '\'' +
                    ", numDay='" + numDay + '\'' +
                    '}';
        }
    }
}