/*
Задание №1
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1 в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
Напишите метод, в котором реализуете взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый метод, обработает
возвращенное значение и покажет читаемый результат пользователю. Например, если
вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
 */

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6, 7};
        int minLength = 4;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите искомое значение: ");
        int value = in.nextInt();
        int val = indexValueArray(arr, value, minLength);
        if (val == -1){
            System.out.println("Длина массива менше заданного значения - " + minLength);
        }else if (val == -3){
            System.out.println("Массив пустой");
        }else if (val == -2){
            System.out.println("Заданное значение в массиве отсутсвует");
        }else
            System.out.println("Заданное значение в массиве находится под индексом - " + val);
    }


    public static int indexValueArray(int[] arr, int value, int minLength){
        if (arr.length < minLength){
            return -1;
        } else if (arr == null){
            return -3;
        }else
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value){
                    return i + 1;
                }
            }
        return -2;
    }
}
