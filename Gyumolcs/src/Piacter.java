import com.flowacademy.piac.SzuperNagyi;
import com.flowacademy.piac.Vasarlo;
import com.flowacademy.piac.portéka.Gyumolcs;

public class Piacter {

    static int vasarlas(Gyumolcs[] gyumolcs, Vasarlo vasarlo){
        int koltott=0;
        for (int i=0; i < gyumolcs.length; i++) {
            koltott+=gyumolcs[i].getAr();
        }
        return koltott;
    }

    public static void main(String[] args) {
        if (args.length < 5) System.out.println("Kevés a bemeneti paraméter");

        for (int i = 0; i < args.length; i++) {
            int gyumolcskosar = Integer.parseInt(args[2]);
            new Vasarlo( new Gyumolcs[gyumolcskosar], Integer.parseInt(args[1]));
            new SzuperNagyi( new Gyumolcs[gyumolcskosar], Integer.parseInt(args[1]) );
        }

    }

}
