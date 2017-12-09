import com.flowacademy.raktar.Aru;
import com.flowacademy.raktar.Gyumolcs;
import com.flowacademy.raktar.Tejtermek;
import com.flowacademy.raktar.exceptions.RosszMinoseg;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public abstract class Leltar implements Aru {

    private static final String INPUTLINE = "./data/input.csv";

    public static void main(String[] args) {

        int stepper = 0;
        int raktarStepper = 0;
        int inputLength = 0;
        Aru[] raktar = new Aru[3];

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(INPUTLINE));
            String scannedLine;
            while ((scannedLine = br.readLine()) != null) {


                if ( stepper > 0 ) {
                    String[] splittedLine = scannedLine.split(";");
                    if ( splittedLine[0].equals("Gy") ) {
                        raktar[raktarStepper] = new Gyumolcs(splittedLine[1]);
                        raktarStepper++;
                    } else if ( splittedLine[0].equals("T") ) {
                        raktar[raktarStepper] = new Tejtermek(Long.parseLong(splittedLine[1]),
                                Long.parseLong(splittedLine[2]), splittedLine[3]);
                        raktarStepper++;
                    }
                }
                stepper++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String mehetAPolcra = "./data/mehet_a_polcra.csv";
        String kuka = "./data/kuka.csv";

        BufferedWriter bw = null;
        BufferedWriter kukaKiir = null;

        try {
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(mehetAPolcra), "utf-8"));

            kukaKiir = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(kuka), "utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            for (Aru aru : raktar) {
                if ( aru.joMeg() ) {
                    bw.write(aru.toString() + "\n");
                } else {
                    kukaKiir.write(aru.toString() + "\n");
                }
            }

        } catch (IOException | RosszMinoseg e) {
            e.printStackTrace();
        } finally {
            try {
                bw.flush();      
                kukaKiir.flush();
                bw.close();
                kukaKiir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

