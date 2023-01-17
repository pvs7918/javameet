package lsp;

public class Test {
    public static void main(String[] args) {
        testRectangle(new Rectangle());

        testSquare(new Square());
        System.out.println("Все тесты пройдены успешно.");
    }

    private static void testRectangle(Rectangle rect) {
        rect.setWidth(2);
        rect.setHeight(3);
        mustEqual(rect.getArea(), 6); // 2 * 3 == 6
    }

    private static void testSquare(Square square) {
        square.setWidth(2);
        mustEqual(square.getArea(), 4); // 2 * 2 == 4
    }

    private static void mustEqual(float a, float b) {
        if (Math.abs(a - b) > 0.001f)
            throw new IllegalStateException(String.format("Must equal: %f != %f", a, b));
    }
}
