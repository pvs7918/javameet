package OOP.seminar2.lesson.task1;

import java.net.SocketTimeoutException;

public class Gun extends Weapon {

    @Override
    public String getName() {
        return "Пистолет";
    }

    @Override
    public int getRateOfFire() {
        return 30;
    }

    @Override
    public int getdamage() {
        return 15;
    }

    @Override
    public int getbulletsCount() {
        return 7;
    }
}
