package OOP.seminar2.lesson.task1;

public abstract class Weapon {
    protected int bullets;
    protected int target = 100;

    public abstract String getName();

    public abstract int getRateOfFire();

    public abstract int getdamage();

    public abstract int getbulletsCount();

    public void soundOfShooting() {
        System.out.printf("Сделан выстрел из %s\n", getName());
        bullets--;
    }

    public void shoot() {
        while (this.target > 0) {
            System.out.printf("Здоровье цели до выстрела = %d\n", this.target);
            this.target -= getdamage();
        }
        System.out.printf("Цель убита!\nЗдоровье цели = 0\n");
    }
}
