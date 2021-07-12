package com.softserve.edu.less13java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import org.joda.time.format.*;
//import org.joda.time.DateTime;

public class Hw3app {
    public static void main(String[] args) {
Hw3 hw3 = new Hw3();
        hw3.run();
    }
}

class Hw3 {
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date = "";
        System.out.print("Enter date mm.dd.yy: ");
        try {
            date = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (isDateValid(date))
            System.out.println("date is valid");
        else
            System.out.println("Wrong date!!");
    }

    final static String DATE_FORMAT = "MM.dd.yy";

    public boolean isDateValid(String date) {
        try {
            DateFormat df = new
                    SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }

    }
}


