package com.softserve.edu.less13java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Hw2app {
    public static void main(String[] args) {
        Hw2 hw2 = new Hw2();
        hw2.run();

    }
}

class ToEncrypt{
    String str;
    int key;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public ToEncrypt(String str, int key) {
        this.str = str;
        this.key = key;
    }
}
//interface Converter<String, (String, int)> encrypt = (s,i) -> s + Integer.toString(i);
//interface Function<String, ToE>


class Hw2{
    public static String encrypt(ToEncrypt toEncrypt) {
        StringBuilder origin = new StringBuilder();
//        System.out.println("origin: "+origin);
        for (int count =0; count < toEncrypt.getStr().length(); count++){
          origin.append( (char)
                  (toEncrypt.getStr().charAt(count)
                            + toEncrypt.getKey()));
        };
//        System.out.println("charArray: "+ origin.toString());
        return origin.toString();
    };



    public void run(){
        List<String> list1 = new ArrayList<>(Arrays.asList(new String[] {"Olya", "Nazar", "Ira", "Dmytro", "Natalya", "Oleg", "Paraskeva", "Jura"}));
        String test = "abcdef12345";
        System.out.println("test:" + test);
//        Converter encrypt = (s) -> s + Integer.toString(4);
/*        Function< ToEncrypt, String> encrypt = (toEncrypt) -> {
            char[] origin =  toEncrypt.getStr().toCharArray();
            for (int count =0; count < origin.length; count++){
                origin[count] =
                        (char) (origin[count]
                                + toEncrypt.getKey());
            };
            return origin.toString();
        };
 */
        Function<ToEncrypt, String> decrypt = (toEncrypt) -> {
            StringBuilder origin = new StringBuilder();
//        System.out.println("origin: "+origin);
            for (int count =0; count < toEncrypt.getStr().length(); count++){
                origin.append( (char)
                        (toEncrypt.getStr().charAt(count)
                                - toEncrypt.getKey()));
            };
//        System.out.println("charArray: "+ origin.toString());
            return origin.toString();
        };


        test = encrypt(new ToEncrypt(test,4));
        System.out.println("test encrypted: " + test);
        System.out.println("Origin list: " + list1);
        list1.replaceAll(x -> encrypt(new ToEncrypt(x,4)));


        System.out.println("Encrypted list: " + list1);

//        list1.replaceAll(x -> encrypt(new ToEncrypt(x,-4)));

        list1.replaceAll(x -> decrypt.apply(new ToEncrypt(x,4)));
        System.out.println("Decrypted list: " + list1);

    }
}

