package lesson9.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmpMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(23, "Mark");
        employeeMap.put(32, "John");
        employeeMap.put(16, "Jack");
        employeeMap.put(52, "Marta");
        employeeMap.put(11, "Viktoria");
        employeeMap.put(25, "Ira");
        employeeMap.put(47, "Mickael");
        System.out.println("Enter ID Employee : ");
        int scan = scanner.nextInt();
        if (employeeMap.containsKey(scan)) {
            System.out.println("Employee name is : " + employeeMap.get(scan));
        } else {
            System.out.println("No employee with this ID was found");
        }

        System.out.println("Enter employee Name : ");


        String name = scanner.nextLine();

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (employeeMap.containsValue(name)) {
                System.out.println("Employee key = " + entry.getKey() + " value = " + entry.getValue());
            } else
                System.out.println("No employee with this name was found " + name);
            break;
        }
        scanner.close();

    }

}
