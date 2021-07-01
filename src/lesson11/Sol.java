package lesson11;


import java.util.ArrayList;
import java.util.List;

public class Sol {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(15);
        lst.add(7);
        lst.add(1, 3);
        System.out.println(sum(lst));
    }

    static int sum(List<Integer> list) {
        int sum = 0;
        for (Integer l : list) {
            sum = l;
        }
        return sum;


    }
}
