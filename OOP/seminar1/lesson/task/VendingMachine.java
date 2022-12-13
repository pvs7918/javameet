import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> products;

    public VendingMachine(ArrayList<Product> products) {
        this.products = products;
    }

    public Product getNumber(int position) {
        for (Product product : products) {
            if (position == product.getPosition()) {
                return product;
            }
        }
        // return null;
        throw new IllegalStateException("Не было товара в такой позиции");
    }

    public void fullPrice() {

    }

    public void getMoney() {

    }

    public void extradition() {

    }

    @Override
    public String toString() {
        return "VendingMachine [products=" + products + "]";
    }

}
