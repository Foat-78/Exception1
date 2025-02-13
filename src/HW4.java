/*
Домашнее задание 4
Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива и возвращающий новый массив, каждый элемент которого равен
частному элементу двух входящих массивов в той же ячейке. Если длины
массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое
пользователь может увидеть - RuntimeException, т.е. ваше
 */


import java.util.Arrays;

public class HW4 {
    public static void main(String[] args) {
/*
        Норма
         */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 0, 6};

        /*
        Исключение
         */
        int[] arr3 = {8, 20, 18};
        int[] arr4 = {4, 5, 6};

        try {
            int[] result = divArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        try {
            int[] result = divArrays(arr3, arr4);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] divArrays(int[] arr1, int[] arr2) throws RuntimeException {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массив имеет разную длину!!!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на 0!!!");
            } else {
                result[i] = arr1[i] / arr2[i];
            }
        }
        return result;
    }
}
