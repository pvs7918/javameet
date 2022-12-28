/* Урок 4. ООП: Обобщения. ч1
1.	Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);
Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
Создайте следующие детские классы:
• IsEven — ему дают целое число, он одобряет его, если оно чётное
• IsPositive — ему дают целое число, он одобряет его, если оно положительное
• BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
• BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет,
что она начинается с того, что он запомнил
2.	Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа,
и одобрятель IsGood.
Функция возвращает новую коллекцию, куда входят только одобренные
элементы из коллекции.
Продемонстрируйте, что это работает.
*/

package OOP.seminar4.hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                1, -12, 5, -7, 9, 0, 2, 10, 15, 65);
        List<String> names = Arrays.asList(
                "Иван", "Алексей", "Павел", "Антон", "Александр", "Евгений");

        System.out.println("Исходный список #1(int):");
        for (Integer number : numbers)
            System.out.println(number);

        // применяем фильтр isEven только четные числа
        Iterable<Integer> evenNumbers = filter(numbers, new IsEven());
        System.out.println("Отфильтрованный список #1 -только целые:");
        for (Integer number : evenNumbers)
            System.out.println(number);

        // применяем фильтр isPositive только четные числа
        Iterable<Integer> positiveNumbers = filter(numbers, new IsPositive());
        System.out.println("Отфильтрованный список #1 -только положительные:");
        for (Integer number : positiveNumbers)
            System.out.println(number);

        System.out.println("Исходный список #2(String):");
        for (String name : names)
            System.out.println(name);

        // применяем фильтр BeginsWith только четные числа
        String sample = "Алекс";
        Iterable<String> filteredNames = filter(names, new BeginsWith(sample));
        System.out.println("Отфильтрованный список #2 - начинаются с \"" + sample + "\"");
        for (String name : filteredNames)
            System.out.println(name);

        // применяем фильтр BeginsWithA только четные числа
        Iterable<String> filteredNames2 = filter(names, new BeginsWithA());
        System.out.println("Отфильтрованный список #2 - начинаются с A");
        for (String name : filteredNames2)
            System.out.println(name);
    }

    // filter - Обобщенный метод фильтрации списков с помощью одобрятеля approver
    // имеющего разные типы фильтрации, реализованные с помощью классов, наследуемых
    // от интерфейса isGood
    public static <T> Iterable<T> filter(Iterable<T> list, IsGood<T> approver) {
        // вместо List используем Iterable, потому что все коллекции наследуют от
        // Iterable
        List<T> resList = new ArrayList<>();
        for (T listItem : list) {
            if (approver.isGood(listItem))
                resList.add(listItem);
        }
        return resList;
    }
}
