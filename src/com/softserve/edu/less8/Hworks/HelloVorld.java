package com.softserve.edu.less8.Hworks;


    import java.util.*;
    public class HelloVorld{

        public static class Util {
            public static <T> T getValue(Object obj, Class<T> clazz) {
                return (T) obj;
            }
            public static   <T> T getValue(Object obj) {
                return (T) obj;
            }
        }

        public static void main(String []args) {
            List list = Arrays.asList("Author", "Book");
            for (Object element : list) {
                String data = Util.getValue(element, String.class);
                System.out.println(data);//Util.getValue(element));//, String.class));
                String data2 = Util.<String>getValue(element);
                System.out.println(data2);
            }
        }
    }

