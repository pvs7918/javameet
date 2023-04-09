// Выполнил Сергиенко Павел Викторович студент курса Разработчик, GB.
/*1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.*/

package ExceptionsCourse.seminar1.hw.Task1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        // вызов метода 1 - деление на 0
        float a = 10;
        float b = 0;

        float res = method1(a, b);

        System.out.printf("Результат деления %.1f на %.1f: %.1f\n", a, b, res);
        // вызов метода 2
        int[] arr = { 5, 6, 3, 10, 4 };
        int[] arr2 = null;
        int maxIndex = method2(arr2);
        System.out.println("Индекс максимального элемента массива: " + maxIndex);

        // вызов метода 3
        String fileName = "./ExceptionsCourse/seminar1/hw/Task1/file.txt";
        try {
            method3(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("\nОшибка! Файл " + fileName + " не найден!");
        } catch (IOException e) {
            System.out.println("\nОшибка чтения файла: " + e.getMessage());
        }
    }

    public static float method1(float a, float b) {
        // деление 2-х чисел
        if (b == 0) {
            throw new ArithmeticException("\nОшибка! Нельзя делить на 0!\n");
        } else {
            return a / b;
        }
    }

    public static int method2(int[] arr) {
        // метод ищет максимальный элемент и возвращает его индекс
        if (arr == null) {
            throw new NullPointerException("Ошибка! Массив не задан - null!");
        }
        int maxi = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxi]) {
                maxi = i;
            }
        }
        return maxi;
    }

    public static void method3(String fileName) throws IOException {
        // метод считывает и вывод в консоль файл построчно
        // try {

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String fileString = reader.readLine();
        while (fileString != null) {
            System.out.println(fileString);
            // считываем остальные строки в цикле
            fileString = reader.readLine();
        }

        /*
         * } catch (FileNotFoundException e) {
         * System.out.println("Ошибка! Файл " + fileName + "не найден!");
         * } catch (IOException e) {
         * System.out.println("Ошибка чтения файла: " + e.getMessage());
         * }
         */

    }
}
