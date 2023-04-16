/*
 * 2. Если необходимо, исправьте данный код (задание 2
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

/*
 * Что сделано:
 * Добавлены два Exception: NullPointerException, IndexOutOfBoundsException
 * Добавлено определение массива int intArray[] в трех вариантах: верное и 2 с ошибкой
 */
package ExceptionsCourse.seminar2.hw.Task2;

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            // объявление intArray
            // 1. правильное.
            int intArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            // 2. с ошибкой, так как дальше идет обращение к intArray[8], для
            // IndexOutOfBoundsException
            // int intArray[] = {1,2,3,4,5,6,7};
            // 3. для имитации исключения - NullPointerException
            // int intArray[] = null;

            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя: " + e);
        } catch (NullPointerException e) {
            System.out.println("Обьект не задан - null: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ссылка на несуществующий элемент массива: " + e);
        }
    }
}
