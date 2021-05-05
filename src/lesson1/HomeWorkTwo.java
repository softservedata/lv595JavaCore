package lesson1;

//Define String variables name and address. Output question "What is your name?" Read the value name and output next question: “Where are you live, (name)?". Read address and write whole information.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = reader.readLine();
        System.out.println("Where are you live, " + name + "?");
        String adress = reader.readLine();
        System.out.println("You are " + name + " You from is  " + adress );
        reader.close();
    }
}
