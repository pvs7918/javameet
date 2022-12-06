package seminar5.lesson;
/*
2/ Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
 */

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Входная строка:");
        String strIn = scanner.nextLine();

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('[', ']');
        brackets.put('<', '>');
        brackets.put('(', ')');
        brackets.put('{', '}');

        System.out.println(checkBrackets(strIn, brackets));

        scanner.close();
    }

    public static boolean checkBrackets(String strIn, Map<Character, Character> brackets) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < strIn.length(); i++) {
            // проверяем является текущий символ открывающей скобкой
            if (brackets.containsKey(strIn.charAt(i))) {
                stack.add(strIn.charAt(i));
            }
            // проверяем является текущий символ открывающей скобкой
            else if (brackets.containsValue(strIn.charAt(i))) {
                if (stack.isEmpty())
                    return false;
                char openingBracket = stack.pollLast();
                if (strIn.charAt(i) != brackets.get(openingBracket)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
