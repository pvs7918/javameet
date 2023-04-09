package OOP.seminar7.hw.classes;

public abstract class Contact {
    protected int id;
    protected String type;
    protected String value;


    public Contact(int id, String type, String value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "id=" + id + ", type=" + type + ", name=" + value;
    }
}
