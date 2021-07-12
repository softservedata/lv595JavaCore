package com.softserve.edu.less12thread;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestStream {
public static Integer optionalSum (Optional<Integer> a, Optional<Integer> b){
    Integer val = a.orElse(0);
    Integer val2 = b.get();
    return val + val2;
}

    public static void main(String[] args) {


//*  list as array, stream
        String arr[] = {"abc4", "abc3", "abc2", "abc1"};
        List<String> list = Arrays.asList(arr);
        System.out.println("arr[]: ");
        Arrays.stream(arr).map(x -> x+",").  forEach(System.out::print);
        System.out.println("\nlist: " + list);
//        arr[3] = "2abc";
        list.set(2,list.get(2).replace(list.get(2),"2abc" ));
        System.out.println("arr[3] = \"2abc\"");
        System.out.println("arr[]: ");
        Arrays.stream(arr).map(x -> x+",").  forEach(System.out::print);
        System.out.println("\nlist" + list);


/* ---------- test Optional class
        Optional<Integer> b = null;
        Optional<Integer> a = Optional.of(5);
        System.out.println("\n-----------------\nOptonal. Sum(,5) ="
                +optionalSum(a, b));

 */

/* list as array,
        String arr[] = {"abc4", "abc3", "abc2", "abc1"};
        List<String> list = Arrays.asList(arr);
        System.out.println("arr[]: ");
        for (String curr : arr)
            System.out.print(curr+",");

        System.out.println("\nlist: " + list);
        arr[3] = "2abc";
        System.out.println("arr[3] = \"2abc\"");
        System.out.println("arr[]: ");
        for (String curr : arr)
            System.out.print(curr+",");
        System.out.println("\nlist" + list);
*/
/*
        String arr[] = {"abc4", "abc3", "abc2", "abc1"};
        List<String> list = new ArrayList<>();
        for (int i =0; i < arr.length; i++)
            list.add(arr[i]);
        System.out.println("arr[]: ");
        for (String curr : arr)
            System.out.print(curr+",");

        System.out.println("\nlist: " + list);
        arr[3] = "2abc";
        System.out.println("arr[3] = \"2abc\"");
        System.out.println("arr[]: ");
        for (String curr : arr)
            System.out.print(curr+",");
        System.out.println("\nlist" + list);
*/
    }
}
