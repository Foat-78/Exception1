/*
Домашнее задание 2
2. Посмотрите код и подумайте сколько разных типов исключений вы тут
сможете получить?
- NumberFormatException: For input string: "s" - конвертировать строку в число нельзя
- ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 - выход за пределы массива
- NullPointerException: Cannot read the array length because "arr" is null - прочитать массив не смогли
 */

public class HW2 {
    public static void main(String[] args) {
        /*
        2 Задание
        */
//        String[][] arr = {{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "s"}};
//        System.out.println(sum2d(arr));

//        String[][] arr1 = {{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
//        System.out.println(sum3d(arr1));

        String[][] arr3 = null;
        System.out.println(sum3d(arr3));
    }
    /*
    2 Задание
     */
    public static int sum2d(String[][]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static int sum3d(String[][]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
