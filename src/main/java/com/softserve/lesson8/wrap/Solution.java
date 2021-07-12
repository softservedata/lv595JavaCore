package com.softserve.lesson8.wrap;

public class Solution {
    public static void main(String[] args) {
        Wrapper<Integer> inst1 = new Wrapper<>(15);
        Wrapper<String> inst2 = new Wrapper<>("String type");
        Wrapper<Boolean> inst3 = new Wrapper<>(true);
        System.out.println(inst1);
        System.out.println(inst2);
        System.out.println(inst3);
    }
}
