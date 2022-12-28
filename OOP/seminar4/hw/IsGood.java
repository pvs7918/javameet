/*
1.	Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);
*/

package OOP.seminar4.hw;

public interface IsGood<T> {
    boolean isGood(T item);
}