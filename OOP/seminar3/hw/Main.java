/* Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
1.	Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.
2.	Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.
3.	Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
• Он отслеживает текущую позицию в переборе
• Он изначально выставлен на конечную позицию
• Он движется справа налево
Проверьте, как он работает.
*/

package OOP.seminar3.hw;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // создаем коллекцию студентов - группу
        StudentGroup group = new StudentGroup(Arrays.asList(
                new Student("Павел",
                        LocalDate.of(2022, 12, 1), 4.4f),
                new Student("Степан",
                        LocalDate.of(2022, 12, 23), 3.4f),
                new Student("Мария",
                        LocalDate.of(2022, 11, 5), 4f),
                new Student("Максим",
                        LocalDate.of(2022, 10, 10), 3f)));

        // проходим по списку туда и обратно с помощью двухстороннего итератора
        // начальная позиция итератора в списке - 2
        ListIterator<Student> twoSidedIter = group.listIterator(2);
        System.out.println("Первый проход по списку:");
        while (twoSidedIter.hasNext()) {
            System.out.println(twoSidedIter.next());
        }
        System.out.println("Обратный проход по списку:");
        while (twoSidedIter.hasPrevious()) {
            System.out.println(twoSidedIter.previous());
        }

        // Проходим по списку с помощью реверсного итератора
        Iterator<Student> iterator = group.descendingIterator();
        System.out.println("Вывод списка в обратном порядке:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
