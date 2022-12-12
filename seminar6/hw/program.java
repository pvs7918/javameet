package seminar6.hw;
/*
•	Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
•	Создать множество ноутбуков.  – Set(Laptop)
•	Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
	“Введите цифру, соответствующую необходимому критерию:
	1 - ОЗУ
	2 - Объем ЖД
	3 - Операционная система
	4 - Цвет …
•	Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
•	Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.time.LocalDate;
import java.util.*;

public class program {
    public static void main(String[] args) {
        // создаем Set класса Notebook
        Set<Laptop> notes = new LinkedHashSet<Laptop>();

        // Добавление буков
        // №1
        // наполняем Set объектами класса Notebook, используя разные определенные
        // контсрукторы
        Laptop curbook = new Laptop("ASUS Laptop E210KA-GJ080W", 4,
                128, "Windows 11 Home Single Language",
                "gray", 22999f, "FRELJ239847",
                LocalDate.parse("2019-08-21"), null, "show");
        notes.add(curbook);

        // №2
        // используем конструктор с одни полем - Model
        curbook = new Laptop("Acer Extensa 15 EX215-31-C3FF");
        // Остальные поля заполняем через setter'ы
        curbook.setVolumeRAM(6);
        curbook.setVolumeHDD(512);
        curbook.setTypeOS("without OS");
        curbook.setColor("black");
        curbook.setPrice(24299f);
        curbook.setSerialNum("ARE345O38475");
        curbook.setManufactDate(LocalDate.parse("2021-01-15"));
        // Перемещаем ноутбук на склад методом putInStock. при этом меняется поле
        // status.
        // Так просто изменить статус нельзя
        curbook.putInStock();
        notes.add(curbook);

        // №3
        // используем констуктор без полей typeOS, owner, status
        curbook = new Laptop("MSI GF66 Katana 11SC-1251XRU", 8,
                256, "black", 64999f, "MS098L234509",
                LocalDate.parse("2022-07-02"));
        curbook.setTypeOS("without OS");
        Person buyer = new Person("Ivanov S.P", "+79234991234");
        // Продаем ноутук. при этом меняется статус и владелец.
        // Так просто изменить статус и владельца нельзя - у полей нет методов set.
        curbook.sale(buyer);
        notes.add(curbook);

        // №4
        curbook = new Laptop("Lenovo IdeaPad 3 15ALC6", 8,
                1000, "Windows 11 Home Single Language",
                "gray", 52999f, "LNV34578HJ34",
                LocalDate.parse("2022-04-14"), null, "show");
        notes.add(curbook);

        // №5
        curbook = new Laptop("ASUS TUF Dash F15 FX516PR-HN033T", 16,
                512, "Windows 10 Home Single Language",
                "gray", 125999f, "FARJ249847",
                LocalDate.parse("2022-10-20"), null, "show");
        notes.add(curbook);

        // Вывод полного набора ноутбуков
        System.out.println("\n--------------- Полный список ноутбуков ---------------");
        for (Laptop item : notes) {
            System.out.println(item);
        }

        // Выполнить фильтрацию набора ноутбуков
        filter(notes);
    }

    /**
     * фильтрация ноутбуков
     * 
     * @param srcSet
     */
    public static void filter(Set<Laptop> srcSet) {

        Map<String, String> paramName = new HashMap<>();
        paramName.put("1", "Модель");
        paramName.put("2", "минимальный объем ОЗУ");
        paramName.put("3", "минимальный объем ЖД");
        paramName.put("4", "Тип ОС");
        paramName.put("5", "Цвет");
        paramName.put("6", "минимальная цена");
        paramName.put("7", "Статус");

        Scanner scanner = new Scanner(System.in);
        String[] criteria;

        // Вводим критерий(и) фильтрации
        while (true) {
            System.out.println("\n*************** Поиск ноутбуков ***************");
            System.out.println("Выберите критерии поиска через пробел (например: 1 2):");
            for (Map.Entry<String, String> param : paramName.entrySet()) {
                System.out.printf("[%s] - %s\n", param.getKey(), param.getValue());
            }
            System.out.println("[Q] - Прекратить поиск");
            System.out.println("Введите критерии поиска (через пробел):");

            String input = scanner.nextLine();
            if (input.toUpperCase().equals("Q")) {
                System.out.println("Выполнен выход из поиска.");
                break;
            }
            criteria = input.trim().toUpperCase().split(" ");
                        
            Map<String, String> params = new HashMap<>(criteria.length);
            for (int i = 0; i < criteria.length; i++) {
                String criteriaNum = criteria[i];
                System.out.printf("Задайте фильтр [%s] - %s: ", criteriaNum, paramName.get(criteriaNum));
                input = scanner.nextLine();
                params.put(criteriaNum, input);
            }
            
            // создаем пустой набор resSet, туда поместим результаты успешного выбора записей.
            Set<Laptop> resSet = new LinkedHashSet<Laptop>();

            // результат фильтрации ложим в resSet
            for (Laptop item : srcSet) {
                // к сущности применяем все заданные фильтры. Если хотя был один параметр не подошел,
                // элемент отсеивается
                boolean itFits = true;
                for (Map.Entry<String, String> curparam : params.entrySet()){
                    switch (curparam.getKey()) {
                        case "1":
                            if (! item.getModel().toUpperCase().contains(curparam.getValue().toUpperCase()))
                                itFits = false;
                            break;
                        case "2":
                            if (item.getVolumeRAM() < Integer.parseInt(curparam.getValue()))
                                itFits = false;
                            break;
                        case "3":
                            if (item.getVolumeHDD() < Integer.parseInt(curparam.getValue()))
                                itFits = false;
                            break;
                        case "4":
                            if (!item.getTypeOS().toUpperCase().contains(curparam.getValue().toUpperCase()))
                                itFits = false;
                            break;
                        case "5":
                            if (!item.getColor().toUpperCase().contains(curparam.getValue().toUpperCase()))
                                itFits = false;
                            break;
                        case "6":
                            if (item.getPrice() < (float) Double.parseDouble(curparam.getValue()))
                                itFits = false;
                            break;
                        case "7":
                            if (!item.getStatus().toUpperCase().contains(curparam.getValue().toUpperCase()))
                                itFits = false;
                            break;
                    }
                }
                if (itFits) 
                    resSet.add(item);
            }
            // выводим результат фильтрации
            System.out.println("\n<<<<<<<<<<<<<<< Результат применения фильтра(ов) >>>>>>>>>>>>>>>");
            for (Laptop item : resSet) 
                System.out.println(item);
        }
        scanner.close();
    }
}

