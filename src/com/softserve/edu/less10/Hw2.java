package com.softserve.edu.less10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("\\w+");
        Matcher m;
        StringBuilder name = new StringBuilder("I  am   making    this    task   long time") ;
        System.out.println("Original is : "+name);
//        name = br.readLine();
//        name = "I am making this task long time";

        m = p.matcher(name);
        List<StringBuilder> words = new ArrayList<>();
//       System.out.println("String: " + name);
        int i = 0;
        while (m.find()){
            words.add(new StringBuilder(name.substring(m.start(),m.end())));
//    System.out.print(name.substring(m.start(),m.end()));
//    System.out.println(i+" matching: start - "+ m.start() + " , end - " + m.end());
//    System.out.println(words.get(i++));
//    words.get(i) = new StringBuilder();
//    words.get(i).add(name.substring(m.start(),m.end()));
        }
//        StringBuilder temp = new StringBuilder();
//        temp.append("am");
//        System.out.println("temp=" + temp);
        name.delete(0, name.length());
        name.append(words.get(0));
//        System.out.println("name is: " + name);
        for(i=1; i< words.size(); i++) {
//            System.out.print(",i="+i);
//            System.out.println("words.get("+i+")="+words.get(i)+".");

            if (words.get(i).toString().equals("am")) {
//                System.out.println("Found am!!!");
//                words.get(i).replace(0, 2, "'m");
            name.append("'m");
            } else if (words.get(i).toString().equals("are")) {
                words.get(i).replace(0, 3, "'re");
                name.append("'re");

            } else if (words.get(i).toString().equals("is")) {
                words.get(i).replace(0, 2, "'s");
                name.append("'s");

            } else
            name.append(" "+words.get(i));

        }
            System.out.println("result = " +name);
//        System.out.println("The second word in revers is " + words.get(1).reverse());
    }
}
