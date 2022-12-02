/*
 Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая — последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.

 */
package seminar4.lesson;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.setProperty("console.encoding","cp866");
        Scanner scanner = new Scanner(System.in, "cp866");
        ArrayDeque<String> lst = new ArrayDeque<>();

        while(true) {
            System.out.println("Введите значение элемента:");
            String input = scanner.nextLine();
            if (input.equals("quit")) 
                break;

            if (input.equals("print")) {
                // выводит строки так, чтобы последняя введенная
                // была первой в списке, а первая — последней.
                if (lst.size() > 1) {
                    String first = lst.pollFirst();
                    String last = lst.pollLast();

                    lst.addFirst(last);
                    lst.addLast(first);
                } else {
                    System.out.println("Размер списка слишком мал для данной операции.\nДобавьте ещё один элемент.");
                }

            } else if (input.equals("revert")) {
                // Если введено revert, удаляет предыдущую введенную строку из памяти.
                lst.pollLast();

            } else {
                lst.addLast(input);
            }

            System.out.println(lst);
        }
        scanner.close();
    }
}
