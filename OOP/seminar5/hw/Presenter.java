/*
Создайте класс Presenter со следующими функциями:
• Распечатать всех студентов и посещаемость каждого в процентах;
• Распечатать студентов, отсортировав их по убыванию посещаемости
(вверху самые посещающие);
• Распечатать студентов с посещаемостью ниже 25%.
*/

package OOP.seminar5.hw;

import java.util.*;

public class Presenter {
    AttendanceService model;
    AttendanceView view;

    public Presenter(AttendanceService model, AttendanceView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int menuItem = -1;

        //загружаем данные в модель из файла
        model.loadFormFile();

        Scanner sc = new Scanner(System.in);
        while(true) {
            //выводим меню
            view.showMenu();
            //выбираем пункт меню
            try {
                System.out.printf("Введите число от 1 до 3: ");
                if (sc.hasNextInt()) {
                    menuItem = sc.nextInt();
                    if (menuItem < 1 && menuItem > 3) {
                        // -1 считается что пункт меню выбран неверно, меню загружается повтороно для выбора
                        menuItem = -1;
                    }
                }
                else {
                    //означает выход из программы
                    menuItem = 0;
                    
                }
            }
            catch (NoSuchElementException exception) {
                System.out.println("Ошибка чтения пункта меню");
            }

            switch(menuItem) {
                case 1:
                    showAllStudentsWithAttendance();
                    break;
                case 2:
                    //showAllStudentsWithAttendance();
                    break;
                case 3:
                    //showAllStudentsWithAttendance();
                    break;
            }
            if (menuItem == 0){
                System.out.println("Программа завершена.");
                break;
            }
        }
        sc.close();
    }

    //Распечатать всех студентов и посещаемость каждого в процентах
    private void showAllStudentsWithAttendance() {
        view.ShowResult(model.getAllRecords());
    }
}
