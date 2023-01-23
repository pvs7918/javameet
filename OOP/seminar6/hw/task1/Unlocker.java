package OOP.seminar6.hw.task1;

public abstract class Unlocker implements UnlockerI {
    protected String mode;

    // в конструкторе задается режим разблокировки
    public Unlocker(String mode) {
        this.mode = mode;
    }
}
