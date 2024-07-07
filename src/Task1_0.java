/*
Задание №0
- Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
- Если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве
 кода ошибки, иначе - длину массива.
*/

public class seminar1_0 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int minLength = 3;
        int result = checkArrayLength(arr,minLength);
        System.out.println(result);
    }
    public static int checkArrayLength(int[] arr, int minLength){
        if(arr.length < minLength){
            return -1;
        }
        else {
            return arr.length;
        }
    }
}
