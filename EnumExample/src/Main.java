import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Example> examples = new ArrayList<>();
        examples.add(new Example(Level.HIGH, 2));
        examples.add(new Example(Level.MEDIUM, 1));
        examples.add(new Example(Level.HIGH, 2));

        for (Example example : examples) {
            if ( example.getLevel().equals(Level.HIGH) ) {
                example.getAnInt();
                example.getLevel();
            }
        }

    }

}
