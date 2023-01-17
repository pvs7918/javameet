package data;


public class Student extends User {
    @Override
    public String toString() {

        return "Student{" + super.toString() +
                "avgMark=" + avgMark +
                ", group='" + group + '\'' +
                '}';
    }

    private float avgMark;

    private String group;


    public Student(int id, String name, float avgMark, String group) {
        super(id, name);
        this.avgMark = avgMark;
        this.group = group;
    }
}
