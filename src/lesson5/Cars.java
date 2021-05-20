package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Cars {
    private String type;
    private int year;
    private int engine;


    public void scan() {
        Scanner sc = new Scanner(System.in);
        int vv = sc.nextInt();
    }

    public Cars(String type, int year, int engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Cars{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public static void sortCar(Cars[] arr) {
        Cars tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getYear() < arr[j].getYear()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cars toyota = new Cars("Coupe", 1967, 450);
        Cars mazda = new Cars("Sedan", 1995, 338);
        Cars opel = new Cars("Universal", 2012, 130);
        Cars ford = new Cars("Coupe", 1980, 225);
        Cars[] maskar = new Cars[4];
        maskar[0] = toyota;
        maskar[1] = mazda;
        maskar[2] = opel;
        maskar[3] = ford;
        System.out.println("Car list :");
        for (Cars i : maskar) {
            System.out.println(i);
        }
        System.out.println("Enter year Car ");
        int sc = scan.nextInt();
        for (Cars i : maskar) {
            if (i.getYear() == sc)
                System.out.println(i);
        }
        System.out.println("Sorted cars ");
        sortCar(maskar);

    }
}
