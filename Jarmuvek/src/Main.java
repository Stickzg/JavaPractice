import com.flowacademy.vehicles.Gepkocsi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    static void osszehasonlit(Gepkocsi gepkocsi1, Gepkocsi gepkocsi2) {
        if ( gepkocsi1 == gepkocsi2 ) {
            System.out.println("egyezik");
        } else {
            System.out.println("nem egyezik");
        }

        System.out.println("==================");

    }

    static void osszeEqual (Gepkocsi gepkocsi1, Gepkocsi gepkocsi2) {
        if ( gepkocsi1.equals(gepkocsi2) ) {
            System.out.println("equals");
        } else {
            System.out.println("Not equals");
        }
        System.out.println("==================");
    }

    public static void main(String[] args) {

        Gepkocsi auto1 = new Gepkocsi(1000, 120);
        Gepkocsi auto2 = new Gepkocsi(1000, 120);
        Gepkocsi auto3 = auto1;
        Gepkocsi auto4 = new Gepkocsi(1000, 120);

        auto1.setSuly(1500);
        System.out.println(auto3.getSuly());


        osszehasonlit(auto1, auto2);
        osszehasonlit(auto1, auto3);

        osszeEqual(auto1, auto3);
        osszeEqual(auto1, auto2);

        List<Gepkocsi> kocsik = new ArrayList<>();

        kocsik.add(auto1);
        kocsik.add(auto2);
        kocsik.add(auto3);

        System.out.println(kocsik.contains(auto4));

        HashSet kocsiHalmaz = new HashSet();
        kocsiHalmaz.add(auto1);
        kocsiHalmaz.add(auto2);
        kocsiHalmaz.add(auto3);
        // kocsiHalmaz.add(auto4);

        System.out.println(kocsiHalmaz.size());

        System.out.println(kocsik.contains(auto4));
        System.out.println(kocsiHalmaz.contains(auto4));

        HashSet<String> gyumolcsok = new HashSet();
        gyumolcsok.add("alma");
        gyumolcsok.add("körte");
        gyumolcsok.add("gesztenye");
        System.out.println(gyumolcsok.contains("papaja"));


        HashSet kocsiszett2 = new HashSet();
        kocsiszett2.add(auto1);
        auto1.setSuly(3000);

        System.out.println(kocsiszett2.contains(auto1));
    }

}