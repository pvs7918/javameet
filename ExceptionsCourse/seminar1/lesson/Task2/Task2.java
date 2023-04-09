/*1. Реализуйте метод, принимающий в качестве аргумента целочисленный
двумерный массив. 
Необходимо посчитать и вернуть сумму элементов этого массива. 
При этом накладываем на метод 2 ограничения: метод может работать только
с квадратными
массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1. 
Если нарушается одно из условий, метод должен бросить RuntimeException с 
cообщением об ошибке.*/

package ExceptionsCourse.seminar1.lesson.Task2;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = {{1,0,1},{0,0,1},{1,1,1}};
       
        int res = getArrayProperties2(arr);
        System.out.print("Сумма элементов массива: " + res);
    }

    public static int getArrayProperties2(int [][]arr) {
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Размерности массива не равны");
        }
        int sum = 0;
        for (int i=0; i<arr.length;i++) {
            for (int j=0; j<arr.length;j++) {
                if (arr[i][j]!=0 && arr[i][j]!=1) {
                    throw new RuntimeException("Элемент массива должен быть равен 0 или 1!");    
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
