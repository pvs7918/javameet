package data;

public class Teacher extends User {
    private String position;
    private String subject;

    public Teacher(int id, String name, String position, String subject) {
        super(id, name);
        this.position = position;
        this.subject = subject;
    }



}

