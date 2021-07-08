package lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Hm3 {
    final static String DATE_FORMAT = "mm.dd.yy";

    public static boolean isDateValid(String date) {
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

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = null;
        System.out.println("Write data");
        try {
            date = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Hm3.isDateValid(date));

    }
}
