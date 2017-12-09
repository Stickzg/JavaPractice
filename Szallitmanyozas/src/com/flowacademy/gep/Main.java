package com.flowacademy.gep;

import com.flowacademy.gep.*;

import java.io.*;
import java.util.*;


public class Main {

    private static final String INPUTPATH = "./data/input.txt";
    private static final String SERIALIZEOUTPUT = "./data/output.ser";

    private static FastestMachines leggyorsabb (HashMap<Markolo, Teherauto> hashmap,
                                                int mennyit, int tav) {
        double leggyorsabb = Double.MAX_VALUE;
        double ido;

        Markolo bestMarkolo;
        Teherauto bestTruck;
        FastestMachines fastestMachines = null;


        for(Map.Entry<Markolo, Teherauto> entry : hashmap.entrySet()) {
            Markolo markolo = entry.getKey();
            Teherauto teherauto = entry.getValue();
            ido = markolo.atrakod(mennyit, tav , teherauto);
            if ( ido < leggyorsabb ) {
                fastestMachines = new FastestMachines(teherauto, markolo, leggyorsabb);
                leggyorsabb = ido;
            }

        }
        return fastestMachines;
    }


    public static void main(String[] args) {

        HashMap munkagepek = new HashMap();
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(INPUTPATH));
            String line;
            while ((line = br.readLine()) != null) {
                String[] splittedLine = line.split(" ");
                String markoloTipus = splittedLine[1];
                int markoloSuly = Integer.parseInt(splittedLine[2]);
                int markoloTeherbiras = Integer.parseInt(splittedLine[3]);
                String teherautoTipus = splittedLine[5];
                int teherautoSuly = Integer.parseInt(splittedLine[6]);
                int teherautoTeherbiras = Integer.parseInt(splittedLine[7]);

                munkagepek.put(new Markolo(markoloSuly, markoloTipus, markoloTeherbiras),
                        new Teherauto(teherautoSuly, teherautoTipus, teherautoTeherbiras));
            }
            br.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }


        Set entrySet = munkagepek.entrySet();
        Iterator it = entrySet.iterator();

        double bestTime = 0;
        double temp;

        try {
            while (it.hasNext()) {
                HashMap.Entry me = (HashMap.Entry)it.next();
                Markolo markolo = (Markolo) me.getKey();
                Teherauto teherauto = (Teherauto) me.getValue();
                temp = markolo.atrakod(600, 200, teherauto);
                if ( bestTime == 0 ) {
                    bestTime = temp;
                } else if ( temp < bestTime ) {
                    bestTime = temp;
                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        System.out.println(bestTime);

        try {
            FileOutputStream fileout = new FileOutputStream(SERIALIZEOUTPUT);
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(munkagepek);
            out.close();
            fileout.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }

        HashMap unserializedMunkagep = new HashMap();

        try {
            FileInputStream fileIn = new FileInputStream(SERIALIZEOUTPUT);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            unserializedMunkagep = (HashMap) objIn.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.fillInStackTrace();
        }
        int elemekSzama = 0;
        elemekSzama += unserializedMunkagep.values().size();
        elemekSzama += unserializedMunkagep.keySet().size();
        System.out.println(elemekSzama);

        for (Object key: unserializedMunkagep.keySet() ) {

        }
    }
}

