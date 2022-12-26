package OOP.seminar4.lesson.task2;

/*
 Напишите самодельный обобщённый класс Collection,
 внутри которого спрятан массив. Используйте обобщения,
 чтобы класс мог хранить данные произвольного типа, например,
 Collection<Integer> или Collection<string>. Обязательные операции,
которые надо прописать:
get: достаёт элемент по указанному индексу
set: перезаписывает элемент по указанному индексу
size: сколько элементов в массиве?
toString
(Необязательная часть, если есть время). Пропишите операцию add,
которая делает динамическое перевыделение массива и добавляет новый элемент в конец.
*/

public class Main {
    public static void main(String[] args) {
        Integer[] n = {1,4,6,2,8};
        MyCollection<Integer> col1 = new MyCollection<Integer>(n);
        System.out.println(col1);
        System.out.println(col1.get(3));
        col1.set(100,0);
        System.out.println(col1);
        System.out.printf("size: %d\n", col1.size());
        col1.add(25);
        System.out.println(col1);
    }
}
