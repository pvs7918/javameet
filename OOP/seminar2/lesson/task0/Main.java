package OOP.seminar2.lesson.task0;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
            new SquareShape (10f),
            new SquareShape (1f),
            new CircleShape (10f)
        );

        for (Shape shape : shapes) {
            System.out.printf("%s area=%f perimeter=%f\n", shape, shape.getArea(), shape.getPerimeter());
        }
    }
}
