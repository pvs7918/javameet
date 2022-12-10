package seminar5.lesson;
/*
3. Написать метод, который переводит число из римского формата записи в арабский. 
Например, MMXXII = 2022

 */

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Введите римское число (либо quit дл выхода):");
            String strIn = scanner.nextLine().toUpperCase();
            if (strIn.equals("QUIT")) {
                System.out.println("Выполнение программы прервано!");
                break;
            }
            try {
                System.out.println(convertToArabian(strIn));
            } catch (IllegalStateException ex) {
                //обработка исключения недопустимого символа в исходном числе
                System.out.println(ex.getMessage());
            }
        }

        scanner.close();
    }

    public static Long convertToArabian(String strIn) {
        //функция переовдит римское число в арабское
        long Res = 0;

        Map<Character, Integer> romaningLetters = new HashMap<>();
        // римские - арабские числа
        romaningLetters.put('I', 1);
        romaningLetters.put('V', 5);
        romaningLetters.put('X', 10);
        romaningLetters.put('L', 50);
        romaningLetters.put('C', 100);
        romaningLetters.put('D', 500);
        romaningLetters.put('M', 1000);

        // Правило вычитания. Комбинации, при которых левый символ уменьшает правый
        String[] MinusRule = { "IV", "IX", "XL", "XC", "CD", "CM" };

        // пример: XXXVII
        for (int i = 0; i < strIn.length(); i++) {
            // если текущий символ не входит в словарь, считаем это ошибкой в исходном числе
            if (!romaningLetters.containsKey(strIn.charAt(i))) {
                throw new IllegalStateException("Число содержит недопустимый символ!");
            }

            // берем комбинацию текущий символ + следующий j (если конечно не конец строки)
            int j = i + 1;
            if (i < strIn.length() - 1)
                j++;
            String cur2Chars = strIn.substring(i, j);
            // проверяем текущую комбинацию cur2Chars на вхождение в правило вычитания
            boolean isPresent = false;
            for (int k = 0; k < MinusRule.length; k++) {
                if (cur2Chars.equals(MinusRule[k])) {
                    isPresent = true;
                    break;
                }
            }
            // Если текущая комбинация входит в правило вычитания,
            // то вычитаем число представленное текущим символо
            if (isPresent) {
                Res -= romaningLetters.get(strIn.charAt(i));
            } else {
                Res += romaningLetters.get(strIn.charAt(i));
            }
        }
        return Res;
    }

}
