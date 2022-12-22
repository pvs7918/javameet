/*Имеются данные о группе студентов. У каждого студента
есть средний балл (например, 4.6).
Создайте родительский класс ЗаписывательВФайл.
Создайте три детских класса, которые записывают
в файл информацию о студентах в разных формах:

Просто текст:

Иван Иванов=4.8
Мария Кузнецова=5.0
Степан Кузьмин=3.6

JSON:

{
"Иван Иванов": 4.8,
"Мария Кузнецова": 5.0,
"Степан Кузьмин": 3.6
}

XML:

<?xml version="1.0" encoding="utf-8" ?>
<students>
<student>
<name>Иван Иванов</name>
<grade>4.8</grade>
</student>
<student>
<name>Мария Кузнецова</name>
<grade>5.0</grade>
</student>
<student>
<name>Степан Кузьмин</name>
<grade>3.6</grade>
</student>
</students>
*/

package OOP.seminar2.hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // формируем список исходных данных
        List<Student> students = Arrays.asList(
                new Student("Иван Иванов", 4.8f),
                new Student("Мария Кузнецова", 5.0f),
                new Student("Степан Кузьмин", 3.6f));

        // вывод исходного списка в консоль (для отладки/контроля)
        for (Student student : students) {
            System.out.println(student); // по умолчанию вызывается переопределенный метод Student.ToString();
        }

        String folder = "./OOP/seminar2/hw/Files/"; // путь относительно корневого каталога проекта JavaMeet

        // формируем простой текстовый файл
        WriterToFileText writerText = new WriterToFileText(folder + "students.txt");
        writerText.writeDataToFile(students);

        // формируем файл json
        WriterToFileJson writerJson = new WriterToFileJson(folder + "students.json");
        writerJson.writeDataToFile(students);

        // формируем файл XML
        WriterToFileXML writerXML = new WriterToFileXML(folder + "students.xml");
        writerXML.writeDataToFile(students);
    }
}
