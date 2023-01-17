package OOP.seminar5.lesson.task1.alex.data;

public abstract class User {
    private String name;
    private Integer age;
    private String gender;

    public User(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + gender;
    }

}
