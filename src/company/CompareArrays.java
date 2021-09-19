package company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareArrays {
    //Задача
    // Сравнить массивы
    public static void main(String[] args) {
        int[] firstArray=new int[]{1,2,3,4,5,6,7,8};
        int[]secondArray=new int[]{1,2,3,4,5,6,7,8};
        System.out.println(Arrays.equals(firstArray,secondArray));
    }
}
