/*
2.	Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
package seminar4.hw;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class task2 {
    public static void main(String[] args) {
        int Count = 7;
        int MaxValue = 10;
        LinkedList<Integer> lst = new LinkedList<>();
        for (int i = 0; i < Count; i++) {
            int curValue = new Random().nextInt(MaxValue);
            // вызов метода enqueue - добавление в конец списка
            boolean status = enqueue(lst, curValue);
            if (!status) {
                System.out.printf("Ошибка при добавлении %d в конец списка", curValue);
            }
        }
        System.out.println("Исходный список после наполнения:");
        System.out.println(lst);

        // удаляем 3 элемента списка методом dequeue
        for (int i = 0; i < 3; i++) {
            System.out.printf("Значение первого элемента списка = %d\n", first(lst));

            int DeletedVal = dequeue(lst);
            System.out.printf("Из начала списка удален элемент: %d\n", DeletedVal);

            System.out.println("список после применения dequeue:");
            System.out.println(lst);

        }
        System.out.println("Программа выполнена!");
    }

    /**
     * @param lst
     * @param newValue
     * @return
     */
    public static boolean enqueue(LinkedList<Integer> lst, Integer newValue) {
        // добавление значения в конец очереди
        // возвращает статус операции добалвения элемента в конец списка
        try {
            lst.addLast(newValue);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static Integer dequeue(LinkedList<Integer> lst) {
        // возвращает первый элемент из очереди и удаляет его
        return lst.removeFirst();
    }

    public static Integer first(LinkedList<Integer> lst) {
        // возвращает значение первого элемента списка
        return lst.get(0);
    }
}
