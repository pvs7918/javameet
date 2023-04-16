
import java.nio.file.Files;
import java.nio.file.Paths;

public class les2 {
    public static void main(String[] args) throws FileisNullException {
        // try {
        //     int t = 10 / 0;
        // } catch (ArithmeticException e) {
        //     throw new DevidedZiroException("Деление на 0");
            
        // }
        // Integer[] array = new Integer[]{3,4,5,6,null};
        // try {
        //     int r = array[4];
        // } catch (Exception e) {
        //     throw new NullisArrayException("Элемент массива имеет значение Null");
        // }
        if(!Files.exists(Paths.get("fileName.txt"))) { 
            throw new FileisNullException(" Ошибка! Данный фаил не существует!");
         }
    }
}
