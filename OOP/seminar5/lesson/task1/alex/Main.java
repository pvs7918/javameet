package OOP.seminar5.lesson.task1.alex;

import java.io.*;
import java.util.*;

import OOP.seminar5.lesson.task1.alex.data.*;
import OOP.seminar5.lesson.task1.alex.service.*;
import OOP.seminar5.lesson.task1.alex.util.*;
//1. Создайте три класса в пакете data: User, Teacher, Student. User содержит поля, общие для студента и преподавателя. Student и Teacher добавляют поля, специфичные для этих классов.

//2. Создайте два класса в пакете util: FileWriter и FileReader. Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.
//3. Создайте в пакете service: интерфейс DataService и два детских класса: UserService и TeacherService. Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:
// - добавить нового студента или учителя
// - сохранить всех в файл
// - загрузить всех из файла

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 20, "Male", "IT-123");
        Student student2 = new Student("Maks", 22, "Male", "E-157");
        Student student3 = new Student("Sveta", 21, "Female", "S-295");
        Student student4 = new Student("Maria", 19, "Female", "A-311");

        List<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        OurFileWriter oFW = new OurFileWriter();
        oFW.fileWriter(students);

        OurFileReader oFR = new OurFileReader();
        System.out.println(oFR.fileReader());

        DataService<Student> uS = new UserService(students);
        uS.add(student4);
        System.out.println(students);

        uS.save(students);
        System.out.println(uS.load());
    }
}
