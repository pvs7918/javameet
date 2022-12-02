/*
1.	В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.


* */

package seminar2.hw;

public class hw2_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        result.append("SELECT * FROM students WHERE ");
        String js = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        
        if (Character.toString(js.charAt(0)).equals("{") && 
            Character.toString(js.charAt(js.length()-1)).equals("}")  ) {
            //убираем {} в исходной строке
            js = js.substring(1, js.length() - 1);

            //разбиваем json-строку через разделитель ",", получаем массив параметров qls
            String[] params = js.split(",");

            for (int i = 0; i < params.length; i++) {
                //каждый параметр - делаем trim  и расщепляем через :
                String[] substr = params[i].trim().split(":");
                
                //параметры со значением null пропускаем
                if (!substr[1].trim().equals("\"null\"")) {
                    //в названии параметра убираем ""
                    substr[0] = substr[0].replaceAll("\"", "");
                    if (i == 0) {
                        //первый параметр выводим без разделителя AND
                        result.append(substr[0].trim() + "=" + substr[1].trim());
                    } else {
                        result.append(" AND " + substr[0].trim() + "=" + substr[1].trim());
                    }
                }
            }
        } else {
            System.out.println("Исходная строка не является json-строкой. Выполнение программы прервано!");
        }
        System.out.println(result.toString());
    }
}
