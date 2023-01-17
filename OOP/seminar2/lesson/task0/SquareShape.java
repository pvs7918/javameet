package task0;

public class SquareShape implements Shape {
    private float side;

    public SquareShape(float side) {
        this.side = side;
    }

    @Override
    public float getArea () {  // узнать площадь
        return side * side;
    }

    @Override
    public float getPerimeter () {  // узнать периметр
        return 4 * side;
    }

    @Override
    public String toString() {
        return "SquareShape [side=" + side + "]";
    }
}
