/*
  Создайте следующие детские классы:
• IsEven — ему дают целое число, он одобряет его, если оно чётное
 */
package OOP.seminar4.hw;

public class BeginsWith<T> implements IsGood {
    private String sample;

    public BeginsWith(String sample) {
        //в конструкторе задаем шаблон для сравнения
        this.sample = sample;
    }

    @Override
    public boolean isGood(Object item) {
        // приводим тип объект к типу String, чтобы можно было
        // обратится к методу startsWith
        
        String curString = (String) item;
        if (curString.startsWith(sample))
            return true;
        return false;
    }
    
}
