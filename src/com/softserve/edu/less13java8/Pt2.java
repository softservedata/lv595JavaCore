package com.softserve.edu.less13java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Pt2 {
    public static void main(String[] args) {
        LocalDate ldt = LocalDate.now();
       // ldt = LocalDate.of(2021, 8, 22);

        LocalDate fmd ; // ldt.get()
        int fmnum;
        String wantedMonthOfYear;
        String wantedDayOfWeek;
        int wantedDayOfWeekNumber = 0;
        int wantedMonthOfYearNumber = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
        System.out.print("Month? : ");
            wantedMonthOfYear = br.readLine();
        System.out.print("Week's Day? : ");
        wantedDayOfWeek = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            wantedDayOfWeek = "Monday";
            wantedMonthOfYear = "January";
        } finally {
        }

        switch (wantedDayOfWeek.toLowerCase()){
            case "monday":
                wantedDayOfWeekNumber = 1;
                break;
            case "tuesday":
                wantedDayOfWeekNumber = 2;
                break;
            case "wednesday":
                wantedDayOfWeekNumber = 3;
                break;
            case "thursday":
                wantedDayOfWeekNumber = 4;
                break;
            case "friday":
                wantedDayOfWeekNumber = 5;
                break;
            case "saturday":
                wantedDayOfWeekNumber = 6;
                break;
            case "sunday":
                wantedDayOfWeekNumber = 7;
                break;
            default:
                System.out.println("wrong day!!!");
        }
        System.out.println("day of week number :" + wantedDayOfWeekNumber);

        wantedMonthOfYearNumber = Month.valueOf(wantedMonthOfYear.toUpperCase()).getValue();
        ldt = LocalDate.of(ldt.getYear(), wantedMonthOfYearNumber, 1);

        System.out.println("Month number :" + wantedMonthOfYearNumber);

        DayOfWeek dw = ldt.getDayOfWeek();

/*        System.out.println("Today is " + ldt
                + " week'sday " + dw
                +", number - " + dw.getValue());//ldt.getDayOfWeek());
*/        fmnum = dw.getValue();
        fmnum = (wantedDayOfWeekNumber-fmnum+7) %7 +1;

        System.out.println("The date of first "+wantedDayOfWeek+" of "
                + wantedMonthOfYear+" is "
                + fmnum);

    }
}
