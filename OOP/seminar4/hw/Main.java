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
                1, 3, 5, 7, 9, 0, 2, 10, 15, 65);
        List<String> names = Arrays.asList(
                "Иван", "Степан", "Павел", "Дмитрий", "Александр", "Евгений");

        System.out.println("Исходные списки:");
        for(Integer number: numbers)
            System.out.println(number);

        //Фильтруем и выводим отфильтрованные списки
        IsEven even = new IsEven<>();
        List<Integer> evenNumbers = filter(numbers, IsEven);
    }

    public <T> List<T> filter(List<T> list, IsGood<T> approver) {
        List<T> resList = new ArrayList<>();
        for(T listItem: list) {
            if(approver.isGood(listItem))
                resList.add(listItem);
        }
    }
}
