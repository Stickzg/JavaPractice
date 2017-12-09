public class VerticalScroll extends WindowDecorator {

    public VerticalScroll(IWindow iwindow) {
        super(iwindow);
    }

    @Override
    public void display() {
        iwindow.display();
        System.out.print(" And I can be vertically scrolled.");
    }
}
