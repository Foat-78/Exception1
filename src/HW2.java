/*
Домашнее задание
2. Посмотрите код и подумайте сколько разных типов исключений вы тут
сможете получить?
 */

public class HW2 {
    public static void main(String[] args) {
        /*
        2 Задание
        */
//        System.out.println(sum2d());
    }
    /*
    2 Задание
     */
    public static int sum2d(String[][]arr){
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
