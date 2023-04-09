/*
Создайте класс Presenter со следующими функциями:
• Распечатать всех студентов и посещаемость каждого в процентах;
• Распечатать студентов, отсортировав их по убыванию посещаемости
(вверху самые посещающие);
• Распечатать студентов с посещаемостью ниже 25%.
*/

package OOP.seminar7.hw;

import java.util.*;

import OOP.seminar7.hw.model.*;
import OOP.seminar7.hw.view.AgentView;

public class Presenter {
    AgentModel model;
    AgentView view;

    public Presenter(AgentModel model, AgentView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int menuItem = -1;

        // загружаем данные об агентах в модель из исходного файла
        model.load();
        //загружаем меню и через сканер получаем выбор нужного пункта меню
        Scanner sc = new Scanner(System.in);
        String cur_menu_pos = ""; //текущее меню в формате "1,2" пустая строка означает выбрано главное меню
        String cur_action = ""; //выбранное действие в текущем меню
        while (true) {
            //отображение выбранного пункта меню
            switch(cur_menu_pos) {
                case(""): //главное меню
                    switch(cur_action) {
                        case(""):
                            view.showMainMenu();
                            break;
                    }

                        view.showMainMenu();
                    break;
                case(""):
            }
            System.out.printf("Введите число для выбора нужного пункта меню: ");
            // выбираем пункт меню
            try {
                
                if (sc.hasNextInt()) {
                    menuItem = sc.nextInt();
                    if (menuItem < 1 && menuItem > 6) {
                        // -1 считается что пункт меню выбран неверно, меню загружается повтороно для
                        // выбора
                        menuItem = -1;
                    }
                } else {
                    // означает выход из программы
                    menuItem = 0;

                }
            } catch (NoSuchElementException exception) {
                System.out.println("Ошибка чтения пункта меню");
            }


            switch (menuItem) {
                case 1:
                    showAllAgents();
                    break;
                case 2:
                    showAllStudentsSortDescByAttendance();
                    break;
                case 3:
                    showAStudentsAttendanceLess(25);
                    break;
            }
            if (cur_menu_pos == "0") {
                System.out.println("Программа завершена.");
                sc.close();
                break;
            }
        }
    }

    // Распечатать всех студентов и посещаемость каждого в процентах
    private void showAllAgents() {
        view.ShowResult(model.getAgentsAll());
    }

    /*
     * Распечатать студентов, отсортировав их по убыванию посещаемости
     * (вверху самые посещающие);
     */
    private void showAllStudentsSortDescByAttendance() {
        view.ShowResult(model.getStudentsAllSortedDescByAttendance());
    }

    // Распечатать студентов с посещаемостью ниже чем border%.
    private void showAStudentsAttendanceLess(int border) {
        view.ShowResult(model.getStudentsAttendanceLess(border));
    }
}
