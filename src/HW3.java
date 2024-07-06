/*
Домашнее задание 3
Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива и возвращающии новый массив, каждый элемент которого равен
разности элементов двух входящих массивов в той же ячейке.
Если длина массивов не равны, необходимо как-то оповестить полбзователя.
 */

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        /*
        Норма
         */
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 6};

        /*
        Исключение
         */
        int [] arr3 = {1, 2, 3};
        int [] arr4 = {4, 5};

        try {
            int[] result = diffArrays(arr1, arr2);
            System.out.println("Массив имеет одинаковую длину: " + Arrays.toString(result));
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }




        try {
            int[] result = diffArrays(arr3, arr4);
            System.out.println(Arrays.toString(result));
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int[] diffArrays(int[] arr1, int[] arr2) throws IllegalArgumentException{
        if(arr1.length != arr2.length){
            throw new IllegalArgumentException("Массив имеет разную длину!!!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
