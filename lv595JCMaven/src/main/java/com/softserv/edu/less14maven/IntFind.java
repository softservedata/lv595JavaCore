package main.java.com.softserv.edu.less14maven;

public class IntFind{

    public int min(int[] args){
        int res = args[0];
        for (int arg : args)
            if (res > arg)
                res = arg;
        return res;
    }


    public int max(int[] args){
        int res = args[0];
        for (int arg : args)
            if (res < arg)
                res = arg;
        return res;
    }

}