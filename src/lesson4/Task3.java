package lesson4;
//read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the error HTTP number :");
        int a = scanner.nextInt();

        if (a == 400)
            System.out.println(" Bad Request ");

        else if (a == 401)
            System.out.println("Unauthorized ");

        else if (a == 402)
            System.out.println("Payment Required");

        else if (a == 403)
            System.out.println("Forbidden ");
        else if (a == 404)
            System.out.println("Not Found ");
        else if (a == 405)
            System.out.println("Method Not Allowed");
        else if (a == 406)
            System.out.println("Not Acceptable");
        else if (a == 407)
            System.out.println("Proxy Authentication Required");
        else if (a == 408)
            System.out.println("Request Timeout");
        else if (a == 409)
            System.out.println("Conflict");
        else if (a == 410)
            System.out.println("Gone");
        else
            System.out.println("incorrect input");

    }

}

