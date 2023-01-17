package lsp;

public class Square extends RectangleShape {

    @Override
    public void setWidth(float width) {
        this.width = width;
        this.height = width; // квадрат должен оставаться квадратом
    }

    @Override
    public void setHeight(float height) {
        this.width = height;
        this.height = height; // квадрат должен оставаться квадратом
    }
}
