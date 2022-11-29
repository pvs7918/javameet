/*
 Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.


 */
package seminary3.lesson;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        
        ArrayList ls = new ArrayList<String>();
        ls.add("Первый");
        ls.add(2);
        ls.add(22);
        ls.add(23);
        ls.add("Третий");
        ls.add(4);
        ls.add(56);

        System.out.println(ls);

        for(int i=0; i<ls.size();i++) {
            if (ls.get(i) instanceof Integer) {
                ls.remove(i);
                i--;
            }
        }
        System.out.println(ls);

    }
}
