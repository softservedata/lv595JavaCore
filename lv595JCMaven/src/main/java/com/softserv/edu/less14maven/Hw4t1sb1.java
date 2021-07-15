package main.java.com.softserv.edu.less14maven;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hw4t1sb1 {

    public static void main(String[] args) throws Exception{
        float num1, num2, num3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 floats: ");
        ValidFloat validFloat = new ValidFloat(-5f, 5f);
        num1 = Float.parseFloat(br.readLine());
        num2 = Float.parseFloat(br.readLine());
        num3 = Float.parseFloat(br.readLine());

        if(validFloat.validFloat(num1))
            System.out.println("Number1 - " + num1 + " belong range [-5,5]");
        else
            System.out.println("Number1 - " + num1 + " not belong range [-5,5]");

        if(validFloat.validFloat(num2))
            System.out.println("Number2 - " + num2 + " belong range [-5,5]");
        else
            System.out.println("Number2 - " + num2 + " not belong range [-5,5]");

        if(validFloat.validFloat(num3))
            System.out.println("Number3 - " + num3 + " belong range [-5,5]");
        else
            System.out.println("Number3 - " + num3 + " not belong range [-5,5]");
    }
}

