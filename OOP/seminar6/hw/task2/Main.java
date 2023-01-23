/*Задача 2. Есть два самодельных класса коллекций:

ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах
не меняется. Методы:
• getSize ()
• get (int i)

MutableList<T> — коллекция, которая допускает изменения. Методы:
• getSize ()
• get (int i)
• set (int i, T newValue)
• add (T newValue)
• remove (T value)

Реализуйте такую схему наследования между двумя этими классами,
которая будет соответствовать принципу подстановки Лисков.
*/
package OOP.seminar6.hw.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("Алексей",
                "Павел", "Антон", "Александр", "Евгений"));
        List<String> list2 = new ArrayList<>(List.of("Алексей", "Евгений"));

        ImmutableList imutList = new ImmutableList<>(list1);
        System.out.println("Исходный ImmutableList:");
        System.out.println(imutList.toString());
        System.out.printf("Размер коллекции Immutable: %d\n", imutList.getSize());
        System.out.printf("Значение элемента %d = %s\n", 2, imutList.get(2));

        MutableList mutList = new MutableList<>(list2);
        System.out.println("Исходный MutableList:");
        System.out.println(mutList.toString());
        System.out.printf("Значение элемента %d: %s\n", 1, mutList.get(1));
        mutList.set(1, "Степан");
        System.out.printf("Установлено значение %s: для элемента %d\n", "Степан", 2);
        System.out.println("Добавлено 3 новых значения в конец списка.");
        mutList.add("Света");
        mutList.add("Марина");
        mutList.add("Сергей");
        System.out.println("Список после добавления элементов:");
        System.out.println(mutList.toString());
        System.out.printf("Значение элемента %d = %s\n", 2, mutList.get(2));

        System.out.printf("Удалён элемент списка: %s\n", "Сергей");
        mutList.remove("Сергей");

        System.out.println("Результат:");
        System.out.println(mutList.toString());
    }
}