package OOP.seminar2.hw;

public class Student {
    private String name;
    private float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return String.format("%.1f", grade).replace(',', '.');
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + getGrade() + "]";
    }
}
