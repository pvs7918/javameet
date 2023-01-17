/*
Создайте класс AttendanceService (сервис посещаемости),
в котором хранится информация обо всех студентах
*/

/*Класс AttendanceService это по сути модель в парадигме MVP */

package OOP.seminar5.hw;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.*;

public class AttendanceService {
    private List<Student> students; // список всех студентов
    private String filename; // название файла с исходными данными

    public AttendanceService(String filename) {
        this.filename = filename;
    }

    public void loadFormFile() {
        // считывание данных о студентах из файла
        students = new ArrayList<>();
        // открываем и читаем данные из файла

        try (FileReader fr = new FileReader(filename)) {
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()) {
                // создаем экземпляр студента
                // читаем данные о студенте до пустой строки или конца файла
                String curFIO = scanner.nextLine();
                // читаем строки посещаемости
                List<Pair<LocalDate, Boolean>> attendances = new ArrayList<>();

                while (scanner.hasNextLine()) {
                    String curAttendRecord = scanner.nextLine();
                    if (curAttendRecord != "") {
                        String[] curArray = curAttendRecord.split(",");
                        attendances.add(new Pair(LocalDate.parse(curArray[0].trim()),
                                Boolean.parseBoolean(curArray[1].trim())));
                    } else {
                        //добавляем в список объект класса Student
                        if (curFIO != "" && attendances.size() > 0) {
                            students.add(new Student(curFIO, attendances));
                            // после добавления записи ФИО обнуляем,
                            // чтобы предотвратить повторное добавление этой записи
                            curFIO = ""; 
                            break;
                        }
                    }
                }
                //добавляем в список объект класса Student
                if (curFIO != "" && attendances.size() > 0) {
                    students.add(new Student(curFIO, attendances));
                    break;
                }
            }
            scanner.close();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }

    //возврат полного списка студентов без фильтрации и доп.упорядочивания
    public List<Student> getAllRecords() {
        return students;
    }

    @Override
    public String toString() {
        String res = "";
        for (Student item : students) {
            res += item.toString();
        }
        return "Students list: [" + res + "]";
    }
}
