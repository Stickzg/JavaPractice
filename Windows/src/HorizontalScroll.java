public class HorizontalScroll extends WindowDecorator {

    public HorizontalScroll(IWindow iwindow) {
        super(iwindow);
    }

    @Override
    public void display() {
        iwindow.display();
        System.out.print(" And I can be horizontally scrolled.");
    }
}
