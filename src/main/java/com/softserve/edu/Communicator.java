package com.softserve.edu;

import java.util.Scanner;

public class Communicator {
    private Scanner sc;

    public Communicator() {
        sc = new Scanner(System.in);
    }

    public double readDouble(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }

    public void closeCommunicator() {
        sc.close();
    }
    
}
