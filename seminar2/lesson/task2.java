/*
 * Напишите метод, который сжимает строку. 
Пример: вход aaaabbbcdd.
	        выход 4a3b1c2d


 */
package seminar2.lesson;

public class task2 {
    public static void main(String[] args) {
        String src = "aaaabbbcdd";
        if (src.length() == 0) {
            System.out.println("Введите не пустую строку");
            return;
        }
        char cur_char = src.charAt(0);
        int cur_char_cnt = 1;
        StringBuilder res = new StringBuilder();

        for (int i=1; i< src.length();i++) {
            if (src.charAt(i) == cur_char) {
                cur_char_cnt++;
            } else {
                res.append(cur_char_cnt + Character.toString(cur_char));
                cur_char=src.charAt(i);
                cur_char_cnt = 1;
            }
            
        }
        res.append(cur_char_cnt + Character.toString(cur_char));

        System.out.println(res);
    }
}
