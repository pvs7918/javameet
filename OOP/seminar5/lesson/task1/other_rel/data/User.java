//Создайте три класса в пакете data: User, Teacher, Student. User содержит поля,
//        общие для студента и преподавателя. Student и Teacher добавляют поля,
//        специфичные для этих классов.
//        Создайте два класса в пакете util: FileWriter и FileReader.
//        Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.
//        Создайте в пакете service: интерфейс DataService и два детских класса:
//        UserService и TeacherService. Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:
//        добавить нового студента или учителя
//        сохранить всех в файл
//        загрузить всех из файла


        package data;

public abstract class User {
    private int id;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
