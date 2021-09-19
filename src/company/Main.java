package company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // ЗАДАЧА
    // Сделать реверс массива.
    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int numb = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = numb;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        int[] arrayOfNumber = new int[]{4, 1, 5, 6, 7, 3, 2, -1, -2};

        int size = arrayOfNumber.length;

        System.out.println("Выводим первоначальный массив");

        for (int i = 0; i < size; i++) {
            System.out.println(arrayOfNumber[i]);
        }
        System.out.println("Выводим Реверс");

        sortArray(arrayOfNumber);
        printArray(arrayOfNumber);

    }
}

