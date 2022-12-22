package lesson_2;

public class Rifle extends Weapon {

    @Override
    public String getName() {
        return "Винтовка";
    }

    @Override
    public int getRateOfFire() {
        return 600;
    }

    @Override
    public int getdamage() {
        return 60;
    }

    @Override
    public int getbulletsCount() {
        return 30;
    }
}
