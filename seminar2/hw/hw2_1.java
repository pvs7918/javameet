/*
1.	Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

* */

package seminar2.hw;

public class hw2_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        res.append("WHERE ");
        String js = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        
        if (Character.toString(js.charAt(0)).equals("{") && 
            Character.toString(js.charAt(js.length()-1)).equals("}")  ) {
            //убираем {} в исходной строке
            js = js.substring(1, js.length() - 1);
            //разбиваем json-строку через разделитель ",", получаем массив параметров qls
            String[] qls = js.split(",");
            for (int i = 0; i < qls.length; i++) {
                //каждый параметр - делаем trim  и расщепляем через :
                String[] curp = qls[i].trim().split(":");
                //параметры со значением null пропускаем
                if (!curp[1].trim().equals("\"null\"")) {
                    //в названии параметра убираем ""
                    curp[0] = curp[0].replaceAll("\"", "");
                    if (i == 0) {
                        //первый параметр выводим без разделителя AND
                        res.append(curp[0].trim() + "=" + curp[1].trim());
                    } else {
                        res.append(" AND " + curp[0].trim() + "=" + curp[1].trim());
                    }
                }
            }
        } else {
            System.out.println("Исходная строка не является json-строкой. Выполнение программы прервано!");
        }
        System.out.println(res);
    }
}
