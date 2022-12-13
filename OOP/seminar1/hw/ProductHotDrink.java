package OOP.seminar1.hw;

public class ProductHotDrink extends Product {
    private int temperature;

    public ProductHotDrink(String name, int volume, int price, String producer,
            boolean isAerated, int temperature) {
        super(name, volume, price, producer);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getVolume() {
        return super.getVolume();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getProducer() {
        return super.getProducer();
    }

    @Override
    public String toString() {
        String curStr = super.toString();
        return "ProductHotDrink [" + curStr.substring(0, curStr.length() - 1) +
                ", temperature=" + temperature + "]]";
    }
}
