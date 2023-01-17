/*
Создайте класс Presenter со следующими функциями:
• Распечатать всех студентов и посещаемость каждого в процентах;
• Распечатать студентов, отсортировав их по убыванию посещаемости
(вверху самые посещающие);
• Распечатать студентов с посещаемостью ниже 25%.
*/

package OOP.seminar5.hw;

public class Presenter {
    AttendanceService model;
    AttendanceView view;

    public Presenter(AttendanceService model, AttendanceView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        //загружаем данные в модель из файла
        model.loadFormFile();
        
        int menuItem;
        while(true) {
            //показываем пользователю меню и выбираем его
            menuItem = view.showMenuAndChooseItem();
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
        }
    }

    //Распечатать всех студентов и посещаемость каждого в процентах
    private void showAllStudentsWithAttendance() {
        view.ShowResult(model.getAllRecords());
    }
}
