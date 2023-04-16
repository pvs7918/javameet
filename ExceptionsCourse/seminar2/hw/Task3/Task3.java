/*
 * Дан следующий код, исправьте его там, где требуется (задание 3
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

 /*
  * Что сделано:
  * в методе printSum убрал в сигнатуре throws FileNotFoundException, потому что в методе
  * нет обработки файла и бесмысленно обрабатывать исключение,
  * которое метод никогда не выбросит.
  * в main добавил catch (ArithmeticException ex) - для обработки деления на 0.
  * catch (Throwable ex) убрал ниже, так это исключение иерархии классов выше чем 
  * ArithmeticException, NullPointerException, IndexOutOfBoundsException.
  */
package ExceptionsCourse.seminar2.hw.Task3;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
     }
     public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
     }
}
