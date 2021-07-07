package com.softserve.edu.less12thread;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw4 {
    public static void main(String[] args) {
        byte[] r = new byte[1000];
        ArrayList<String> fileStrings = new ArrayList<>();
        int stringsCount = 0, maxLineLength = 0, maxLineLengthId = 0;
//        String fileName = "D:/Programs/IDEA/lv595JavaCore/src/com/softserve/edu/less12thread/file1.txt";
        String fileName = "D:/file1.txt";
        String fileLine;
        FileInputStream inFile;
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferWriter = null;

        try {
 //           inFile = new FileInputStream(fileName);
            fileReader = new FileReader(fileName);
            System.out.println("Input file was opened.");
            bufferReader = new BufferedReader(fileReader);;
         while ((fileLine = bufferReader.readLine()) != null ) {
//                System.out.println(fileLine);
                fileStrings.add(fileLine);
                if (fileLine.length() > maxLineLength) {
                    maxLineLengthId = stringsCount;
                    maxLineLength = fileLine.length();
                }
                stringsCount++;
            }
            bufferReader.close();
            System.out.println("Input stream was closed.");

        } catch (IOException e) {
            System.out.println("File Read Error: " + fileName);
        }
//        for(String curr : fileStrings)
//        System.out.println(curr);


        try {
            fileName = "D:/file2.txt";
           fileWriter = new FileWriter(fileName);
           bufferWriter = new BufferedWriter(fileWriter);

//            System.out.println("Total lines are : "+ (stringsCount-1));
//            System.out.println("The longest line is next\n"+fileStrings.get(maxLineLengthId));
            bufferWriter.write("Total lines are : "+ (stringsCount-1)+"\n");
            bufferWriter.write("The longest line is next\n"+fileStrings.get(maxLineLengthId)+"\n");
           Matcher m;
           boolean someFound = false;
           for(String curr : fileStrings){
               // Name proccessing!! -------------------------------------
               Pattern p = Pattern.compile("my\\s*name\\s*:");
               m = p.matcher(curr.toLowerCase());
               int i = 1;
               if (m.find())
               {
                   System.out.println("Name: - found");
                   p = Pattern.compile("\\b\\w+");
                   curr = curr.substring(curr.lastIndexOf(':',curr.length()));
                   System.out.println(curr);
                   m = p.matcher(curr);
                   i=0;
                   while (m.find())
                {
                    System.out.println("next:"+curr.substring(m.start(),m.end()));
                    bufferWriter.write("Name" + i++ +":"+curr.substring(m.start(),m.end())+",");
                }
               } else   // BirthDay processing ---------
               {
                   p = Pattern.compile("\\s*birth\\s*date\\s*:");
                   m = p.matcher(curr.toLowerCase());
               m.reset();
                  if (m.find())
                   {
                       System.out.println("BirthDay: - found");
                       p = Pattern.compile("\\d+");
                       curr = curr.substring(curr.lastIndexOf(':',curr.length()));
                       System.out.println("current string: " +curr);
                       m = p.matcher(curr);
                       i=0;
                       bufferWriter.write('\n');
                       while (m.find())
                       {
                           System.out.println("next:"+curr.substring(m.start(),m.end()));
                           bufferWriter.write("BD" + i++ +":"+curr.substring(m.start(),m.end())+",");
                       }
                   }

               }
           }
           bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println("File Write Error: " + fileName);
        }

    }
}
