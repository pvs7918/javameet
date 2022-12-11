package seminar6.hw;

import java.text.Format;
import java.time.LocalDate;

public class Laptop {
    private String Model;
    private int volumeRAM;
    private int volumeHDD;
    private String typeOS;
    private String color;
    private float price;
    private String serialNum;
    private LocalDate manufactDate; // дата производства
    private Person owner; // владелец, кому был продан ноутбук
    private String status; // in stock, on show, sold (на складе, на витрине, продан)

    // конструктор со всеми полями
    public Laptop(String Model, int volumeRAM, int volumeHDD,
            String typeOS, String color, float price, String serialNum,
            LocalDate manufactDate, Person owner, String status) {
        this.Model = Model;
        this.volumeRAM = volumeRAM;
        this.volumeHDD = volumeHDD;
        this.typeOS = typeOS;
        this.color = color;
        this.price = price;
        this.serialNum = serialNum;
        this.manufactDate = manufactDate;
        this.owner = owner;
        this.status = status;
    }

    // конструктор без полей typeOS, owner, status. Эти 3 поля заменяем на значения
    // по умолчанию
    public Laptop(String Model, int volumeRAM, int volumeHDD,
            String color, float price, String serialNum,
            LocalDate manufactDate) {
        // вызываем конструктор со всеми полями с typeOS = ""
        // owner первоначально делаем пустым. Оно будет заполнено после продажи ноутбука
        this(Model, volumeRAM, volumeHDD, "", color, price, serialNum, manufactDate,
                null, "stock");
        Person person = new Person();
        this.owner = person;
    }

    public Laptop(String Model) {
        // вызываем конструктор со всеми полями с typeOS = ""
        // owner первоначально делаем пустым. Оно будет заполнено после продажи ноутбука
        this(Model, 0, 0, "", "", 0, "",
                LocalDate.now(), null, "stock");
    }

    @Override
    public String toString() {
        String res = String.format("---------------\nМодель: %s, ОЗУ: %dGB, HDD: %dGB,\n",
                Model, volumeRAM, volumeHDD);
        res += String.format("ОС: %s, цвет: %s, цена: %.2f р.,\n",
                typeOS, color, price);
        res += String.format("Серийный №: %s, Дата производства: %s, статус: %s (%s),\n",
                serialNum, manufactDate.toString(), Status.get(status), status);
        if (owner == null) {
            res += "Владелец: null.";
        } else {
            res += String.format("Владелец: %s, %s.",
                    owner.getFio(), owner.getPhoneNum());
        }
        return res;
    }

    // Переместить ноутбук на склад
    public void putInStock() {
        this.status = "stock";
    }

    // Переместить ноутбук на витрину магазина
    public void putOnShow() {
        this.status = "show";
    }

    // Продажа ноутбука
    public void sale(Person owner) {
        this.owner = owner;
        this.status = "sold";
    }

    // get методы. ПОдсказка, для авто-создания в контекстном меню VSC выбрать:
    // Source Action / Generate Getters... / Выбрать нужные поля для создания кода
    public String getModel() {
        return Model;
    }

    public int getVolumeRAM() {
        return volumeRAM;
    }

    public int getVolumeHDD() {
        return volumeHDD;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public LocalDate getManufactDate() {
        return manufactDate;
    }

    public Person getOwner() {
        return owner;
    }

    public String getStatus() {
        return status;
    }

    // set методы. ПОдсказка, для авто-создания в контекстном меню VSC выбрать:
    // Source Action / Generate Setters... / Выбрать нужные поля для создания кода

    public void setModel(String model) {
        Model = model;
    }

    public void setVolumeRAM(int volumeRAM) {
        this.volumeRAM = volumeRAM;
    }

    public void setVolumeHDD(int volumeHDD) {
        this.volumeHDD = volumeHDD;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public void setManufactDate(LocalDate manufactDate) {
        this.manufactDate = manufactDate;
    }

}
