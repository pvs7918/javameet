package OOP.seminar6.hw.task1;

public class UnlockerFinger extends Unlocker {
    private String fingerprint;

    public UnlockerFinger(String fingerprint) {
        // задаем имя метода разблокировки в конструкторе родительского класса
        super("отпечатка пальца");
        this.fingerprint = fingerprint;
    }

    @Override
    public void unlock() {
        // иммитация функции разблокировки
        System.out.printf("Разблокировано c помощью %s: %s.\n", super.mode, fingerprint);
    }
}