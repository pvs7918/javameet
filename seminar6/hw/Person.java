package seminar6.hw;

public class Person {
    private String fio;
    private String phoneNum;

    public Person(String fio, String phoneNum) {
        this.fio = fio;
        this.phoneNum = phoneNum;
    }

    public Person() {
        this("", ""); // вызываем конструктор сс всеми параметрами
    }

    public String getFio() {
        return fio;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}
