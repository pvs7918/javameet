package OOP.seminar6.hw.task1;

public class UnlockerVoid extends Unlocker {

    public UnlockerVoid() {
        // задаем имя метода разблокировки в конструкторе родительского класса
        super("без пароля");
    }

    @Override
    public void unlock() {
        // иммитация функции разблокировки
        System.out.printf("Разблокировано %s.\n", super.mode);
    }
}