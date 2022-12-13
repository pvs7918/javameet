package OOP.seminar1.hw;

/* При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
1. Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
2. Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и
реализуйте перегруженный метод getProduct(int name, int volume, int temperature),
выдающий продукт, соответствующий имени, объему и температуре.
3. В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте
покупателю купить товар. */

import java.util.*;

public class program {
    public static void main(String[] args) {
        // создаем горячие напитки
        Product latte = new ProductHotDrink("Latte", 200, 70, "Nestle",
                false, 90);
        Product cappucino = new ProductHotDrink("Cappucino", 300, 100, "Caffe Nero",
                false, 85);
        Product hotChoco = new ProductHotDrink("Hot Chocolate", 200, 150, "Highlands Coffee",
                false, 92);
        Product tea = new ProductHotDrink("Tea (black)", 200, 40, "Ahmad",
                false, 95);

        // помещаем горячие напитки в коллекцию
        List<Product> drinks = new ArrayList<>();
        drinks.add(latte);
        drinks.add(cappucino);
        drinks.add(hotChoco);
        drinks.add(tea);
        // создаем автомат и наполняем его напитками
        HotDrinkMachine drinkmachine = new HotDrinkMachine(drinks);
        // выводим список напитков из коллекции drinks
        System.out.println("\nГорячие напитки в автомате гор.напитков:");
        for (Product drink : drinks)
            System.out.println(drink.toString());
        // System.out.println(drinkmachine);

        drinkmachine.getProduct("Tea (black)", 200, 95);
        drinkmachine.getProduct("Cappucino", 300, 85);
        drinkmachine.getProduct("Noname Drink", 300, 100);
    }
}