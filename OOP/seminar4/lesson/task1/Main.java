/*Пара хранит в себе два значения произвольных типов, например,
Pair<Integer, String> или Pair<Float, Double>. Напишите самодельный класс Pair, 
используя обобщения. У него должны быть конструкторы, геттеры и toString ().

Тройка хранит в себе три значения произвольных типов, например,
Triple<Integer, Integer, Integer>. Напишите самодельный класс Triple.

Напишите функцию, которая возвращает тройку случайных целых чисел в диапазоне 
от 0 до 255 (то есть случайный цвет).
*/
package OOP.seminar4.lesson.task1;

import java.util.Random;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(10, "dfgd");
        System.out.println(p1);

        Triple<Integer, Integer, Integer> tr1 = new Triple<>(10, 15, 20);
        System.out.println(tr1);

        tr1 = getRndTriple();

        System.out.println(tr1);
    }

    public static Triple<Integer,Integer,Integer> getRndTriple() {
        Random rnd = new Random();
        Triple<Integer,Integer,Integer> tr1 = new Triple<Integer,Integer,Integer>(rnd.nextInt(20),
            rnd.nextInt(20), rnd.nextInt(20));
        return tr1;
    }
}