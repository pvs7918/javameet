/*
 * Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, которая состоит из
 чередующихся символов c1 и c2, начиная с c1

 */
package seminary3.lesson;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int N = sc.nextInt();
        String c1 = sc.next();
        String c2 = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<N/2;i++) {
            sb.append(c1+c2);
        }
        System.out.println(sb);
        sc.close();
        
        /*String s = "абв";
        s = "где";
        System.out.println(s);*/
    }
}
