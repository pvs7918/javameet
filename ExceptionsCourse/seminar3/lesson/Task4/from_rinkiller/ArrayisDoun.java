// Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение 
// MyArraySizeException.
// Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось
//  (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат
//   неверные данные.
// В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета 
// (сумму элементов, при условии что подали на вход корректный массив).

public class ArrayisDoun {
    public static int whereisArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        boolean isGood = true;
        if(arr.length == 4){
         for(int i = 0; i < 4; i++)
            if(arr[i].length != 4) isGood = false;
        }
        else isGood = false;
        if(!isGood) throw new MyArraySizeException();


        int result = 0;
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
            {
                try {
                    result = result + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    String str = "Элемент массива строка " +  i + " столбец " + j + " не является числом";
                    throw new MyArrayDataException(str);                  
                }
            }
        
        
        return result;
    }
    public static void main(String[] args) {
        try {
            System.out.println(whereisArray(new String[][]{
                {"3","2","3","2"},
                {"6","5","6","5"},
                {"8","7","6","5"}})); 
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }  
    }
}
