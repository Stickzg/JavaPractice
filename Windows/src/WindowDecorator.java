abstract public class WindowDecorator implements IWindow {

    protected IWindow iwindow;

    @Override
    public int getWidth() {
        return iwindow.getWidth();
    }

    @Override
    public int getHeight() {
        return iwindow.getHeight();
    }

    public WindowDecorator(IWindow iwindow) {
        this.iwindow = iwindow;
    }

    abstract public void display();

}
