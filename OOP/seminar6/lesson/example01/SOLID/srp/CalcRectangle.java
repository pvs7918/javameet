package srp;

class CalcRectangle {
    protected int width;
    protected int height;

    public CalcRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // вычислительная задача
    public int getArea() {
        return width * height;
    }
}
