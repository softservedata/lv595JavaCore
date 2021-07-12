package com.softserve.lesson11.homework;

public class MyException extends Exception{
    public MyException(int arg0){
        super(String.valueOf((arg0)));
    }
    public MyException(double arg0){
        super(String.valueOf((arg0)));
    }
}
