package com.softserve.edu;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
        public static void main(String[] args) {
//String pattern = "[a-z]+";
//String text = "Now is the time";
//String pattern = "<.*>";
//String pattern = "<[^>]*>";
//String text = "<p><b>Beginning with bold text</b> next, text body,<i>italic text</i> end of text.</p>";
    //
//              String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
//                String pattern = "\\w*([a-zA-Z])\\1\\w*[0-9]+(\\.\\w*)*@(\\w+\\.)+\\w+";
                String pattern =
                        "\\w*\\.*\\w*([a-zA-Z])\\1\\w*[0-9]+(\\.\\w*)*@(\\w+\\.)+\\w+";
                String text = "myy45.mail.ua@ua.ua, ziil3@i.ua, mail.qq35@ukr.net";
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(text);

                if (m.matches()) { System.out.print("Matches the entire text string"); }
                m.reset();
                System.out.println();
                while (m.find()) {
                        System.out.println("found - " + m.group());
//                        System.out.print(text.substring(m.start(), m.end()) + "*");
                }
        }
}