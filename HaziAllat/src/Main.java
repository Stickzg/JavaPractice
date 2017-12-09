import com.flowacademy.kedvencek.Haziallat;
import com.flowacademy.kedvencek.Kutya;
import com.flowacademy.kedvencek.Macska;
import com.flowacademy.kedvencek.exceptions.HaziallatException;
import com.flowacademy.kedvencek.views.Menu;

import java.io.*;

public class Main {

    final static String INPUT = "./data/input.txt";

    public static void main(String[] args) {

        BufferedReader br;

        int stepper = 0;
        Haziallat[] haziallatok = null;
        int haziallatokStepper = 0;
        String[] firstLineSplit;

        try {
            br = new BufferedReader(new FileReader(INPUT));
            String line;

            while ((line = br.readLine()) != null) {
                if ( stepper == 0 ) {
                    haziallatok = new Haziallat[Integer.parseInt(line)];
                } else if ( stepper == 1 ) {
                    firstLineSplit = line.split(" ");

                    int temp = 0;

                    for (int i = 0; i < firstLineSplit.length; i += 2) {
                        String nev = firstLineSplit[i + 1];
                        if ( firstLineSplit[i].equals("Macska") ) {
                            haziallatok[temp] = new Macska(nev);
                        } else if ( firstLineSplit[i].equals("Kutya") ) {
                            haziallatok[temp] = new Kutya(nev);
                        }
                        temp++;
                    }
                } else {
                    String[] methodSplit = line.split(";");
                    if ( methodSplit[1].equals("megetet") ) {
                        haziallatok[Integer.parseInt(methodSplit[0])].megetet();
                    } else if ( methodSplit[1].equals("megsimogat") ) {
                        haziallatok[Integer.parseInt(methodSplit[0])].simogat();
                    }
                }
                stepper++;
            }
            br.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        } catch (HaziallatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("data/output.txt"));
            for (Haziallat haziallat : haziallatok) {
                if ( haziallat.jokedvuE() ) {
                    bw.write(haziallat.getNev() + " boldog.");
                }

            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
