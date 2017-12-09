import com.flowacademy.vehicles.Exceptions.ElromlottException;
import com.flowacademy.vehicles.Gepkocsi;
import com.flowacademy.vehicles.Jarmu;
import com.flowacademy.vehicles.Kerekpar;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Kozlekedes {

    private static final String JARMUSER = "./datas/jarmuvek.ser";
    private static final String JARMUSER_LISTA = "./datas/jarmuveklista.ser";

    private static void jarmuSerialize(Jarmu j){
        try {
            FileOutputStream fileOut = new FileOutputStream(JARMUSER);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(j);
            out.close();
            fileOut.close();
        } catch (IOException i){
            i.fillInStackTrace();
        }
    }

    private static Jarmu jarmuDeSerialize(String s) {
        Jarmu jarmu = null;
        try {
            FileInputStream fileIn = new FileInputStream(s);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            jarmu = (Jarmu) in.readObject();
        } catch (IOException e) {
            e.fillInStackTrace();
        } catch (ClassNotFoundException e) {
            e.fillInStackTrace();
        }
        return jarmu;
    }

    private final static String input = "./datas/input.txt";

    public static void main(String[] args) throws ElromlottException {



        BufferedReader br;

        List<Jarmu> jarmuvek = new ArrayList<>();

        String line;
        try {

            br = new BufferedReader(new FileReader(input));

            while ((line = br.readLine()) != null) {
                String[] splittedLine = line.split(";");

                if ( splittedLine[0].equals("Kerekpar") ) {
                    int suly = Integer.parseInt(splittedLine[1]);
                    jarmuvek.add(new Kerekpar(suly));
                } else if (splittedLine[0].equals("Gepkocsi")) {
                    int suly = Integer.parseInt(splittedLine[1]);
                    int maxSebesseg = Integer.parseInt(splittedLine[2]);
                    jarmuvek.add(new Gepkocsi(suly,maxSebesseg));
                }

            }

        } catch (IOException e) {
            e.fillInStackTrace();
        }


        for (Jarmu jarmu : jarmuvek) {
            try {
                jarmu.indulas();
            } catch (ElromlottException e) {
                e.fillInStackTrace();
            }
        }

        Gepkocsi trabant = new Gepkocsi(500, 80);

        while (trabant.getUzemanyag() > 0) {
            System.out.println("Megy a trabi.");
            trabant.indulas();
        }



        for (Jarmu jarmu:jarmuvek) {
            jarmuSerialize(jarmu);
            System.out.println(jarmuDeSerialize(JARMUSER));
        }


    }


}
