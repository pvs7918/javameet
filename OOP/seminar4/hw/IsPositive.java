/*
  Создайте следующие детские классы:
• IsEven — ему дают целое число, он одобряет его, если оно чётное
 */
package OOP.seminar4.hw;

public class IsPositive implements IsGood {
    public IsPositive() {
    }

    @Override
    public boolean isGood(Object item) {
        if ((int) item > 0)
            return true;
        return false;
    }
}
