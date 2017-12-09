import com.flowacademy.gep.ISzallito;
import com.flowacademy.gep.Markolo;
import com.flowacademy.gep.MunkaGep;
import com.flowacademy.gep.Teherauto;

import java.text.Collator;
import java.util.*;

public class MunkagépRendezés {

    public static void main(String[] args) {
        List<Teherauto> szallitok = new LinkedList<>();
        szallitok.add(new Teherauto(120,"Ifa", 200));
        szallitok.add(new Teherauto(200, "Mann", 300));
        szallitok.add(new Teherauto(300, "Ifa", 400));
        szallitok.add(new Teherauto(400, "Mann", 500));

        Collections.sort(szallitok);
        System.out.println(szallitok);



        Integer[] tomb = new Integer[4];
        tomb[0] = 2120;
        tomb[1] = 2100;
        tomb[2] = 350;
        tomb[3] = 50000;

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(tomb));
        System.out.println("Treeset Tartalma: " + treeSet);
        Set<Integer> set = new HashSet<>(Arrays.asList(tomb));
        List<Integer> lista = new ArrayList<>(Arrays.asList(tomb));
        System.out.println("Hashset Tartalma: " + set);
        Arrays.sort(tomb);

        Collections.sort(lista);

        for (Integer integer:tomb) {
            System.out.println(integer);
        }
        System.out.println(lista);


    }

}
