package lesson6.Birds;

public class Solution {
    public static void main(String[] args) {
        Bird[] birds =  {
            new Chicken("Red", "ChickenEgg"),
                    new Eagle("Black", "EggEagle"),
                    new Penguin("White", "PenguinEgg"),
                    new Swallow("Green", "SmallowEgg")
        };
        for (Bird i : birds)
            System.out.println(i);
    }
}
