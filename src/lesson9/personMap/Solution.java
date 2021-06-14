package lesson9.personMap;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Kovalenko", "Ostap");
        personMap.put("Nesterenko", "Anastasiya");
        personMap.put("Savchuk", "Rostyslav");
        personMap.put("Koval", "Artem");
        personMap.put("Vovkovych", "Yana");
        personMap.put("Kordyak", "Ruslan");
        personMap.put("Voznjak", "Orest");
        personMap.put("Kuras", "Volodymyr");
        personMap.put("Grunyk", "Marta");
        personMap.put("Tymkiv", "Roman");
        for (Map.Entry<String, String> entry : personMap.entrySet())
            System.out.println("Person " + entry.getKey() + " " + entry.getValue());
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            int i = 0;
            if (entry.getValue().equals(entry.getValue()))
                i++;
            if (i >= 2)
                System.out.println("\n" + "Among these people there are " + i + " people with the same name");

            else
                System.out.println("Among these people there are not 2 people with the same name");
            break;
        }
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals("Yana")) {
                personMap.remove("Vovkovych");
                System.out.println("Yana deleted ");
            }
            break;
        }
        System.out.println(personMap);
    }

}
