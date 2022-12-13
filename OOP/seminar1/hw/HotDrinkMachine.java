package OOP.seminar1.hw;

import java.util.*;

public class HotDrinkMachine implements VendingMachine {
    private List<Product> drinks;

    public HotDrinkMachine(List<Product> drinks) {
        this.drinks = drinks; // находящиеся в автомате продукты
    }

    @Override
    public void getProduct(String name, int volume, int temperature) {

        for (Product drink : drinks) {
            if (drink.getName().equals(name)
                    && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                System.out.printf("[Напиток: %s V=%d t=%d выдан.\n", name, volume, temperature);
                return;
            }
        }
        System.out.printf("[Напиток: %s V=%d t=%d отсутствует в автомате.\n", name, volume, temperature);
    }

    @Override
    public String toString() {
        return "VendingMachine [products=" + drinks + "]";
    }

}
