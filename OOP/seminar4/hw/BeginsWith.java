/*
  Создайте следующие детские классы:
• в конструкторе запоминает строку. Ему дают строку, он проверяет,
что она начинается с того, что он запомнил
 */
package OOP.seminar4.hw;

public class BeginsWith<T> implements IsGood {
    private String sample;

    public BeginsWith(String sample) {
        // в конструкторе задаем шаблон для сравнения
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
