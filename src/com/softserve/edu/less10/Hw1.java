package com.softserve.edu.less10;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("\\w+");
        Matcher m;
        String name;
        System.out.print("Enter sentence of five words: ");
//        name = br.readLine();
        name = "I am making this task long time";

        m = p.matcher(name);
        List<StringBuilder> words = new ArrayList<>();
//       System.out.println("String: " + name);
int i = 0;
while (m.find()){
    words.add(new StringBuilder(name.substring(m.start(),m.end())));
//    System.out.print(name.substring(m.start(),m.end()));
//    System.out.println(i+" matching: start - "+ m.start() + " , end - " + m.end());
//    System.out.print(words.get(i));
//    words.get(i) = new StringBuilder();
//    words.get(i).add(name.substring(m.start(),m.end()));
}
        System.out.println(words);

if (words.size()<5)
    System.out.println("Not enougth words, but...");
else
    if (words.size()>5)
        System.out.println("Too much words, but...");
int maxlength = words.get(0).length();
int maxlengthindex = 0;
i = 0;
for(i = 1; i < words.size(); i++) {
    if (maxlength < words.get(i).length()) {
        maxlength = words.get(i).length();
        maxlengthindex = i;
    }
}
        System.out.println("The longets word is " + words.get(maxlengthindex) + ". The number of letters is " + maxlength);
        System.out.println("The second word in revers is " + words.get(1).reverse());
    }
}
