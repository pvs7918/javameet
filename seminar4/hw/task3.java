/*
3*. Напишите постфиксный калькулятор. Пользователь вводит данные и операции
в обратной польской записи. Калькулятор вычисляет результат и проверяет,
что в стэке получилось единственное число.
Например:
5 4 3 - + => 5 1 + => 6
 */
package seminar4.hw;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Постфиксный калькулятор");
        System.out.println("Введите выражение в обратной польской последовательности (пример - '5 4 3 - +'):");
        String input = scanner.nextLine();
        Double result = 0.0;
        try{
            result = polishCalculator(input);
        } catch(Exception ex) {
            System.out.println("Невозможно вычислить выражение! " + ex.getMessage());
            return;
        }
        System.out.printf("Результат: %.2f", result);

        scanner.close();
    }

    public static Double polishCalculator(String srcStr) throws Exception {
        Double result = 0.0;

        String[] actions = { "+", "-", "*", "/", "^" };
        // разбиваем строку на операнды
        String[] substr = srcStr.trim().split(" ");
        // создаем стек
        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < substr.length; i++) {
            // является числом
            String cur_substr = substr[i];
            if (isDoubleNumber(cur_substr)) {
                // поэтому добавляем в стек
                stack.addLast(cur_substr);
            } else {
                // не является числом. проверяем является ли элемент операцией(действием)
                boolean isAction = false;
                for (int j = 0; j < actions.length; j++) {
                    if (actions[j].equals(cur_substr)) {
                        // из стека извлекаем последние 2 операнда
                        double operandB = Double.parseDouble(stack.pollLast());
                        double operandA = Double.parseDouble(stack.pollLast());
                        double CurOperRes = 0;
                        // выполняем арифметическую операцию
                        switch (cur_substr) {
                            case ("+"):
                                CurOperRes = operandA + operandB;
                                break;
                            case ("-"):
                                CurOperRes = operandA - operandB;
                                break;                                
                            case ("/"):
                                CurOperRes = operandA / operandB;
                                break;
                            case ("*"):
                                CurOperRes = operandA * operandB;
                                break;                     
                            case ("^"):
                                CurOperRes = Math.pow(operandA, operandB);
                                break;
                        }
                        stack.addLast(Double.toString(CurOperRes));
                    }
                }
            }
        }
        // после обработки всех подстрок в стеке должно остаться одно число возвращаем его,
        // иначе выбрасываем исключение
        if (stack.isEmpty()) {
            throw new Exception("Стек пуст!");
        } else if (stack.size() > 1) {
            throw new Exception("Длина стека больше 1 после обработки!");
        }
        String CurStr = stack.pollLast();
        if (!isDoubleNumber(CurStr)){
            throw new Exception("После обработки, результат в стеке не является числом!");
        }
        //если все проверки были успешно пройдены, то возвращаем результат
        return Double.parseDouble(CurStr);
    }

    /**
     * @param str
     * @return
     */
    public static boolean isDoubleNumber(String str) {
        // метод проверяет является ли строка числом
        if (str == null || str.isEmpty())
            return false;
        try {
            Double numb = Double.parseDouble(str);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
