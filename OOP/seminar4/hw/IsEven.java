/*
  Создайте следующие детские классы:
• IsEven — ему дают целое число, он одобряет его, если оно чётное
 */
package OOP.seminar4.hw;

public class IsEven<T> implements IsGood {
    public IsEven() {}

    @Override
    public boolean isGood(Object item) {
        if ((int)item%2 == 0)
            return true;
        return false;
    }
}
