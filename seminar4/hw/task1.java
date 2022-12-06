/*
1.	Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
который вернет “перевернутый” список.
 */
package seminar4.hw;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        // Создаем и наполняем случайными значениями исходный LinkedList
        int Count = 7;
        int MaxValue = 10;
        LinkedList<Integer> lst = new LinkedList<>();
        for (int i = 0; i < Count; i++) {
            lst.add(new Random().nextInt(MaxValue));
        }
        System.out.println("Исходный список:");
        System.out.println(lst);

        // Вызываем метод переворачивающий список
        LinkedList<Integer> newLst = turnLinkedList(lst);

        System.out.println("Результат - перевернутый список:");
        System.out.println(newLst);
    }

    public static LinkedList<Integer> turnLinkedList(LinkedList<Integer> lst) {
        // метод переворачивает список через стек
        Deque<Integer> stack = new ArrayDeque<>();

        // помещаем значения из исходного списка в стек
        for (var item : lst) {
            stack.addLast(item.intValue());
        }

        LinkedList<Integer> newLst = new LinkedList<>();
        while (!stack.isEmpty()) {
            newLst.add(stack.pollLast());
        }
        return newLst;
    }
}
