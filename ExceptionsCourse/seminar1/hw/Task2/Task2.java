/*2.	Посмотрите на код, и подумайте сколько разных типов исключений
 вы тут сможете получить?*/

/*
 Ответ:
 1. nullPointerException если при вызове sum2d(null) массив будет передан = null.
 
 2. NumberFormatException если елемент не Integer либо null, возникнет при вызове
 Integer.parseInt(arr[i][j])
 */

package ExceptionsCourse.seminar1.hw.Task2;

public class Task2 {
  public static void main(String[] args) {
    // String[][] arr = {{"1", null},{"3", "4"}}; // NumberFormatException
    // String[][] arr = {{"1", "абв"},{"3", "4"}}; // NumberFormatException
    String[][] arr = { { "1", "2" }, { "3", "4" } }; // корректный массив

    int res = sum2d(arr);
    // int res = sum2d(null); //NullPointerException
    System.out.println("Сумма равна: " + res);
  }

  public static int sum2d(String[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        int val = Integer.parseInt(arr[i][j]);
        sum += val;
      }
    }
    return sum;
  }
}
