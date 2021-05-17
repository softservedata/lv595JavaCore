package lesson5;

public class Task1 {
    public void maxmas(int[] mas) {
        int max = mas[0];
        int imax = 0;
        int i = 0;
        while (i < mas.length) {
            if (mas[i] > max) {
                max = mas[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

    }

    public void summas(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0)
                sum += mas[i];
            else
                sum += 0;
        }
        System.out.println("Sum of positive numbers = " + sum);

    }

    public void negatNum(int[] mas) {
        int negativ = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0)
                negativ++;
        }
        System.out.println("Negative numbers in the array : " + negativ);
    }

    public void npmas(int[] mas) {
        int negativ = 0;
        int positive = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0)
                negativ++;
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0)
                positive++;
        }
        if (negativ > positive)
            System.out.println("Negative numbers more than positive ones " + negativ);
        else
            System.out.println("Positive numbers more than negative ones " + positive);
    }

    public static void main(String[] args) {
        int[] mas = {
                5, 8, 25, -4, 22, -12, 11, -6, 9, -1
        };
        Task1 tas = new Task1();
        tas.maxmas(mas);
        tas.summas(mas);
        tas.negatNum(mas);
        tas.npmas(mas);
    }
}
