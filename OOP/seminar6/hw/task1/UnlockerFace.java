package OOP.seminar6.hw.task1;

public class UnlockerFace extends Unlocker {
    private String faceID;

    public UnlockerFace(String faceID) {
        // задаем имя метода разблокировки в конструкторе родительского класса
        super("лица");
        this.faceID = faceID;
    }

    @Override
    public void unlock() {
        // иммитация функции разблокировки
        System.out.printf("Разблокировано c помощью %s: %s.\n", super.mode, faceID);
    }
}