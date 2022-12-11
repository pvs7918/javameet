package seminar6.hw;

import java.util.HashMap;
import java.util.Map;

// для состояний используем словарь, для быстрой смены полного названия статуса,
// если не понравиться заказчику проекта

//используем класс Status для определения словаря статусов ноутбуков в одном месте проекта 
// чтобы далее обращатся к этим статусам из любых точек проекта через static-метод get:
//например: Status.get("stock")
//это дает - Dont repeat yourself.
// так нужно будет работать, по идее, с таблицами БД - справочниками, статусами.

public class Status {
    public static String get(String keyVal) {
        Map<String, String> stat = new HashMap<>();
        stat.put("stock", "на складе");
        stat.put("show", "на витрине");
        stat.put("sold", "продан");
        return stat.get(keyVal);
    }
}
