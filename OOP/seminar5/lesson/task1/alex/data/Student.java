package OOP.seminar5.lesson.task1.alex.data;

public class Student extends User {
    private String groupName;

    public Student(String name, Integer age, String gender, String groupName) {
        super(name, age, gender);
        this.groupName = groupName;
    }

    public String getStudentFields() {
        return super.toString() + ", " + groupName + "\n";
    }
}
