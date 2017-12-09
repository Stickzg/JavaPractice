import com.flowacademy.filmek.Akciofilm;
import com.flowacademy.filmek.Film;

public class Oscargala {


    private int galaEve;
    private static String alapitoNeve = "Douglas Fairbanks";

    public Oscargala(int galaEve) {
        this.galaEve = galaEve;
    }

    static Film filmDaralo (String string) {
        String[] input = string.split(",");
        String cim = input[0];
        String rendezo = input[1];
        int gyartasDatuma = Integer.parseInt(input[2]);
        if(input.length==6) {
            boolean ferfi = Boolean.parseBoolean(input[3]);
            String hosNeve = input[4];
            int halalozas = Integer.parseInt(input[5]);
            return new Akciofilm(cim, rendezo, gyartasDatuma, ferfi, hosNeve, halalozas);
        } else if (input.length==3) {
            return new Film(cim, rendezo, gyartasDatuma);
        } else {
            System.out.println("Hibásak a bemeneti paraméterek.");
            System.exit(1);
            return null;
        }
    }

    public static void main(String[] args) {
        Film[] nevezettFilmek = new Film[args.length];
        int n=0;
        for (int i=0; i < args.length; i++) {
            nevezettFilmek[n] = filmDaralo(args[i]);
            n++;
        }

        for(Film film:nevezettFilmek){
             System.out.println(film.toString());
        }
    }

}
