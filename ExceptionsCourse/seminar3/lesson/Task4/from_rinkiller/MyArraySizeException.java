public class MyArraySizeException  extends ArrayIndexOutOfBoundsException{
    public MyArraySizeException(){
        super("Данный массив некоректного размера. Пожалуйста установите размеры массива 4х4");
    }
    
}
