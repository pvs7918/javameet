package lesson_2;

// 1. Создайте базовый класс Оружие. У оружия есть название, повреждение, скорострельность, количество зарядов в обойме, звук при выстреле — это методы. Напишите метод, который делает один выстрел.
// Напишите три класса-наследника Оружия. В них переопределите родительские методы.
// Проверьте, как работают оба оружия.

// 2. Создайте тестовый стенд для оружия — метод, который испытывает одно оружие. У мишени 100 единиц здоровья. Оружие стреляет в него, пока не убьёт.
// Протестируйте все виды оружия на стенде.

public class Main {

    public static void main(String[] args) {
        Weapon gun = new Gun();
        Weapon mGun = new MachineGun();
        Weapon rifle = new Rifle();

        rifle.soundOfShooting();
        rifle.shoot();
        System.out.println("-------");

        gun.soundOfShooting();
        gun.shoot();
        System.out.println("-------");

        mGun.soundOfShooting();
        mGun.shoot();

    }
}
