package ExceptionsCourse.seminar3.hw;

// специальное исключение для выделения ошибок разбора данных при чтении файлов 
// Исключение нужно пробросить в методе указав throws MyUserInputParsingException в сигнатуре метода,
// в коде метода при нажатии клавиши Q указать код - throw new MyUserInputParsingException,
// и в main обработать catch (MyUserInputParsingException e) - завершить программу.

public class MyUserInputParsingException extends RuntimeException{
    public MyUserInputParsingException(String str){
            super(str);
    }
}
