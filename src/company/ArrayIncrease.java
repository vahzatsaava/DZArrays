package company;

import java.util.Arrays;
import java.util.Random;

public class ArrayIncrease {
    private static int increseArrays(int[] array, int value) {
        int[] secondArray = new int[value];
        secondArray = Arrays.copyOf(array, value);
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }
        return value;
    }

    public static void main(String[] args) {
        int[] firstArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(10);
            System.out.println(firstArray[i]);
        }
        System.out.println("Метод увеличенивающий массив");
        increseArrays(firstArray, 15);
    }
}
