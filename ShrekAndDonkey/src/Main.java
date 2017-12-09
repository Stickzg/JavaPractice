import com.flowacademy.shrek.Karakter;
import com.flowacademy.shrek.Lovaskocsi;

public class Main {

    public static void main(String[] args) {

        Lovaskocsi lovaskocsi = new Lovaskocsi();

        lovaskocsi.beszall(new Karakter("Shrek", "mocsár"));
        lovaskocsi.beszall(new Karakter("Szamár", "hagymaföld"));

        lovaskocsi.setOtt("hagymaföld");
        lovaskocsi.setOtt("mocsár");

    }

}
