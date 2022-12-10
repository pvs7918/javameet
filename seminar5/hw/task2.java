package seminar5.hw;

/*
2.	Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
Написать программу, которая найдет и выведет повторяющиеся имена
с количеством повторений. Отсортировать по убыванию популярности.
 */
import java.util.*;

public class task2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Создаем и наполняем случайными значениями исходный LinkedList
        String source = "Иван, Пётр, Антон, Мария, Павел, Илья, Иван, Мария, Степан, Андрей, Иван, Иван";
        // помещаем значения имен в массив строк
        String[] names = source.split(",");

        // словарь хранящий количество повторений имён
        Map<String, Integer> repeats = new HashMap<>();
        for (String curname : names) {
            // делаем trim для строки, избавляемся от пробелов
            String clearName = curname.trim();
            int curCount = 0;
            if (repeats.containsKey(clearName)) {
                // если в словаре уже есть такое значение, то считываем количество из Map
                curCount = repeats.get(clearName);
            }
            // увеличиваем предварительно значение curCount + 1 и обновляем Count в словаре
            repeats.put(clearName, ++curCount);
        }
        // Исходный Map
        System.out.println(repeats);

        // Для сортировки по значениям, сначала извлечь их в List затем отсортировать по
        // ним.
        // Конвертация HashMap в List
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(repeats.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue())); // по убыванию
        System.out.println(list);
    }
}
