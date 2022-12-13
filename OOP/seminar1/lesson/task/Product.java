public class Product {
    private String name;
    private int amount;
    private int price;
    private int position;

    public Product(String name, int amount, int price, int position) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", amount=" + amount + ", price=" + price + "]";
    }

}
