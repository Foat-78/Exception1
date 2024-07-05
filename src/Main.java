import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый вариант исключения");
        if (getFileSize(new File("/Users/ADMIN/Desktop/Studi")) == -1){
            System.out.println("Такой файл не существует!!!");
        } else System.out.println("Размер файла: " + getFileSize(new File("/Users/ADMIN/Desktop/Studi")));
        System.out.println();
        System.out.println("Второй вариант исключения");
        System.out.println(divide(10,0));

    }
    public static long getFileSize(File file){
        if (!file.exists()){
            return -1;
        }
        return file.length();
    }

    public static int divide(int a1, int a2){
        if (a2 == 0){
            throw new RuntimeException("На ноль делить нельзя!!!");
        }
        return a1/a2;
    }
}