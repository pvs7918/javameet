// Выполнил Сергиенко Павел Викторович студент курса Разработчик, GB.
/* 
4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов двух
входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
как-то оповестить пользователя. Важно: При выполнении метода единственное
исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
*/

package ExceptionsCourse.seminar1.hw.Task4;

public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 6, 3, 10, 4 };
        System.out.println("arr1:");
        printArr(arr1);
        int[] arr2 = { 4, 6, 4, 7, 2 };
        System.out.println("arr2:");
        printArr(arr2);
        int[] arr3 = { 4, 6, 4, 7 }; // массив другой длины
        System.out.println("arr3:");
        int[] arr3_2 = { 5, 2, 0, 6, 9 }; // массив содержит 0
        System.out.println("arr3_2:");
        printArr(arr3_2);
        System.out.println("Результат (arr1 / arr2)):");
        int[] arr4 = ArraysDivide(arr1, arr2);
        printArr(arr4);
        // срабатывает исключение RuntimeException - размеры массивов не равны
        System.out.println("Результат (arr1 / arr3)):");
        int[] arr5 = ArraysDivide(arr1, arr3);
        printArr(arr5);
        // срабатывает исключение RuntimeException, деление на 0
        System.out.println("Результат (arr1 / arr3_2)):");
        int[] arr6 = ArraysDivide(arr1, arr3_2); 
        printArr(arr6);
    }

    public static int[] ArraysDivide(int[] arrA, int[] arrB) {
        // метод возвращает массив, где каждый элемент равен разности
        // элементов входных массивов
        if (arrA.length != arrB.length) {
            throw new RuntimeException("\nРазмеры массивов не равны!\n");
        }
        int[] ArrRes = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            if (arrB[i] == 0) {
                throw new RuntimeException(
                        "\n" + i + "-й элемент 2-го массива равен 0, это недопустимо при делении!\n");
            }
            ArrRes[i] = arrA[i] / arrB[i];
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
