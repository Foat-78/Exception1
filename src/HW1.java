/*
Домашнее задание 1
1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения:
- ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 - выход за пределы массива
- ArithmeticException: / by zero - делить на 0 нельзя
- NumberFormatException: For input string: "s" - конвертировать строку в число нельзя
 */

import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3, 4};
            test1(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            test2(10,0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            test3("s");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }

        System.out.println("**********************************");

        System.out.println("Исключение 1");
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(test1(arr)));

//        System.out.println("Исключение 2");
//        System.out.println(test2(10,0));

//        System.out.println("Исключение 3");
//        System.out.println(test3("s"));

    }

    public static int[] test1(int[]arr){
        for (int i = 0; i < 5; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public static int test2(int a, int b){
        return a/b;
    }

    public static int test3(String a){
        return Integer.parseInt(a);
    }


}
