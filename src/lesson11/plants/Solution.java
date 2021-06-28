package lesson11.plants;

import java.lang.reflect.Array;

public class Solution {
    public static void main(String[] args) {
        try {
            Plant[] plants = {new Plant("Tree", "Blue", 65),
                    new Plant("Bush", "White", 115),
                    new Plant("Flower", "Blue", 52),
                    new Plant("Flower", "Red", 57),
                    new Plant("Bush", "Red", 183)};
            for (Plant current : plants)
            System.out.println(current);
        } catch (ColorException | TypeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
