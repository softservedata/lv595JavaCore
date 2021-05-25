package lesson6.Employye;

public class Solution {
    public static void main(String[] args) {
        Employee max = new Employee("Taras",32,25421.74);
        Developer dev1 = new Developer("Igor",25,"Java Dev",32974.53);
        System.out.println(max.report());
        System.out.println(dev1.report());
    }
}
