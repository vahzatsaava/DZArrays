package company;

import java.util.Arrays;
import java.util.Scanner;

public class UserEnterArray {
    public static void main(String[] args) {
        //Пользователь должен вводить с клавиатуры количество элементов
        // масива, после этого произвести ввод этих элементов, при этом
        // значение массива должно быть в диапазона от -10 до 10.
        // Если пользователь вводит число, не находящееся в этом диапазоне, то попросить
        // пользователя ввести число еще раз
        System.out.println("Введите колличество Элементов");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите значение элементов");
        int max = 10;
        int min = -10;
        int[] userArray = new int[number];

        for (int i = 0; i < userArray.length; i++) {
            Scanner scanner1=new Scanner(System.in);
            int userNumber=scanner1.nextInt();

            while (userNumber<10){
                userArray[i]=userNumber;
                break;
            }
        }
        System.out.println("Выводим массив");
        for (int i = 0; i < userArray.length; i++) {
            System.out.println(userArray[i]);
        }
        System.out.println("Выводим массив в строку");
        String arrayString = Arrays.toString(userArray);
        System.out.println(arrayString);
    }
}
