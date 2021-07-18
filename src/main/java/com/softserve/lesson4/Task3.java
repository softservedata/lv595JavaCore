package com.softserve.lesson4;
//read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

import java.util.Scanner;

public class Task3 {
    public enum Errores {Bad_Request, Unauthorized, Payment_Required, Forbidden, Not_Found, Method_Not_Allowed, Not_Acceptable}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number HTTP error : ");
        int a = scanner.nextInt();
        if (a == 400)
            System.out.println(Errores.Bad_Request);

        else if (a == 401)
            System.out.println(Errores.Unauthorized);

        else if (a == 402)
            System.out.println(Errores.Payment_Required);

        else if (a == 403)
            System.out.println(Errores.Forbidden);
        else if (a == 404)
            System.out.println(Errores.Not_Found);
        else if (a == 405)
            System.out.println(Errores.Method_Not_Allowed);
        else if (a == 406)
            System.out.println(Errores.Not_Acceptable);
        else
            System.out.println("incorrect input");

    }

}

