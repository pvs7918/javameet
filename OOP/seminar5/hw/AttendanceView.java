/*
Создайте класс AttendanceView, который позволяет отображать студентов
и их посещаемость.
*/
package OOP.seminar5.hw;

import java.util.*;

public class AttendanceView {

    public int showMenuAndChooseItem() {
        // показать меню в консоли
        System.out.println("Выберите нужный отчет:");
        System.out.println("1. Распечатать всех студентов и посещаемость каждого в %");
        System.out.println("2. Распечатать студентов, по убыванию посещаемости");
        System.out.println("3. Распечатать студентов с посещаемостью ниже 25%");
        int n =-1;
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("введите число от 1 до 3: ");
            n = sc.nextInt();
            if (n < 1 && n > 3) {
                System.out.printf("Введите целое число от 1 до 3\n");
                n = -1;
            }
            sc.close();
        }
        catch (NoSuchElementException exception) {
            System.out.println("Ошибка чтения пункта меню");
        }
        
        return n;
    }

    public void ShowResult(List<Student> students) {
        System.out.println("\nВывод результата:\n");
        for (Student item : students) {
            System.out.println(item.getFioWithAttendancePercent());
        }
    }


}
