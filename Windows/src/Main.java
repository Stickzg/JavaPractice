public class Main {

    public static void main(String[] args) {

        IWindow mywindow = new HorizontalScroll(new VerticalScroll(new Window()));
        mywindow.display();

    }

}
