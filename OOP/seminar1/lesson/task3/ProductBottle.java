public class ProductBottle extends Product {
    private float volume;

    public ProductBottle(String name, int amount, int price, int position, float volume) {
        super(name, amount, price, position);
        this.volume = volume;

    }

    public float getVolume() {
        return volume;
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPosition() {
        return super.getPosition();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + ", volume= " + volume;
    }

}
