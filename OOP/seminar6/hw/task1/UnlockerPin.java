package OOP.seminar6.hw.task1;

public class UnlockerPin extends Unlocker {
    private int pin;

    public UnlockerPin(int pin) {
        // задаем имя метода разблокировки в конструкторе родительского класса
        super("пин-код");
        this.pin = pin;
    }

    @Override
    public void unlock() {
        // иммитация функции разблокировки
        System.out.printf("Разблокировано c помощью %s: %d.\n", super.mode, pin);
    }
}