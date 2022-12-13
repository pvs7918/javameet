package OOP.seminar1.hw;

interface VendingMachine {
    // метод получения продукта: от получения денег до выдачи продукта
    public abstract void getProduct(String name, int volume, int temperature);
}
