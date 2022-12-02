/*
3*. Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
Например:
5 4 3 - + => 5 1 + => 6
 */
package seminar4.hw;

import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> lst = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение вида text~num:");
            String input = scanner.nextLine();

            String[] substr = input.split("~");
            int index = Integer.parseInt(substr[1]);

            if (index > lst.size() || index < 0) {
                System.out.println("некоректное значение num");
            } 
            else if (substr[0].equals("print")) 
            {
                System.out.println(lst.get(index));
                lst.remove(index);
            } else {
                lst.add(index, substr[0]);
            }

            System.out.println(lst);
        }
        scanner.close();
    }
}
