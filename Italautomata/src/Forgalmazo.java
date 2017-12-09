import com.flowacademy.automata.Italautomata;
import com.flowacademy.automata.UresAutomata;

public class Forgalmazo {

    private static void information (UresAutomata uresAutomata) {
        System.out.println("A gépben rendelkezésre álló poharak száma: " +
                uresAutomata.getGepbenRendelkezesrealloPoharakSzama());
        System.out.println("Jelenleg " + uresAutomata.getBedobottPenzErteke() +
                "Ft van az autómatában.");
    }

    public static void main(String[] args) {

        int automatakszama = args.length/2;
        UresAutomata[] automatak = new UresAutomata[automatakszama];

        int n = 0;

        for( int i=0 ; i < args.length; i+=2 ) {
            automatak[n] = new Italautomata(Integer.parseInt(args[i]), Boolean.parseBoolean(args[i]));
            n++;
        }

        automatak[0].penztBedob(100);
        information(automatak[0]);
    }

}
