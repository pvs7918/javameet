package task1;

public class MachineGun extends Weapon {

    @Override
    public String getName() {
        return "Пулемет";
    }

    @Override
    public int getRateOfFire() {
        return 1000;
    }

    @Override
    public int getdamage() {
        return 75;
    }

    @Override
    public int getbulletsCount() {
        return 150;
    }
}
