package srp;

public class GraphicRectangle extends CalcRectangle {

    public GraphicRectangle(int width, int height) {
        super(width, height);
        // TODO Auto-generated constructor stub
    }

    // графическая задача
    public void draw() {
        GraphicsLibrary.drawRectangle(0, 0, width, height, '#');
    }
}
