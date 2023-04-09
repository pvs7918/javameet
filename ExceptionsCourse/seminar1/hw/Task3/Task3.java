// Выполнил Сергиенко Павел Викторович студент курса Разработчик, GB.
/*
3. Реализуйте метод, принимающий в качестве аргументов 
два целочисленных массива, и возвращающий новый массив, каждый элемент
которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

package ExceptionsCourse.seminar1.hw.Task3;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 6, 3, 10, 4 };
        System.out.println("arr1:");
        printArr(arr1);
        int[] arr2 = { 4, 6, 4, 7, 0 };
        System.out.println("arr2:");
        printArr(arr2);
        int[] arr3 = { 4, 6, 4, 7 }; // массив другой длины
        System.out.println("arr3:");
        printArr(arr2);
        System.out.println("Результат (arr1 - arr2)):");
        int[] arr4 = ArraysDiff(arr1, arr2);
        printArr(arr4);
        System.out.println("Результат (arr1 - arr3)):");
        int[] arr5 = ArraysDiff(arr1, arr3); // срабатывает исключение RuntimeException
        printArr(arr5);
    }

    public static int[] ArraysDiff(int[] arrA, int[] arrB) {
        // метод возвращает массив, где каждый элемент равен разности
        // элементов входных массивов
        if (arrA.length != arrB.length) {
            throw new RuntimeException("\nРазмеры массивов не равны!\n");
        }
        int[] ArrRes = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            ArrRes[i] = arrA[i] - arrB[i];
        }
        return ArrRes;
    }

    public static void printArr(int[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if (i < arr.length - 1) {
                res += " ";
            }
        }
        System.out.println(res);
    }
}
