public class Window implements IWindow{

    protected int width;
    protected int height;

    public void display () {
        System.out.print("Im a window!");
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



}
