package com.softserve.edu.less1;

/*public class task0 {
}
package softserv.javacore.less1;
 */
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class task0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello. What is your name?");
        String name = br.readLine();
        System.out.println("How old are you?");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
}