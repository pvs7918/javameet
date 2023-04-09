/*1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.

Напишите метод, в котором реализуйте взаимодействие с пользователем.
То есть, этот метод запросит искомое число у пользователя, вызовет первый,
обработает возвращенное значение и покажет читаемый результат пользователю.
Например, если вернулся -2, пользователю выведется сообщение:
“Искомый элемент не найден”.*/

package ExceptionsCourse.seminar1.lesson.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int val = sc.nextInt();
                
        int[] arr = {1,2,0,5,10,1};
       
        int res = getArrayProperties(val, arr);
        if (res == -1) {
            System.out.println("длина массива меньше некоторого заданного минимума");
        } 
        if (res == -2) {
            System.out.println("искомый элемент не найден");
        }
        if (res == -3) {
                System.out.println("исходный массив не задан");
        }
        if (res >= 0) {
            System.out.println("исходный массив не задан");
        }        
        
        sc.close();
    }

    public static int getArrayProperties(int val, int []arr) {
        int minlen = 5;
        // 3
        if (arr == null) return -3;
        // 1
        if (arr.length < minlen) {
            return -1;
        }
        boolean isFinded = false;
        for (int i=0; i<arr.length;i++) {
            if (arr[i]==val) {
                isFinded = true;
                return i;
            }
        }
        return -2;
    }
}
