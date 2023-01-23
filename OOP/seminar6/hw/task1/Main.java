/*Задача 1. Чтобы разблокировать телефон, пользователь может выбрать
один из способов:
• Без пароля
• С пин-кодом (4-значное число)
• По отпечатку пальца (кодируется строкой)
• По распознаванию лица (кодируется строкой)
Программист написал класс Unlocker, в котором хранятся поля от всех
способов сразу:
class Unlocker {
private int mode; // режим
private int pin; // на случай пин-кода
private String fingerprint; // на случай отпечатка пальца
private String faceID; // на случай лица
}
Здесь нарушен принцип SRP: класс имеет несколько
незаивисимых причин меняться.
Напишите решение, которое будет соответствовать SRP и OCP
(мы хотим в будущем добавлять новые способы разблокировки).
*/

package OOP.seminar6.hw.task1;

public class Main {
    public static void main(String[] args) {
        int pin = 1234;
        String fingerprint = "отпечаток1";
        String faceID = "лицо1";

        // объявляем объекты всех типов для примера
        UnlockerVoid unlockVoid = new UnlockerVoid();
        UnlockerPin unlockPin = new UnlockerPin(pin);
        UnlockerFinger unlockFinger = new UnlockerFinger(fingerprint);
        UnlockerFace unlockFace = new UnlockerFace(faceID);

        // вызываем методы разблокировки каждого типа
        unlockVoid.unlock();
        unlockPin.unlock();
        unlockFinger.unlock();
        unlockFace.unlock();
    }
}