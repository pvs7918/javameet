/* Создайте класс Счетчик, у которого есть метод add(),
увеличивающий значение внутренней int переменной на 1. 
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки,
закрыт ли ресурс. При попытке вызвать add() у закрытого ресурса, должен выброситься
IOException
*/

package ExceptionsCourse.seminar3.lesson.Task2;

public class Task2 {
    public static void main(String[] args) throws Exception {
                
        try(Counter counter = new Counter()) {
            counter.add();
            counter.add();
        }
    }
    public static void doSomething() throws RuntimeException {

    }
}
