package OOP.seminar1.hw;

public abstract class Product {
    private String name;
    private int volume;
    private int price;
    private String producer;

    public Product(String name, int volume, int price, String producer) {
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public abstract int getTemperature();

    @Override
    public String toString() {
        return "Product [name=" + name + ", volume=" + volume + ", price=" + price + ", producer=" + producer + "]";
    }

}
