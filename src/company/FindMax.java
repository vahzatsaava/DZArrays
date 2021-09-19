package company;

public class FindMax {
    //Найти максимальный и минимальный элементы массива
    private static int[] maxValue(int[] array) {
        int max=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
        return array;
    }
    public static void main(String[] args) {


        System.out.println("Максимальное значение");
        int[] arrays = new int[]{9, 34, 234, 45, 4, 6, 6, 32, 1, 34, 45, 234345, 4};

        maxValue(arrays);//вызов методов
    }

}
