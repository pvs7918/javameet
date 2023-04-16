package ExceptionsCourse.seminar2.hw.Task1;

// специальное исключение для выделения выхода из программы при нажатии клавиши Q
// Исключение нужно пробросить в методе указав throws MyQuitException в сигнатуре метода,
// в коде метода при нажатии клавиши Q указать код - throw new MyQuitException,
// и в main обработать catch (MyQuitException e) - завершить программу.

public class MyQuitException extends RuntimeException{
    public MyQuitException(String str){
            super(str);
    }
}
