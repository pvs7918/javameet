package OOP.seminar5.lesson.task1.alex.data;

public class Teacher extends User {
    private String subject;
    private String post;

    public Teacher(String name, Integer age, String gender, String subject, String post) {
        super(name, age, gender);
        this.subject = subject;
        this.post = post;
    }

    @Override
    public String toString() {
        return super.toString() + "subject: " + subject + "post: " + post;
    }

}
