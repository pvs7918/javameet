package OOP.seminar7.hw.classes;

public abstract class Contact {
    protected String name;
    protected String type;

    public Contact(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", type=" + type + "]";
    }
}
