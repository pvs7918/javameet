/*
Создайте класс AttendanceView, который позволяет отображать студентов
и их посещаемость.
*/
package OOP.seminar5.hw;

import java.util.*;

public class AttendanceView {

    public void showMenu() {
        // показать меню в консоли
        System.out.println("\nБД студентов\n------------\nВыберите нужный отчет:");
        System.out.println("1. Распечатать всех студентов и посещаемость каждого в %;");
        System.out.println("2. Распечатать студентов, по убыванию посещаемости;");
        System.out.println("3. Распечатать студентов с посещаемостью ниже 25%;");
        System.out.println("0. Выход.");
    }

    public void ShowResult(List<Student> students) {
        System.out.println("\nВывод результата\n----------------");
        for (Student item : students) {
            System.out.println(item.getFioAndAttendancePercent());
        }
    }

}
